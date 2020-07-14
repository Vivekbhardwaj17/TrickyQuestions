package Stack;

public class MethodsStack implements StackOperation {
    @Override
    public StackClass push(int data, StackClass top) {

        StackClass node = new StackClass(data);

        if(top == null){
            top = node;
        }

        else {
            node.next = top;
            top = node;
        }
        return top;
    }

    @Override
    public StackClass pop(StackClass top) {
        int data =top.data;
        if(top != null){
            top = top.next;
        }
        System.out.println("pop: "+data);
        return top;
    }

    @Override
    public void print(StackClass top) {
        if(top == null){
            System.out.println("empty stack");
        }
        else{
            StackClass temp = top;
            System.out.print("top : ");
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
