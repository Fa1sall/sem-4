import java.io.*;
import java.net.*;

public class Client{
    public static void main(String args[]) throws IOException{
        try{
            String str;
            Socket client = new Socket("localhost",6555);
            PrintStream ps = new PrintStream(client.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the command:");
            str = br.readLine();
            ps.println(str);
            client.close();
        } catch(IOException e){
            System.out.println("Error");
        }
    }
}