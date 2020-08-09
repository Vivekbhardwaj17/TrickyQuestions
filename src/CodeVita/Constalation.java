package CodeVita;

class Constalation {
    public static void main(String[] args) {
        char[][]arr={{'*','.','*','#','*','*','*','#','*','*','*','#','*','*','*','.','*','.'},{'*','.','*','#','*','.','*','#','.','*','.','#','*','*','*','*','*','*'},
                {'*','*','*','#','*','*','*','#','*','*','*','#','*','*','*','*','.','*'}};
       String ans="";
        for (int i = 0; i <18 ; i+=3) {
            if(arr[0][i]=='#'){
                ans+="#";
            i++;}
            ans+=checkShape(i,arr);
        }
        System.out.println(ans);
    }
    static String checkShape(int start,char[][]arr){

            int cnt =0;
            for (int j = 0; j <3 ; j++) {
                if(arr[j][start]=='*') cnt++;
            }
            if(cnt!=3){ if(arr[1][start]=='*')
                return "A";
            else return "I";}
            else if(cnt==3) {
                cnt=0;
                for (int i = start; i <start+3 ; i++) {
                    if(arr[0][i]=='*')
                        cnt++;

                }
                if(cnt==3){
                    if(arr[1][start+1]=='*')
                        return "E";
                    else return "O";
                }
                else return "U";

            }
            return "Yes";
    }
}