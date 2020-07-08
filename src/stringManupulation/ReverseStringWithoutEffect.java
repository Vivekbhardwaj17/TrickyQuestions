package stringManupulation;

import javax.swing.*;
import java.util.Scanner;

public class ReverseStringWithoutEffect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String givenString = sc.nextLine();
       // String requiredString  = solve(givenString);
      //  System.out.println(requiredString);
        System.out.println(superReducedString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));
    }
    public static String solve(String s){
        char[] org= s.toCharArray();
        char[] temp= new char[org.length];
        for (int i = 0; i < org.length; i++) {
            if(org[i]>='a'&&org[i]<='z'){
                temp[i]=org[i];
                org[i]='1';
            }
        }
       int i=0;
        int j=temp.length-1;
        while(i<j){
            char t = temp[i];
            temp[i]=temp[j];
            temp[j]=t;
            i++;
            j--;
        }
        for (int k = 0; k < temp.length ; k++) {
                if(org[k]=='1')
            org[k]=temp[k];
        }
//        for (int k = 0; k < org.length; k++) {
//            System.out.print(temp[k]);
//        }
        return new String(org);
    }
    static String superReducedString(String s) {
        String ans="";
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[s.charAt(i)-'a']%=2;
        }
        for(int i=0;i<26;i++)
            if(arr[i]!=0)
                ans+=(char)('a'+i);
            if(s.isEmpty())
                return "Empty String";
        return ans;

    }
}
