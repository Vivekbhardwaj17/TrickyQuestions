package stringManupulation;

import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(solve(s));
    }
    static String solve(String s) {
        s=s.toLowerCase();
        int[]arr = new int[26];
        for(char c:s.toCharArray())
            if(c>='a'&&c<='z')
                arr[c-'a']++;
        for(int i:arr)
            if(i==0)
                return "not pangram";
        return "pangram";


    }
}
