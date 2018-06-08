/**
 * 
 * @author mingfei.z 2018年5月24日 下午5:59:19
 */
package com.mfzhang.mayi.test.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author mingfei.z
 */
public class SocketServer {

	public static void main(String[] args) {
		try {
			// 创建 serverSocket 监听8080端口
			ServerSocket serverSocket = new ServerSocket(8080);
			
			// 等待接收请求
			Socket socket = serverSocket.accept();
			
			// 接收到请求后，使用socket进行通信，创建BufferedReader 用于读取数据
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String lineVal = br.readLine();
			System.out.println("------------socket服务接收到数据：" + lineVal);
			
			// 创建PrintWriter 用于发送数据到客户端
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("客户端接收到的数据是：" + lineVal);
			
			pw.flush();
			
			// 关闭资源
			pw.close();
			br.close();
			socket.close();
			serverSocket.close();
		} catch (Exception e) {
			System.err.println("==========异常，" + e);
		}
	}
	
}
