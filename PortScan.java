// 6403052412103
// Poramin Boonchusawad

import java.net.*;
import java.io.*;

public class PortScan {

    public static void main(String[] args) {
         if(args.length != 1 ){
       System.out.println("Usage : java JavaIP <hostname/IP>");
       System.exit(0);
   }       
        for (int i = 70; i <= 100; i++) {
            try {

                Socket socket = new Socket(args[0], i);
                System.out.println("Port = " + i + " open");
                
            } catch (Exception e) {  }
        }
    }
}
