package SearchingAndSorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={2,9,3,1,7,4,5};
        for(int i:arr) System.out.print(i+" ");
        arr=insertionSort(arr);
        System.out.println("sorted");
        for(int i:arr) System.out.print(i+" ");
    }
    public static int[] insertionSort(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j= i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
