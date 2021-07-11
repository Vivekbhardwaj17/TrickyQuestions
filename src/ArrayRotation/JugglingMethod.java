package ArrayRotation;

public class JugglingMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        int[] ans = solve(arr,d);
        for(int i:ans) System.out.print(i+" ");
    }
    static  int[] solve(int[]arr,int d){
        int gcd = gcd(d,arr.length);

        for (int i = 0; i < gcd; i++) {
            int k,j,loc;
            j = i;
            loc = arr[i];
            while(true){
                 k = d+j;
                 if(k>=arr.length)
                     k=k-arr.length;
                 if(k==i)
                     break;
                 arr[j]=arr[k];
                 j=k;

            }
            arr[j]=loc;
        }
        return arr;
    }
  static   int gcd(int a, int b)
    {
        if (b == 0)
            return a;

        else
            return gcd(b, a % b);
    }
}
