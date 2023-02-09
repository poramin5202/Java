// 6403052412103
// Poramin Boonchusawad
import java.io.*;
public class JavaBinaryCopy {
    public static void main(String[] args) {
        
           if(args.length != 2 ){
       System.out.println("Usage : java JavaBinaryCopy <source file> <destination file>");
       System.exit(0);
   } 
           try{
               int n;
               byte[]b= new byte[16];
               File f = new File (args[0]);
           if(!f.exists()){
            System.out.println("Usage : java JavaBinaryCopy <source file> <destination file>");
            System.exit(0);
        }
               FileInputStream fin = new FileInputStream(f);
               String j="";
               while(( n = fin.read(b)) > 0){
                   String data = new String(b,0,n);
                   j+=data;           
               }
               String msg = j;
                   File fo = new File(args[1]);
                   FileOutputStream fout = new FileOutputStream(fo);
                   byte[] k = msg.getBytes();
                   fout.write(k);
                   fout.close();
               fin.close();
           } catch(Exception e){
            e.printStackTrace();
           }     
    }
}