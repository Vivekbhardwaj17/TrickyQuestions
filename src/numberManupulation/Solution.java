package numberManupulation;

import java.util.Scanner;

class Gandhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if(isGandhi(n))
            System.out.println(n+" is Gandhi Number");
        else System.out.println(n+" is not Gandhi Number");
    }


    static double logn(int n, int r)
    {
        return (Math.log(n) / Math.log(r));
    }

    static boolean isGandhi(int n)
    {
        if(n == 0)
            return false;
        return Math.floor(logn(n,4))==Math.ceil(logn(n,4));
    }

}