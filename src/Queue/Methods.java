package Queue;

public class Methods implements QueueOperation {
    private QueueClass head = null;
    private QueueClass tail = null;
    private QueueClass prev = null;
    @Override
    public void enqueue(int data) {

        QueueClass node = new QueueClass(data);

        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            prev = tail;
            tail = node;
        }

    }

    @Override
    public int dequeue() {

        int  data;
        if(head == null)
            return -1;
        else{
            data = head.data;
            head = head.next;
        }
        return data;
    }

    @Override
    public void printQueue() {
        if(head == null)
            System.out.println("Empty Queue");
        else{
            QueueClass temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
