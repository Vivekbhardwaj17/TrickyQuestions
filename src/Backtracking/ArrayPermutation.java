package Backtracking;

import java.util.*;
import java.io.*;

public class ArrayPermutation {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
   // String ques[];
    int t =sc.nextInt();
    String ques[]=sc.nextLine().split(" ");
  //  while(t-->0){ques+=Integer.toString(sc.nextInt());}
    solve(ques,"",ques.length,0,ques.length);
    
  }
  static void solve(String[] ques, String ans,int cnt,int str,int end){
    if(ans.length()==(2*cnt))System.out.println(ans);
    
   // for(int i=0;i<ques.length;i++)
   // solve(ques.substring(0,i)+ques.substring(i+1,ques.length()),ans+ques.charAt(i)+" ",cnt);
  }
}