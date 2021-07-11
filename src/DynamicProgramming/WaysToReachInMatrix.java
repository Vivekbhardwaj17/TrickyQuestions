package DynamicProgramming;

import java.util.Scanner;

public class WaysToReachInMatrix {//destination is 1,1 and allowed to go only down or left
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c =sc.nextInt();
        int[][] arr = new int[r+1][c+1];
        System.out.println(numberOfWays(r,c,arr));
    }

    static int numberOfWays(int r, int c,int[][]arr){
        if(r==1 && c==1 ) return 1;
        if(r==0 || c==1)  return 0;
        if(arr[r][c]!=0)  return arr[r][c];
        else arr[r][c] = numberOfWays(r-1,c,arr)+numberOfWays(r,c-1,arr);
        return arr[r][c];
    }
}
