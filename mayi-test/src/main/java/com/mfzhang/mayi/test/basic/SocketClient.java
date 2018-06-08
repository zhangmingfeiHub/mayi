/**
 * 
 * @author mingfei.z 2018年5月24日 下午5:59:40
 */
package com.mfzhang.mayi.test.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @author mingfei.z
 */
public class SocketClient {

	public static void main(String[] args) {
		
		try {
			String message = "来自客户端的消息";
			
			// 创建客户端socket，连接到本机8080端口
			Socket socket = new Socket("localhost", 8080);
			
			// 创建读写数据对象
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 发送消息
			pw.println(message);
			pw.flush();
			
			String lineVal = br.readLine();
			System.out.println("--------socket客户端读取到的数据：" + lineVal);
			
			// 关闭资源
			pw.close();
			br.close();
			socket.close();
		} catch (Exception e) {
			System.err.println("----------发生异常：" + e);
		}
	}

}
