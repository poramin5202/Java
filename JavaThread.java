// 6403052412103
// Poramin Boonchusawad
public class JavaThread extends Thread {
      String h = "HelloWorld";
      int n;
    public JavaThread(int n){
          this.n = n;
      }
    public void run(){     
            System.out.println(n+" "+h);
    }
    
    public static void main(String[] args) {
            
           int num = Integer.parseInt(args[0]); 
           JavaThread []t = new JavaThread[num];
           for(int i =0;i<t.length;i++){ 
               t[i] = new JavaThread(i);
           t[i].start();
           }
           
    }
  }
    

