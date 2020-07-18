package hackerrank;

import java.util.Scanner;

public class LeaderBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 7;
        int[] ar = {100,100,50,40,40,20,10};

        int m= 4;
        int[]arr= {5,25,50,120};

       int []ans = climbingLeaderboard(ar,arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] ranks = new int[scores.length];
        ranks[0]=1;
        int flag =1;
        for(int i=1;i<scores.length;i++){
            if(scores[i]!=scores[i-1]){
                flag++;
                ranks[i]=flag;
            }
            else ranks[i]=flag;
        }
        int[] ans = new  int[alice.length];
        for(int i=0;i<alice.length;i++){
            if(alice[i]>scores[0])
                ans[i]=1;
            else if(alice[i]<scores[scores.length-1])
                ans[i]= ranks[scores.length-1]+1;
            else{
                for(int j=0;j<scores.length;j++)
                {
                    if(alice[i]>scores[j]){
                        if(ranks[j]==1){
                            ans[i]=1;
                        break;}
                        else{
                            ans[i]=ranks[j];
                        break;}
                    }
                    else  if(alice[i]==scores[j]){
                        ans[i]=ranks[j];
                    break;}
                }

            }

        }
        return ans;
    }

}
