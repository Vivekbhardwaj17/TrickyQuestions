package Backtracking;
import java.util.*;
import java.io.*;

public class MenInMiddle {
  public static void main(String args[]) throws IOException {

    //write your code here
    Scanner sc = new Scanner(System.in);
    String str = "byt1e";
  //  List<String>ls=new ArrayList<>();
      solve(str,"",str.length());
   // for(String i:ls) System.out.println(i);

  }
  static void solve(String str,String ans,int cnt){
    if(ans.length()==cnt)System.out.println(ans);
     // if (!ls.contains(ans))
      //  ls.add(ans);
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)>='a'&&str.charAt(i)<='z')
      solve(str.substring(i+1,str.length()),ans+Character.toUpperCase(str.charAt(i)),cnt);


      solve(str.substring(i+1,str.length()),ans+(str.charAt(i)),cnt);



    }
   // return ls;
  }
}