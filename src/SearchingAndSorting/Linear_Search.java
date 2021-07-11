package SearchingAndSorting;

public class Linear_Search {
    public int linear_Search(int[]arr, int value){
        for(int i=0;i<arr.length;i++)if(arr[i]==value)return i; // if value found then return index of value in the array
        return -1; //else return -1 if value not found in the array;
    }
}
