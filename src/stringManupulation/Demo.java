package stringManupulation;

import java.util.*;
public class Demo{
   static void solve(String []str, int n){
      for (int i=1 ;i<n; i++){
         String temp = str[i];
         int j = i - 1;
         while (j >= 0 && temp.length() < str[j].length()){
            str[j+1] = str[j];
            j--;
         }
         str[j+1] = temp;
      }
   }
   public static void main(String args[]){
      String s ="This is a sample";
      String []arr = s.split(" ");

      solve(arr,arr.length);

      for (int i=0; i<arr.length; i++)
      System.out.print(arr[i]+" ");
   }
}