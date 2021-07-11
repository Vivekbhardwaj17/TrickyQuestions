package stringManupulation;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {

    //write your code here
    Scanner sc = new Scanner(System.in);
    int a=Integer.parseInt(sc.nextLine());
    int b=Integer.parseInt(sc.nextLine());

    String first =sc.nextLine();
    for(int i=0;i<b;i++){
      String second =sc.nextLine();
      if(second.length()<=first.length()&&first.substring(0,second.length()).equals(second)){

          System.out.println("Yes");}
      else System.out.println("No");
    }



  }
}