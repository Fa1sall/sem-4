package FileTransfer;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4999);
        Socket socket = serverSocket.accept();

        byte[] bytes = new byte[16*1024];
        InputStream in = socket.getInputStream();
        FileOutputStream out = new FileOutputStream("C:/Users/faisa/Desktop/Uni/Assignments/net/practicals/Java Practicals/Sent.txt");

        int count;
        while ((count = in.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }

        System.out.println("File Received");
        out.close();
        socket.close();
        serverSocket.close();
    }
}