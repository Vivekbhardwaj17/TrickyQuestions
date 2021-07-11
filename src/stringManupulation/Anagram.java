package stringManupulation;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(checkAnagram(first,second));
    }
    static boolean checkAnagram(String first, String second){
        int[] arr = new int[26];
        for(char c:first.toCharArray())
            arr[c-'a']++;
        for(char c:second.toCharArray())
            arr[c-'a']--;
        for (int i = 0; i < 26; i++) {
            if(arr[i]!=0)return false;
        }
        return true;
    }
}
