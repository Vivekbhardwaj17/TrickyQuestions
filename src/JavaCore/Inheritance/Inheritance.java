package JavaCore.Inheritance;

public class Inheritance {

    //fields
    int a;//can be inherit
    private int b;
    protected int c;//can be inherit
    static int d;

    //methods
    static void method1(int a){}
    public static void method2(int a){}
    private static void method3(int a){}
    protected static void method4(int a){}
    void method5(int a){}
    public  void method6(int a){}
    private  void method7(int a){}
    protected  void method9(int a){}
}
/*
1. Can't override static methods but can inherit:

 */

class B extends Inheritance{
    static void method1(){//not overriden just neglect method of parent class.
        System.out.println();
    }


    @Override
    protected void method9(final int a) {
        super.method9(a);
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.c=1;
    }
}