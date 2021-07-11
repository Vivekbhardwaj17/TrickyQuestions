package stringManupulation;

import java.util.Arrays;
import java.util.Scanner;

public class wipro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int[] res=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
                res[j++]=arr[i];
        }
        for(int i=0;i<n;i++){
            if(i%2!=0)
                res[j++]=arr[i];
        }
        for(int i=0;i<n;i++)
            System.out.print(res[i]+" ");
    }
}
