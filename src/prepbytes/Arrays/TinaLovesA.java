package prepbytes.Arrays;
import java.util.*;
public class TinaLovesA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-->0){
        String string = sc.nextLine();
            System.out.println(solve(string));
        }



    }
    static int solve(String string) {
        int nofa = 0;
        for (char i : string.toCharArray())
            if (i == 'a')
                nofa++;
        if (nofa * 2 > string.length())
            return (string.length());
        else {
            return nofa*2-1;
        }
    }
}
