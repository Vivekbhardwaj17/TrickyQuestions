package stringManupulation;

import java.util.Scanner;

public class CiserCipher {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s= sc.nextLine();
        int k=sc.nextInt();
        System.out.println(solve(s,k));
    }
    static String solve(String s, int k) {
        k=k%26;
        String ans="";
        for(char c:s.toCharArray())
        {
            if(c>='a'&&c<='z')
            {
                int  p=(c+k);
                if((char)p>'z')
                    p=p-26;
                ans+=(char)p;
            }
            else if(c>='A'&&c<='Z')
            {
                int  p=(c+k);
                if((char)p>'Z')
                    p=p-26;
                ans+=(char)p;
            }
            else
                ans+=c;
        }
        return ans;

    }

}
