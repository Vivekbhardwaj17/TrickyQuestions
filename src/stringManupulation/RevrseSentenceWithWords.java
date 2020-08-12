package stringManupulation;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class RevrseSentenceWithWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        System.out.println(solve(arr));

    }
    static String solve(String[] arr){
        String ans ="";
        for (int i = arr.length-1; i >=0 ; i--) {
            ans+=reverse(arr[i])+" ";
        }
        return ans;
    }
    static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return new String(sb.reverse());
    }
}
