package LinedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList head = null;
        LinkedList node1 = new LinkedList(2);
        LinkedList node2 = new LinkedList(3);
        LinkedList node3 = new LinkedList(4);
        LinkedList node4 = new LinkedList(5);
        LinkedList node5 = new LinkedList(6);
        LinkedList node6 = new LinkedList(7);

        Methods m = new Methods();
        LinkedList head1 = m.addAtStart(node1,head);
        LinkedList head2 = m.addAtStart(node2,head1);
        LinkedList head3 = m.addAtStart(node3,head2);
        LinkedList head4 = m.addAtStart(node4,head3);
        LinkedList head5 = m.addAtStart(node5,head4);

        m.printLinkedList(head5);

        LinkedList head6 = m.addAtIndex(1,head5,node6);

        m.printLinkedList(head6);

        LinkedList head7 = m.deleteFromIndex(1, head6);

        m.printLinkedList(head7);
        int lenght = m.findLength(head7);
        System.out.println(lenght);
        LinkedList head8 =m.reverseList(head7);
        m.printLinkedList(head8);
    }

}
