package Practice.聊天功能;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread {
    Socket socket;
    DataInputStream in;
    Scanner input = new Scanner(System.in);

    public ServerThread(Socket socket) throws IOException {
        this.socket = socket;
        this.in = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        while (true) {
            try {
                String msg = in.readUTF();
                System.out.println(Thread.currentThread().getName()+"说"+msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
