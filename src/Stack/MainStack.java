package Stack;

public class MainStack {
    public static void main(String[] args) {
        MethodsStack m = new MethodsStack();
        StackClass top1 = m.push(3,null);
        StackClass top2 = m.push(4,top1);
        StackClass top3 = m.push(5,top2);
        StackClass top4 = m.push(6,top3);
        StackClass top5 = m.push(7,top4);
        StackClass top6 = m.push(8,top5);
        m.print(top6);
        System.out.println("After pop");
        StackClass top7 = m.pop(top6);
        m.print(top7);
        System.out.println("After pop");
        StackClass top8 = m.pop(top7);
        m.pop(top8);
        m.print(top8);

    }
}
