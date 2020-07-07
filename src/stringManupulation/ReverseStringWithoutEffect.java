package stringManupulation;

import javax.swing.*;
import java.util.Scanner;

public class ReverseStringWithoutEffect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenString = sc.nextLine();
        String requiredString  = solve(givenString);
        System.out.println(requiredString);
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
}
