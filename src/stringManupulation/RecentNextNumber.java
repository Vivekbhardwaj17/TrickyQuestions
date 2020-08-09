package stringManupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecentNextNumber {
    public static void main(String[] args) {
        System.out.println(solve("dkhc"));
        char  c='a';

    }
    static String solve(String s){
        if(s.length()==1)
            return "no answer";
        int index =0;
        char first =s.charAt(s.length()-1);
        for (int i = s.length()-2; i >=0 ; i--) {
            if(s.charAt(i)<first){
                return replace(i,find(s,i,s.charAt(i)),s);
            }
            else {first = s.charAt(i);
            index = i;}

        }
        return "no answer";
    }
    static int find(String s,int i,char c){
        char t = 150;
        int index =0;
        for(int j=i;j<s.length();j++){
            if(s.charAt(j)<t && s.charAt(j)!=c&&s.charAt(j)>c){
                t = s.charAt(j);
                index = j;
            }
        }
        return index;
    }
    static String replace(int i,int j,String s){
        String first = s.substring(0,i)+s.charAt(j);
        //char[] arr = s.substring(i+1,s.length()).toCharArray();
        List<Character> ls = new ArrayList<>();
        for(int k=i;k<s.length();k++)
            if(s.charAt(j)!=s.charAt(k))
                ls.add(s.charAt(k));

        Collections.sort(ls);
        String second="";
        for(char c:ls)
            second+=c;

        return first+second;
    }


}

