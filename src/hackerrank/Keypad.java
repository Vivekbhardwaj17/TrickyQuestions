package hackerrank;

import java.util.Scanner;

public class Keypad {

    public static void main(String[] args) {
        char[][] keypad = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(keypad,n));
    }
    static int  count(char[][]keypad,int num){
        if(num<=0)
            return 0;
        if(num==1)
            return 10;
        int count =0;

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(keypad[i][j]!='*'&&keypad[i][j]!='#')
                    count += check(keypad,i,j,num);
            }
        }
        return count;
    }
    static int check(char[][]keypad, int i,int j,int num){
        if(num==1)
            return 1;
        int count=0,r=0,c=0;
        int[]rmove={0,0,0,1,-1};
        int[]cmove={0,1,-1,0,0};
        for (int k = 0; k < 5 ; k++) {
            r=i+rmove[k];
            c =j+cmove[k];
            if(r>=0&&c>=0&&r<=3&&c<=2&&keypad[r][c]!='*'&&keypad[r][c]!='#')
                count+=check(keypad,r,c,num-1);
        }
        return count;
    }
}
