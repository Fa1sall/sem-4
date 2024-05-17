package ServerCommand;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]){
        try{
            String str;
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            str=br.readLine();
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(str);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
