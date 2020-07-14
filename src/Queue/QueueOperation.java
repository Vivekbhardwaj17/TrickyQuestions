package Queue;

public interface QueueOperation {
    void enqueue(int data);
    int dequeue();
    void printQueue();
}
