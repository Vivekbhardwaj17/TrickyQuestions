package Queue;

public class MainQueue {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.enqueue(2);
        m.enqueue(8);
        m.printQueue();
        m.dequeue();
        m.printQueue();
        m.enqueue(6);
        m.printQueue();
    }
}
