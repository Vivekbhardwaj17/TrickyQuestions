package Stack;

public interface StackOperation {
    StackClass push(int data, StackClass top);
    StackClass pop(StackClass top);
    void print(StackClass top);
}