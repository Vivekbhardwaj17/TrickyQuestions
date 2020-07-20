
package hackerrank;
import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[][] sudoku = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sudoku[i][j] = sc.nextInt();
            }
        }

boolean res = solveSudoku(sudoku);
        if(res)
        {
            for (int i = 0; i < 9 ; i++) {
                for (int j = 0; j < 9 ; j++) {
                    System.out.print(sudoku[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Not possible");

    }

    static boolean solveSudoku(int[][] matrix) {
        boolean flag = true;
        int R=-1, C=-1;
        for (int i = 0; i < 9 && flag; i++)
            for (int j = 0; j < 9 && flag; j++)
                if (matrix[i][j] == 0) {
                    R = i;
                    C = j;
                    flag = false;
                }
        if(flag == true)
            return true;
        for (int num = 1; num <= 9; num++) {
            if (valid(matrix, R, C, num)) {
                matrix[R][C] = num;
                if (solveSudoku(matrix)) {
                    // print(board, n);
                    return true;
                }
                else
                    matrix[R][C]=0;

            }
        }
        return false;
    }

    static boolean valid(int[][] board, int row, int col, int num) {

        for(int i:board[row])
            if(i==num)
                return false;


        for (int r = 0; r < board.length; r++) {


            if (board[r][col] == num) {
                return false;
            }
        }



        int s = row - row % 3;
        int f = col - col % 3;

        for (int r = s;
             r < s + 3; r++) {
            for (int d = f;
                 d < f + 3; d++) {
                if (board[r][d] == num) {
                    return false;
                }
            }
        }


        return true;
    }
}
