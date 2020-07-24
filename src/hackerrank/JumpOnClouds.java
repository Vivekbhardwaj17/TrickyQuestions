package hackerrank;

public class JumpOnClouds {
    public static void main(String[] args) {
        int k=2;
        int[]c={0,0,1,0,0,1,1,0};
        System.out.println(jumpingOnClouds(c,k));
    }
    static int jumpingOnClouds(int[] c, int k) {
        int en=100;
        boolean flag =true;
        for(int i=k;flag;i=(i+k)%c.length){

            if(i==0)
                flag =false;
            if(c[i]==1)
                en-=3;
            else en-=1;
        }

        return en;


    }
}
