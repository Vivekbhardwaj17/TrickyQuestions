package divideAndConquer;

import java.util.Scanner;

public class WaysToReachInMatrix {// to reach 1,1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c = sc.nextInt();
        System.out.println(numberOfWays(r,c));
    }
    static int numberOfWays(int r, int c){
        if(r==1 && c==1 ) return 1;
        if(r==0 || c==1)  return 0;
        return numberOfWays(r-1,c)+numberOfWays(r,c-1);
    }
}
