package greedyAlgorithms;

import java.util.Scanner;

public class ActivitySelectionProblem {
    public static void main(String[] args) {

        Activity[] activity = new Activity[6];

        int[] startTime = {1,3,0,5,8,5};
        int[] endTime = {2,4,6,7,9,9};
        for (int i = 0; i <6 ; i++) {
            activity[i].starti=startTime[i];
            activity[i].endj=endTime[i];
        }
        
        showActivitySelectionOrder(startTime, endTime);
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
class Activity{
    int starti;
    int endj;
    Activity(int starti, int endj) {
        this.starti=starti;
        this.endj=endj;
    }
}
