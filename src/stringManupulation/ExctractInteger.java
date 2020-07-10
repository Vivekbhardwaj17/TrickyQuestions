package stringManupulation;

import java.util.Scanner;

public class ExctractInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solve(s);
    }
    static void solve(String s) {
        boolean flag = true;
        if(s.length()<=1){
            System.out.println("NO");
        flag = false;}
        else if(s.charAt(0)=='0'){
            System.out.println("NO");
        flag=false;}
        else{
            for(int i=1;i<=s.length()/2;i++){
                long tr = Long.parseLong(s.substring(0,i));
                long t=tr;
                String check=String.valueOf(t);
                while(check.length()<s.length())
                {
                    t++;
                    check+=String.valueOf(t);
                }
                if(check.equals(s)){
                    System.out.println("YES "+tr);
                flag=false;}
            }
        }
             if(flag)
                 System.out.println("NO");

    }
}
