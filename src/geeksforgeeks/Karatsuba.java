package geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Karatsuba
 {
	public static void main (String[] args)throws IOException
	 {
	 //code
	Scanner sc=new Scanner(System.in);
	int test=1;
	while(test!=0){
	    String[] str = "010101 0010110000".split(" ");
	    String first = str[0];
	    String second = str[1];
	    System.out.println(solve(first,second));
	test--;}
	 }
	 static long solve(String first,String second){
	     long f=0l;
	     long s =0l;
	     int i=0;
	     for(int c=first.length()-1;c>=0;c--,i++)
	     f+=(long)Math.pow(2,i)*Character.getNumericValue(first.charAt(c));
	     i=0;
		 for(int c=second.length()-1;c>=0;c--,i++)
	     s+=(long)Math.pow(2,i)*Character.getNumericValue(second.charAt(c));
	     return f*s;
	 }
}