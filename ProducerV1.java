// 6403052412103
// Poramin Boonchusawad

import java.util.*;

public class ProducerV1 extends Thread {

    WarehouseV3 w;//WarehouseV1

    public ProducerV1(WarehouseV3 w) {//WarehouseV1
        this.w = w;
    }

    public void run() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int id = r.nextInt(100);
            System.out.println("Producer: try to put product with id = " + id);
            w.put(id);
            System.out.println("Producer: put product with id = " + id);
            try {
                Thread.sleep(r.nextInt(1000));
            } catch (Exception e) {
            }
        }
    }
}
