package greedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class ActivitySelectionProblem {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int size = 6;
//        int [][]myarr = new int[size][2];
//
//        for (int i = 0; i < 6 ; i++) {
//           myarr[i][0]= sc.nextInt();
//           myarr[i][1]= sc.nextInt();
//        }
        int[][]myarr = {{3,4},{0,6},{5,7},{8,9},{5,9},{1,2}};
        Arrays.sort(myarr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                Integer  a= o1[1];
                int b = o2[1];
                return a.compareTo(b);
            }
        });
        int[] sores = {1,2,3,8,9};
               Arrays.sort(new int[][]{sores}, Collections.reverseOrder());
//
        
       showActivitySelectionOrder( myarr[0], myarr[1]);
    }
    public static void showActivitySelectionOrder(int[]s , int[]e){
        int  j=0;
        System.out.print(j+" ");
        for (int i = 1; i <s.length ; i++) {
             if(s[i]>=e[j]) {
                 System.out.print(i + " ");
                 j=i;

             }

        }
    }
}


