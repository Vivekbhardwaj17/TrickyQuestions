package Fabonacci;

import java.util.Scanner;

public class IsFabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean response= checkFabonacci(n);
        System.out.println(response);
    }
    public static boolean checkFabonacci(int n){
        int square = (int)Math.pow(n,2);
        int root = (int)Math.sqrt(square);
        int local = (5*square)+4;
        if(root==n)
            return true;
        else {
            local = (5*square)-4;
            if(root == n)
                return true;
            else
                return false;
        }
    }
}
