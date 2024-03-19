import java.io.*;
import java.net.*;

public class Server {
    
    public static void main(String args[]) throws IOException{

        try{
            String str;
            ServerSocket server = new ServerSocket(6555);
            Socket s = server.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            str = br.readLine();
            Runtime r=Runtime.getRuntime();
            Process p = r.exec(str);
            server.close();
        } catch(IOException e){
            System.out.println("Error");
        }
    }
}
