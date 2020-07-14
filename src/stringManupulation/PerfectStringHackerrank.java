package stringManupulation;

import java.util.Scanner;

public class PerfectStringHackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(beautifulBinaryString(s));
    }
    static int beautifulBinaryString(String B) {
        return (B.length() - B.replaceAll("010", "").length())/3;


    }
}
