package hackerrank;


class GfG
{


    static int row[] = {0, 0, -1, 0, 1};
    static int col[] = {0, -1, 0, 1, 0};


    static int getCountUtil(char keypad[][],
                            int i, int j, int n)
    {
        if (keypad == null || n <= 0)
            return 0;

        if (n == 1)
            return 1;

        int k = 0, move = 0, ro = 0, co = 0, totalCount = 0;


        for (move=0; move<5; move++)
        {
            ro = i + row[move];
            co = j + col[move];
            if (ro >= 0 && ro <= 3 && co >=0 && co <= 2 &&
                    keypad[ro][co] != '*' && keypad[ro][co] != '#')
            {
                totalCount += getCountUtil(keypad, ro, co, n - 1);
            }
        }
        return totalCount;
    }


    static int getCount(char keypad[][], int n)
    {
        // Base cases
        if (keypad == null || n <= 0)
            return 0;
        if (n == 1)
            return 10;

        int i = 0, j = 0, totalCount = 0;
        for (i = 0; i < 4; i++) // Loop on keypad row
        {
            for (j=0; j<3; j++) // Loop on keypad column
            {
                // Process for 0 to 9 digits
                if (keypad[i][j] != '*' && keypad[i][j] != '#')
                {
                    // Get count when number is starting from key
                    // position (i, j) and add in count obtained so far
                    totalCount += getCountUtil(keypad, i, j, n);
                }
            }
        }
        return totalCount;
    }

    // Driver code
    public static void main(String[] args)
    {
        char keypad[][] = {{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};
        System.out.printf("Count for numbers of"+
                " length %d: %d", 1, getCount(keypad, 1));
        System.out.printf("\nCount for numbers of" +
                "length %d: %d", 2, getCount(keypad, 2));
        System.out.printf("\nCount for numbers of" +
                "length %d: %d", 3, getCount(keypad, 3));
        System.out.printf("\nCount for numbers of" +
                "length %d: %d", 4, getCount(keypad, 4));
        System.out.printf("\nCount for numbers of" +
                "length %d: %d", 5, getCount(keypad, 5));
    }
}
