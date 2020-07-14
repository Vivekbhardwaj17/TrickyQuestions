package LinedList;

public class Methods implements actionPerfomed {

    public Methods() {
    }

    @Override
    public  LinkedList addAtIndex(int index, LinkedList head, LinkedList node) {

        LinkedList temp = head;

        LinkedList nextNextPoint = head.next;

        if(index <= 1){
            node.next = head;
            head = node;
        }

        else {
            while (index > 2 && temp.next != null) {
                temp = temp.next;
                nextNextPoint = temp.next;
                index--;
            }
        }

        temp.next = node;
        node.next = nextNextPoint;

        return head;
    }

    @Override
    public LinkedList addAtLast(LinkedList node, LinkedList head) {

        LinkedList temp = head;

        if(head == null){
            head = node;
        }
        else {

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
        return head;
    }

    @Override
    public LinkedList addAtStart(LinkedList node, LinkedList head) {

        if(head == null) {
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }

        return head;
    }

    @Override
    public LinkedList deletefirstNode(LinkedList head) {

        LinkedList temp = head;
        if(head != null){
            temp = head.next;
        }
        return temp;
    }

    @Override
    public LinkedList deleteFromIndex(int index, LinkedList head) {

        if(index <= 1){

            return  head.next;

        }
        else{
            LinkedList temp = head;

            while(index > 2 && temp.next.next != null){
                temp = temp.next;
                index --;
            }

            temp.next = temp.next.next;

        }
        return head;
    }


    @Override
    public LinkedList deleteFromLast(LinkedList head) {

        if(head.next == null){
            head = null;
        }
        else{

            LinkedList temp = head;

            while (temp.next.next != null){
                temp = temp.next;
            }

            temp.next = null;

        }

        return head;
    }

    @Override
    public void printLinkedList(LinkedList head) {

        LinkedList temp = head;

        while (temp != null){

            System.out.print(temp.data+" ---> ");

            temp = temp.next;

        }

        System.out.println("null");
    }

    @Override
    public int findLength(LinkedList head) {

        int length=0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }

    @Override
    public LinkedList reverseList(LinkedList head) {
        LinkedList prev = null;
        LinkedList temp = head;
        LinkedList next = head;

        while (temp != null ){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
