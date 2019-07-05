package com.wusd.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 1.是面向无连接,将数据及源的封装成数据包中,不需要建立连接
 * 2.每个数据报的大小限制在64k内
 * 3.因无连接,是不可靠协议
 * 4.不需要建立连接,速度快
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("udp服务端启动");
        //指定socket运行端口
        DatagramSocket ds = new DatagramSocket(8080);
        //获取的报文数据缓存
        byte[] bf = new byte[1024];
        //报文
        DatagramPacket dp = new DatagramPacket(bf, bf.length);
        //收取报文,具有阻塞效果
        ds.receive(dp);
        //解析报文
        System.out.println("来源:" + dp.getAddress().getHostAddress() + ",port:" + dp.getPort());
        String receive = new String(dp.getData(), 0, dp.getLength());
        System.out.println("数据:" + receive);
        //关闭程序
        ds.close();
    }
}
