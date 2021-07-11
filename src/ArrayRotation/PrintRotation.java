package ArrayRotation;

import java.util.Scanner;

public class PrintRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int d = 4;
        solve(arr,d);
    }
    static void solve(int[] arr,int d){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[(i+d)%arr.length]+" ");
        }
    }
}
