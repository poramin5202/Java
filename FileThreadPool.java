// 6403052412103
// Poramin Boonchusawad

import java.io.*;
import java.util.concurrent.*;
public class FileThreadPool implements Runnable {
    int n;
    public FileThreadPool(int n) { this.n = n; }
    public void run() {
        System.out.println(n + " -> " + n * n);
        try {
            Thread.sleep(2000);
        } catch (Exception e) { }
    }
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                System.out.println("Usage : FilessThreadPool <File.txt name>");
                System.exit(0);
            }
            File f = new File(args[0]);
            if (!f.exists()) {
                System.out.println("Error – file not found");
                System.exit(0);
            }
            if (f.isFile()) {
                String msg;
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                ExecutorService es = Executors.newFixedThreadPool(3);
                while ((msg = br.readLine()) != null) {
                    FileThreadPool num = new FileThreadPool(Integer.parseInt(msg));
                    es.execute(num);
                }
                es.shutdown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
