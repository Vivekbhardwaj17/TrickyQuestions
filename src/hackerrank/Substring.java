package hackerrank;

import java.io.*;
import java.util.*;

public class Substring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }
    public static int solve(String str)
    {
        int[] sum = new int[str.length() + 1];
        for (int i = 1; i <= str.length(); i++)
            sum[i] = sum[i - 1] + (str.charAt(i - 1) - '0');
        int max = 0;
        for (int i = 0; i < str.length() - 1; i++)
        {
            for (int j = i+1; j < str.length(); j += 2)
            {
                int range = j - i + 1;


                int mid = i + range / 2;

                if ((sum[mid] - sum[i] == sum[j+1] - sum[mid])
                        && max < range) {
                    max = range;
                }
            }
        }

        return max;
    }
}