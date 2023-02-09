// 6403052412103
// Poramin Boonchusawad

public class WarehouseV1 {

    volatile int productID;
    volatile boolean empty = true;

    public synchronized void put(int productID) {
        while (!empty) {
        }
        empty = false;
        this.productID = productID;
    }

    public synchronized int take() {
        while (empty) {
        }
        int result = this.productID;
        empty = true;
        return result;
    }
}
