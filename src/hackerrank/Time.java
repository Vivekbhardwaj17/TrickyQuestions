package hackerrank;

import java.util.Scanner;

public class Time {
    static String timeInWords(int h, int m) {

        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven"
                ,"twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"
                ,"twenty","twenty one","twenty two","twenty three","twenty four","twenty five",
                "twenty six","twenty seven","twenty eight","twenty nine","thirty"};

        if(m==0)
            return number[h]+" o' clock";
        else if((m>=0&&m<15)||(m>15&&m<30)){
            if(m==1)
                return number[m]+" minute past "+number[h];
            return number[m]+" minutes past "+number[h];}
        else if(m==15)
            return "quarter past "+number[h];
        else if(m==30)
            return "half past "+number[h];
        else if(m==45)
            return "quarter to "+number[h+1];
        else {
            if((60-m)==1)
                return number[60-m]+" minute to "+number[h+1];
            return number[60-m]+" minutes to "+number[h+1];
        }


    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(timeInWords(h,m));
    }
}
