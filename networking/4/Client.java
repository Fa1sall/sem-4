import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        try{
            Socket s = new Socket("localhost",6666);
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                dout.writeUTF(scanner.nextLine());
                dout.flush();
                dout.close();
                s.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
