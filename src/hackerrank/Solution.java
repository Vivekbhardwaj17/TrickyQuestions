package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the organizingContainers function below.
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = 2;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = in.nextInt();
                a[i] += x;
                b[j] += x;
            }
        }

        for (int i = 0; i < n ; i++) {
            System.out.print(b[i]+" ");
        }

        String pts = "Possible";
        for (int i = 0; i < n; i++) {
            int j = 0;
            for (j = i; j < n; j++) {
                if (a[i] == b[j]) {
                    int temp = b[j];
                    b[j] = b[i];
                    b[i] = temp;
                    break;
                }
            }
            if (j == n) {
                pts = "Impossible";
                break;
            }
        }
        System.out.println(pts);
    }
}
