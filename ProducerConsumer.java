// 6403052412103
// Poramin Boonchusawad
public class ProducerConsumer {
    public static void main(String[] args) {
        WarehouseV3 w =new WarehouseV3();
        ProducerV1 p =new ProducerV1(w);
        ConsumerV1 c =new ConsumerV1(w);
        p.start();c.start();
    }
}
