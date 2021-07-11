package DynamicProgramming;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 50;//to find nth term in fabonacci
        int[] arr = new int[n+1];//to store values
        System.out.println(solve(n,arr));
    }
    static int solve(int n,int[]arr){
        if(n<=2)return 1;
        if(arr[n]!=0)return arr[n];
        else arr[n]= solve(n-1,arr)+solve(n-2,arr); // to store copy of answer for future use

        return arr[n];
    }
}
