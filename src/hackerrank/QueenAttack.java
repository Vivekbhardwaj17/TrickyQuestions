package hackerrank;

public class QueenAttack {
    public static void main(String[] args) {


        int n = 100000;
        int k = 0;
        int a[][] = new int[0][0];
        int x = 4187;
        int y = 5068;
        System.out.println(queensAttack(n,k,x,y,a));
    }
    static int queensAttack(int n, int k, int xg, int yg, int[][] obstacles) {
        int[] xaxis={0,0,1,1,1,-1,-1,-1};
        int[] yaxis={1,-1,0,1,-1,0,1,-1};
        int cnt=0;
        int[][]board= new int[n][n];
        for(int i=0;i<obstacles.length;i++){
            int a = obstacles[i][0];
            int b = obstacles[i][1];
            board[a-1][b-1]=-1;
        }
       // System.out.println(xaxis[7]);
        for(int i=0;i<7;i++){
            int x=xg-1,y=yg-1;
            while(true){
                x+=xaxis[i];
                y+=yaxis[i];
                if(x>=0&&x<n&&y>=0&&y<n)
                    if(board[x][y]!=-1)
                        cnt++;
                    else break;
                else break;
            }
        }
        return cnt;
    }

}
