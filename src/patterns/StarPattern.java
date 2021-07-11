package patterns;

import java.util.Scanner;


public class StarPattern{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        System.out.println(checkWinner(length, str));
    }
    static String checkWinner(int length, String str){
      int point1=0,voteA=0,voteB=0,point2=0;
        while(length-- >0)
        {
            if(str.charAt(point2) == 'A')
                voteA++;
            else if(str.charAt(point2) == 'B')
                voteB++;
            point2++;
        }
        while(str.charAt(point1)=='-')
        {
            point1++;
        }
        if(str.charAt(point1)=='A')
        {
            voteA+=point1;
        }

        int beg = point1;
       while (point1 < length)
        {
            while(str.charAt(point1)=='-' && point1<length)
            {
                point1++;
            }
            if(point1==length)
            {
                break;
            }

            if(str.charAt(point1)=='A')
            {
                if(beg == point1)
                {
                    point1++;
                    continue;
                }
                voteA = voteA + (point1-beg-1);
                beg = point1;
                point1++;
                continue;
            }
            beg = point1;
            point1++;
            while(str.charAt(point1)=='-' && point1<length)
            {
                point1++;
            }

            if(point1 == length)
                voteB = voteB + (point1-beg-1);
            else
            {
                if(str.charAt(point1) =='A')
                {

                    voteA = voteA + (point1-beg-1)/2;
                    voteB = voteB + (point1-beg-1)/2;

                    beg = point1;
                    point1++;
                }
                else
                {
                    voteB = voteB + (point1-beg-1);
                }
            }

        }

        if(voteA > voteB)
        {
            return "A";
        }
        else if(voteA == voteB)
        {
            return "Coalition government";
        }
        else
        {
            return "B";
        }
    }
}
