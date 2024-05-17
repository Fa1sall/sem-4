package ServerCommand;

import java.io.*;
import java.net.*;

public class Client {
   public static void main(String args[]){
    try{
        String str;
        Socket s = new Socket("localhost",6666);
        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a command:");
        str=br.readLine();
        ps.println(str);
        s.close();
       }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
       }
   }
}
