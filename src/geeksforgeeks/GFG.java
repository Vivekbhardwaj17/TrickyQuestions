package geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	 //code
	Scanner sc=new Scanner(System.in);
	int test=1;
	while(test-->0){
	    String s = "5aaa6";
	    int index=0;
	    for(char c:s.toCharArray()){
	        if(c>='a'&&c<='z'){
	            index++;
	            
	        }
	        else break;
	    }
	    if(Integer.parseInt(s.substring(index,s.length()))==index)
	    System.out.println(1);
	    else System.out.println(0);
}
	 }
}