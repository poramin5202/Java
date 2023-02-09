// 6403052412103
// Poramin Boonchusawad
public class WarehouseV2 {
volatile int productID;
volatile boolean empty = true;
public synchronized boolean put(int productID) {
if(!empty) return false;
empty = false;
this.productID = productID;
return true;
}
public synchronized int take() {
while (empty) {return -1;}
int result = this . productID;
empty = true;
return result;
}
}