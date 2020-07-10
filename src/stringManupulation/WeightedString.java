package stringManupulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class WeightedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="abccddde";
        int t=6;
        int[] queries ={1,3,12,5,9,10};
        String[] ans =weightedUniformStrings(s,queries);
        for(String a:ans)
            System.out.println(a);
    }
    static String[] weightedUniformStrings(String s, int[] queries) {
        int l = s.length();
        // Use unordered set
        HashSet<Integer> weight = new HashSet<>(l);
        int m = 1;
        int w = 0;
        int last = '-';

        for (int i = 0; i < l; i++) {
            w = s.charAt(i) - 96;
            if (w == last) {
                m++;
                w = w * m;
            } else {
                m = 1;
                last = w;
            }
            weight.add(w); // Add element into set
        }

        String subs[] = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {

            // Check if the set contains the next query
            if (weight.contains(queries[i])) {
                subs[i] = "Yes";
            } else {
                subs[i] = "No";
            }
        }
        return subs;
    }

}
