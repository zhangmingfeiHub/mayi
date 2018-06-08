/**
 * 
 * @author mingfei.z 2018年5月28日 下午3:25:59
 */
package com.mfzhang.mayi.test.basic;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

import org.springframework.util.StringUtils;

/**
 * 
 * @author mingfei.z
 */
public class NioSocketServer {

	public static void main(String[] args) {
		System.out.println("NioSocket 服务端开始");
		
		try {
			// 创建 ServerSocketChannel
			ServerSocketChannel ssc = ServerSocketChannel.open();
			// 监听8080端口
			ServerSocket ss = ssc.socket();
			ss.bind(new InetSocketAddress(8080));
			
			// 设置为非阻塞
			ssc.configureBlocking(false);
			
			// 为 ServerSocketChannel 注册 Selector 选择器
			Selector selector = Selector.open();
			// 操作类型：SelectionKey.OP_ACCEPT - 接收请求操作
			// SelectionKey.OP_CONNECT - 连接
			// SelectionKey.OP_READ - 读数据操作
			// SelectionKey.OP_WRITE - 写操作
			ssc.register(selector, SelectionKey.OP_ACCEPT);
			
			// 创建自定义处理器
			Handler handler = new Handler(1024);
			
			while(true) {
				// selector.select() 等待请求，每次等待阻塞3s，超过3s continue 线程走下个循环
				// 指定时间内接收到了请求，则返回可以处理的请求数，如果超时则返回0
				// 如果select()方法传入的是0或者不传参数，将一直阻塞，直到出现请求
				int reqCount = selector.select(3000);
				if (reqCount == 0) {
					System.out.println("等待请求超时......");
					continue;
				}
				
				System.out.println("开始处理请求......reqCount：" + reqCount);
				
				// 获取待处理的 SelectionKey
				// SelectionKey 中包含channel，selector
				Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
				while(keyIterator.hasNext()) {
					SelectionKey selectionKey = keyIterator.next();
					
					// selectionKey.isAcceptable()，selectionKey.isReadable() 判断操作类型
					try {
						// 接收到请求时
						if (selectionKey.isAcceptable()) {
							handler.handleAccept(selectionKey);
						}
						
						// 读取数据
						if (selectionKey.isReadable()) {
							handler.handleRead(selectionKey);
						}
					} catch (Exception e) {
						e.printStackTrace();
						keyIterator.remove();
						continue;
					}
					
					// 处理完后，从待处理的 keyIterator 迭代器中删除当前使用的 selectionKey
					keyIterator.remove();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("NioSocket 服务端结束");
	}

	/**
	 * 私有的处理器类
	 * 
	 * @author mingfei.z
	 */
	private static class Handler {
		private int bufferSize = 1024;
		private String localCharset = "UTF-8";
		
		public Handler() {}
		
		public Handler(int bufferSize) {
			this(bufferSize, null);
		}

		public Handler(String localCharset) {
			this(-1, localCharset);
		}
		
		public Handler(int bufferSize, String localCharset) {
			if (bufferSize > 0) {
				this.bufferSize = bufferSize;
			}
			
			if (!StringUtils.isEmpty(localCharset)) {
				this.localCharset = localCharset;
			}
		}
		
		public void handleAccept(SelectionKey key) throws Exception {
			SocketChannel socketChannel = ((ServerSocketChannel) key.channel()).accept();
			socketChannel.configureBlocking(false);
			socketChannel.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(bufferSize));
		}

		public void handleRead(SelectionKey key) throws Exception {
			// 获取 SocketChannel
			SocketChannel socketChannel = (SocketChannel) key.channel();
			
			// 获取buffer 并重置
			ByteBuffer byteBuffer = (ByteBuffer)key.attachment();
			byteBuffer.clear();
			
			if (socketChannel.read(byteBuffer) == -1) { // 没有读到内容，则关闭
				socketChannel.close();
			} else {
				// 将 buffer 转为读状态
				byteBuffer.flip();
				
				// 将从 buffer 中接受到的（读到的）内容按 localCharset 格式编码后保存到变量中
				String recievedMsg = Charset.forName(localCharset).newDecoder().decode(byteBuffer).toString();
				System.out.println("从客户端接收到：" + recievedMsg);
				
				// 返回数据到客户端
				String sendMsg = "接收到数据【" + recievedMsg + "】";
				byteBuffer = ByteBuffer.wrap(sendMsg.getBytes(localCharset));
				socketChannel.write(byteBuffer);
				
				// 关闭资源
				socketChannel.close();
			}
			
		}
	}

}
