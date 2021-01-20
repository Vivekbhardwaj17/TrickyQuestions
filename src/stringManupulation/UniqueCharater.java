package stringManupulation;

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int t= Integer.parseInt(sc.nextLine());
    while(t-->0){
      String ab = sc.nextLine();
      String str = sc.nextLine();
      solve(str);
    }
    
  }
  static void solve(String s) {
                int[]arr = new int[26];
        for(char i:s.toCharArray())
                arr[i-'a']++;
       boolean flag = true;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==1){
               System.out.println((char)(97+i));
               flag=false;
               break;
            }
        if(flag)
        System.out.println(-1);


    }
}