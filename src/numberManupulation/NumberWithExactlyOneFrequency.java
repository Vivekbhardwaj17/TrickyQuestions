package numberManupulation;

import java.util.Scanner;

public class NumberWithExactlyOneFrequency {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int unique = OneFrequency(arr);
        System.out.println(unique);
    }
    public static int OneFrequency(int[] n){

        int xor = 0;

        for (int i = 0; i < n.length ; i++) {
            xor ^= n[i];
        }
        return xor;
    }
}
