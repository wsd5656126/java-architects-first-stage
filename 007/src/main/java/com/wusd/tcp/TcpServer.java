package com.wusd.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket服务器端
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("socket服务器端开始启动...");
        ServerSocket serverSocket = new ServerSocket(8080);
        //接收socket
        Socket accept = serverSocket.accept();
        //获取输入流
        InputStream inputStream = accept.getInputStream();
        byte[] buf = new byte[1024];
        //输入流读内容到数组中
        int length = inputStream.read(buf);
        String str = new String(buf, 0, length);
        System.out.println(str);
        serverSocket.close();
    }
}
