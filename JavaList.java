// 6403052412103
// Poramin Boonchusawad
import java.io.*;
public class JavaList {
    public static void main(String[] args) {
    
        if(args.length != 1 ){
       System.out.println("Usage : JavaList <File/Directory Name>");
       System.exit(0);
   }       
        File f = new File(args[0]);
       //FileInputStream fin = new FileInputStream(f);
        if(!f.exists()){
            System.out.println("File not found");
            System.exit(0);
        }
       if(f.isFile()){
           System.out.println("File size = "+f.length()+" bytes");
       }
       else if(f.isDirectory()){
           File list[] = f.listFiles();
           for(int i =0;i<list.length;i++){
               if(list[i].isFile()){
               System.out.println(list[i].getName()+"is a file");
               }
               if(list[i].isDirectory()){
               System.out.println(list[i].getName()+"is a directory");
               }
           }
          }      
    }
 
}
