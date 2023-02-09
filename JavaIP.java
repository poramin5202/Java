// 6403052412103
// Poramin Boonchusawad
import java.net.*;
import java.io.*;
public class JavaIP {
  public static void main(String[] args) {
        if(args.length != 1 ){
       System.out.println("Usage : java JavaIP <hostname/IP>");
       System.exit(0);
   }       
        try{
            InetAddress ad = InetAddress.getByName(args[0]);
            System.out.println("HostName = "+ad.getHostName());
            System.out.println("IP = "+ad.getHostAddress());
        }catch(Exception e){
            System.out.println("Error: unknownhost or IP address");
        }
    }
}