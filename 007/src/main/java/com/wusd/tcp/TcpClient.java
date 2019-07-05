package com.wusd.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * socket客户端
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        System.out.println("tcp客户端开始发送数据");
        //获取socket 三次握手
        Socket socket = new Socket("127.0.0.1", 8080);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        String str = "吴盛东爱李洁";
        //输出流写入
        outputStream.write(str.getBytes());
        socket.close();
    }
}
