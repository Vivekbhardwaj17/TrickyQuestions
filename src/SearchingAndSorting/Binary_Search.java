package SearchingAndSorting;

public class Binary_Search {// Binary Search can be applied only on sorted array
    //If array is not sorted then its not good to use binary search because first we have to sort which will increase its
    // complexity to O(n^2)
    public int binary_Search_iter(int[]arr, int value){//iterative approach
        int first= 0;
        int last = arr.length-1;
       for (int i = 0; i <=arr.length/2 ; i++) {
           int mid = (last+first)/2;//just to remove size problem remove instead of (first+last)/2
           if(arr[mid]==value) return mid;
            else if(arr[mid]>value)last=mid;
            else first=mid;
        }
       return -1;//if value not found
    }
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not
        // present in array
        return -1;
    }
}
