package stringManupulation;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  s =scanner.nextLine();
        System.out.println(solve(s));
    }
    static int solve(String s) {
        int l=s.length()/3;
        String check="";
        int flag =0;
        while(l-->0)
            check+="SOS";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=check.charAt(i))
                flag++;

        }
        return flag;

    }
}
