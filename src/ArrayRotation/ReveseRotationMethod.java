package ArrayRotation;

public class ReveseRotationMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 4;
        int[] ans =solve(arr,d);
        for(int i:ans) System.out.print(i+" ");
    }
    static int[] solve(int[] arr, int d){
        arr=reverseRotate(0,d-1,arr);
        arr=reverseRotate(d,arr.length-1,arr);
        return reverseRotate(0,arr.length-1,arr);
    }
    static int[] reverseRotate(int start, int end, int[] arr){
        while (start<end){
            int loc = arr[start];
            arr[start]=arr[end];
            arr[end]=loc;
            start++;
            end--;

        }
        return arr;
    }
}
