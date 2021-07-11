package prepbytes.Arrays;

import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
      String ans=  solve("aman","nama");
        System.out.println(ans);
        }

    static String solve(String s,String b) {
                int[]arr = new int[26];
        for(char i:s.toCharArray())
                arr[i-'a']++;
        for(char c:b.toCharArray())
            arr[c-'a']--;
        for(int i:arr)
            if(i!=0)
                return "NO";
        return "YES";


    }
}