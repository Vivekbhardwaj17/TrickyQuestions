package prepbytes.Arrays;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 1, 0, 1, 0, 1, 0};//
        int[] ans = solve(arr);
        for(int i:ans)
            System.out.print(i+" ");
    }
    static int[] solve(int[] arr){
        int cnt=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==1)cnt++;
        }
        int[] ans = new int[arr.length];
        for (int i = arr.length-cnt; i < ans.length ; i++) {
           ans[i]=1;
        }
        return ans;
    }
}
