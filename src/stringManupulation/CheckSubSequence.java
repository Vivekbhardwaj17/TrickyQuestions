package stringManupulation;
import java.io.IOException;
import java.util.Scanner;
public class CheckSubSequence {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int  t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a[] =sc.nextLine().split(" ");
//   String b =sc.nextLine();
            int cnt =0;
            int first=0;
            if(a[1].length()>a[0].length())
                System.out.println("NO");
            else if(a[1].equals(a[0]))System.out.println("YES");
            else{int i=0,j=0;

                    for(j=0;j<a[0].length();){
                        if(a[1].charAt(i)==a[0].charAt(j)){
                            i++;j++;
                        }else j++;
                        if(j==a[0].length()||i==a[1].length())break;
                    }

                if(i==a[1].length())System.out.println("YES");
                else System.out.println("NO");
            }


        }
    }
}
