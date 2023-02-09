// 6403052412103
// Poramin Boonchusawad
import java.io.*;
public class JavaTextCopy {
    public static void main(String[] args) {
       if(args.length != 2 ){
       System.out.println("Usage : java JavaTextCopy <source file> <destination file>");
       System.exit(0);
   } 
       try{
               String msg;
               String j="";
               File f = new File(args[0]);
                if(!f.exists()){
            System.out.println("Usage : java JavaTextCopy <source file> <destination file>");
            System.exit(0);
        }
               FileInputStream fin = new FileInputStream(f);
               InputStreamReader ir = new InputStreamReader(fin);
               BufferedReader br = new BufferedReader(ir);
               
               while((msg = br.readLine()) != null ){
                 j=j+msg+"\n";
               }
                File fo = new File(args[1]);
                  FileOutputStream fout = new FileOutputStream(fo);
                  PrintWriter pout = new PrintWriter(fout);
                  pout.print(j);
                  pout.flush();
                  pout.close();
               fin.close();
       } catch(Exception e) {
           e.printStackTrace();
       } 
    }
}
