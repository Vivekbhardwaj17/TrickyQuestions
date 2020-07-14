package LinedList;

public interface actionPerfomed {
    LinkedList head = null;
    LinkedList addAtLast(LinkedList node,LinkedList head);
    LinkedList addAtStart(LinkedList node,LinkedList head);
    LinkedList addAtIndex(int index,LinkedList head, LinkedList node);
    LinkedList deleteFromLast(LinkedList head);
    LinkedList deletefirstNode(LinkedList head);
    LinkedList deleteFromIndex(int index,LinkedList head);
    void printLinkedList(LinkedList head);
    int findLength(LinkedList head);
    LinkedList reverseList(LinkedList head);

}
