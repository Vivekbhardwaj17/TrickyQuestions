package stringManupulation;

import java.util.Scanner;

public class PalindromeMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }
    public static int solve(String s){
        int j=s.length()-1;
        int cnt=0;
        for(int i=0;i<s.length()/2;i++){
            cnt+=Math.abs(s.charAt(i)-s.charAt(j));
            j--;
        }
        return cnt;
    }
}
