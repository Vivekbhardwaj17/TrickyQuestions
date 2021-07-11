package ArrayRotation;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        int[] ans = solve(arr,d);
        for(int i:ans) System.out.print(i+" ");
    }
   static int[] solve(int arr[], int d)
    {
        for(int i=0;i<d;i++){

            int loc = arr[i];
            arr[i]=arr[d];
            for(int k=d+1;k<arr.length;k++){
                arr[k-1]=arr[k];
            }
            arr[arr.length-1]=loc;

        }
        return arr;
    }
}
