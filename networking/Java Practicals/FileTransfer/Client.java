package FileTransfer;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4999);

        File file = new File("C:/Users/faisa/Desktop/Uni/Assignments/net/practicals/Java Practicals/FileTransfer/Sent.txt");
        FileInputStream in = new FileInputStream(file);
        OutputStream out = socket.getOutputStream();

        byte[] bytes = new byte[16*1024];
        int count;
        while ((count = in.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }

        System.out.println("File Sent");
        out.close();
        in.close();
        socket.close();
    }
}