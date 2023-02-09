// 6403052412103
// Poramin Boonchusawad
import java.io.*;
public class JavaTwoThread implements  Runnable  {
     int s,e,sum=0; long sl;    
        public JavaTwoThread(int s, int e,long sl){
          this.s = s;
          this.e = e;
          this.sl=sl;
      }
    public void run(){     
            for(int i=s;i<=e;i++){
                 sum += i;
                 if(i==e){
                     try {
                         Thread.sleep(sl);
                     } catch (Exception e) {}
                 }
            }       
    } 
    public int result(){
        return sum;
    }
    
    public static void main(String[] args) {
        int summation = 0;
        
           JavaTwoThread t1 = new JavaTwoThread(1,10000,5000);
           JavaTwoThread t2 = new JavaTwoThread(10001,20000,10000);
           Thread tt1 = new Thread(t1);
            Thread tt2 = new Thread(t2);
            try{
           tt1.start(); 
           tt1.join();
           tt2.start();
           tt2.join();
           summation = t1.result()+t2.result();
            }catch(Exception e){}
           System.out.println("Thread1 + Thread2 = "+ summation );
           }     
    }

