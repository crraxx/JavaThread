package Practice.聊天功能;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {

    Socket socket;
    DataOutputStream out;
    Scanner input = new Scanner(System.in);

    public SendThread(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        while (true) {
            String msg = input.next();
            try {
                out.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
