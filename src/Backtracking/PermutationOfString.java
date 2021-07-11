package Backtracking;

public class PermutationOfString {
    public static void main(String[] args) {

       // System.out.println('1'.toUpperCase());

      //  solve("1234","");
    }
    static void solve(String ques,String ans){
        if(ans.length()==4) {System.out.println(ans);}

        for (int i = 0 ;i < ques.length(); i++) {
            solve(ques.substring(0,i)+ques.substring(i+1,ques.length()),ans+ques.charAt(i));
        }

    }
}
