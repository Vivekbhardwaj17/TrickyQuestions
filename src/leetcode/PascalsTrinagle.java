package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTrinagle {
    public static void main(String[] args) {
            solve("vivek");

    }
    public static void solve(String name){
        int[] frq = new int[26];
        for(int i=0;i<name.length();i++){
            frq[name.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(frq[i]!=0){
                System.out.println((char)(i+97)+" "+frq[i]);
            }
        }
    }
}
