package Practice.聊天功能;

import java.io.IOException;
import java.net.Socket;

public class C {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        ServerThread s = new ServerThread(socket);
        s.setName("服务器端");
        s.start();

        SendThread send = new SendThread(socket);
        send.start();
    }
}
