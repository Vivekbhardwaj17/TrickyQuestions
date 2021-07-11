package LinedList;

public class methodImplementation extends LinkedList {
   // LinkedList myList = new LinkedList();
    private LinkedList head;
    public void setHead(LinkedList head){this.head=head;}
    public LinkedList addAtStart(LinkedList node){
        if(head==null)return head;
        node.next=head;
        head=node;
        return  head;
    }
    public LinkedList addAtEnd(LinkedList node){
        if(head==null)return  node;
        LinkedList temp=head;
        while(temp.next!=null){temp=temp.next;}
        temp.next=node;
        return head;
    }
    public  int findLength(LinkedList head){
        int len=0;
        if(head==null)return 0;
        while(head!=null){
            len++;head=head.next;
        }return len;
    }
    public LinkedList addAtIndex(LinkedList node,int index,LinkedList head){

        methodImplementation list = (methodImplementation)head;
        if(list.findLength(head)<index){
            System.out.println("Invalid index");

        }
        else if(index==0)
            list.addAtStart(node);
        else if(index==list.findLength(head))list.addAtEnd(node);
        else{
        LinkedList temp=head;
        while (temp.next!=null&&(index-->=0)){
            temp=temp.next;
        }
        temp.next=node;
        }
        return head;
    }
    public LinkedList reverse(LinkedList head){
        LinkedList curr=head;
        LinkedList nextnode=head;
        LinkedList prev = null;
        while(curr!=null){
            nextnode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev.next;
    }
    public LinkedList removeNodeWithoutHead(LinkedList node){
        while (node.next!=null){
            node.data=node.next.data;
            node=node.next;
        }
        node.next=null;
        return this.head;
    }
    public void printList(LinkedList node){
        if(node==null) System.out.println("Empty list");
        else{
            System.out.print("List:");
            while (node!=null)
                System.out.print(node.data+" ");
        }
        System.out.println();
    }
    public LinkedList removeLoop(LinkedList head){
         return null;
    }
    public  boolean detectLoop(LinkedList head){ return false;}
    public LinkedList removeDuplicateNodes(LinkedList head){return null;}

}
