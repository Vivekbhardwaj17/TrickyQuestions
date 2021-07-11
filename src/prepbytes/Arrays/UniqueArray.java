package prepbytes.Arrays;
import java.util.*;
public class UniqueArray {
    public static void main(String[] args) {
        int testcases;
        Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();

        while(testcases-- >0) {
            int size = sc.nextInt();

            int[] arr = new int[size];
            int i=0;
            while (size-- >0) {
                arr[i] = sc.nextInt();
                i++;
            }
            System.out.println(numberOfUnique(arr));
        }

    }
    static int numberOfUnique(int[] arr){
        if(arr.length ==1)
            return 1;
        int first = arr[0];
        int count = 1;
        Set<Integer> set = new HashSet<>();
            set.add(first);
        while (!set.contains(arr[first])){

            first = arr[first];
            //set.add(loc);
            set.add(first);
            count++;
        }
        return count;
    }
}
