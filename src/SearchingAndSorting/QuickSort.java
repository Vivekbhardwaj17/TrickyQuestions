package SearchingAndSorting;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {2,8,9,1,6,2,7};

    }
    public int[] quickSort(int[] arr,int start,int end){
        int pivot = arr[end];
        int j=end;
        for(int i= end-1;i>=start;i--){
            if(arr[i]>pivot){
                arr[j]=arr[i];
                arr[i]=pivot;
                j=i;
            }
        }
       // quickSort(arr,)

        return arr;
    }
}
