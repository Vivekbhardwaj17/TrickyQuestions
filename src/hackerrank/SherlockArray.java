package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> arr = new ArrayList<>();
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(balancedSums(arr));
    }
    static String balancedSums(List<Integer> arr) {
        if(arr.size()==1)
            return "YES";
        int sum=0;
        for(int i:arr)
            sum+=i;

        int lsum=0;
        for(int i=0;i<arr.size()-1;i++){
            int  su=sum;
            su-=arr.get(i);
            su/=2;
            if(su==lsum)
                return "YES";
            lsum+=arr.get(i);
        }
        return "NO";

    }
}
