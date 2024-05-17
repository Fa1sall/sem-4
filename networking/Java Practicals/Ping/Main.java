import java.io.*;
import java.net.*;

class Ip{
    public static void sendPingRequest(String ipAddress) throws UnknownHostException, IOException{
        InetAddress ip = InetAddress.getByName(ipAddress);
        System.out.println("Sending ping request to : " + ipAddress);
        if(ip.isReachable(5000)){
            System.out.println("Host in reachable");
        }else{
            System.out.println("Host is unreachable");
        }
    }
}

public class Main{
    public static void main(String args[]) throws UnknownHostException, IOException{
        String ipAddress = "127.0.0.1";
        Ip.sendPingRequest(ipAddress);
        ipAddress = "128.1.3.1";
        Ip.sendPingRequest(ipAddress);
    }
}