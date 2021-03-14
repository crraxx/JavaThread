package Practice.聊天功能;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class S {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器等待连接");
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");

        ServerThread s = new ServerThread(socket);
        s.setName("客户端");
        s.start();

        SendThread send = new SendThread(socket);
        send.start();

    }
}
