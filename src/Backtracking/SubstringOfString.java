package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubstringOfString {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
       solve("vivek", "",  arr);
    }
    public static void solve(String str, String ans, List<String> arr){
        if(ans.length()>0 && !arr.contains(ans)) {
            System.out.println(ans);
            arr.add(ans);
        }
        for(int i=0;i<str.length();i++)
            solve(str.substring(i+1),ans+str.charAt(i),arr);
    }
}
