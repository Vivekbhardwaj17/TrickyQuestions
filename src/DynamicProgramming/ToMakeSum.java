package DynamicProgramming;

public class ToMakeSum {
    public static void main(String[] args) {
     int res =    getSum(11,new int[12],new int[]{4,6,1,2});
        System.out.println(res);
    }
    static int getSum(int n, int[] arr, int[]val){
        if(n<0)return 0;
        if( n== 0) return 1;
        if(arr[n]!=0) return arr[n];
        for (int i = 0; i < val.length ; i++) {
            arr[n]=getSum(n-val[i],arr,val);
        }
        return arr[n];
    }
}
