package geeksforgeeks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n= 3;
        int k = 1;
        int m = 0;
        List<Integer> arr = new LinkedList<>();
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());
        List<Integer> ans = solve(arr,k);
        System.out.print(ans.get(m));
    }
    static List<Integer> solve(List<Integer>arr, int k){
       
        while(k-->0){
          List<Integer>  ans = new LinkedList<>();
            for(int i=0;i<arr.size()-1;i++){
                int a = arr.get(i) ^ arr.get(i+1);
                ans.add(a);
            }
            arr = ans;
        }
       return arr;   
    }
}