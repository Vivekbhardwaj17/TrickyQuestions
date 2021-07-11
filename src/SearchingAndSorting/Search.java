package SearchingAndSorting;

public class Search {
    public static void main(String[] args) {
        int arr[] = new int[]{4,9,10,154,15478,36985,8745123};
        Binary_Search binarySearch = new Binary_Search();
        System.out.println(binarySearch.binary_Search_iter(arr,arr[4]));

      //  System.out.println("Value At"+ binarySearch.binarySearch(arr,arr[5],0,arr.length-1,(arr.length-1)/2));
    }
}
