package numberManupulation;

import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = solve(n);
        System.out.println(length);
    }
    public static int solve(int n){
        int length = (int)Math.floor(Math.log10(n));
        return length+1;
    }
}
