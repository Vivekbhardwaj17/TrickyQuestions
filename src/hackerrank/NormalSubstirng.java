package hackerrank;

import java.util.Scanner;

public class NormalSubstirng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String s= sc.nextLine();
        System.out.println(solve("abcdAGabceAAAfjijojjBFojoj+7496464567"));
    }
    static int solve(String s){
        int cnt =0;
        int cnt1=0;
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
                cnt1++;
            else {cnt=Math.max(cnt,cnt1);
            cnt1=0;}
        }
        return cnt;
    }
}
