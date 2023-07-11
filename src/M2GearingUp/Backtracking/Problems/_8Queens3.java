package M2GearingUp.Backtracking.Problems;


public class _8Queens3 {
    static boolean ansFound;
    static int cnt;
    public static void main(String[] args) {
        int [] board = {8,4,7,3,2,8,7,7}; //8 4 7 3 2 8 7 7
        minimumMoves(board);
        System.out.println(cnt);
    }

    private static void minimumMoves(int[] board) {
        ansFound = false;
        cnt = 0;
        int [][] chess = new int[8][8];
        for (int c = 0; c < 8; c++) {
            int r = board[c]-1;
            chess[r][c] = 1;
        }
        helper(board, 0, 0, chess, 0);
    }

    private static void helper(int[] board, int col, int row, int[][] chess, int moves) {
//        if(ansFound) return;
        if(col == 8) {
            ansFound = true;
            cnt = moves;
            return;
        }
        // play like you are yet to change the queens
        // to the right side of the current Queen
        if(isSafe(row, col, chess)) {
            helper(board, col+1, row, chess, moves);
        }
        for (int r = 0; r < 8; r++) {
            if(isSafe(r, col, chess)){
                // Do
                chess[row][col] = 0;
                chess[r][col] = 1;
                if(r != row) helper(board, col+1, r, chess, moves+1);
                // Undo
                chess[r][col] = 0;
                chess[row][col] = 1;
            }
        }
    }

    private static boolean isSafe(int r, int col, int[][] chess) {
        // only check row, 1diagonal, 2diagonal on the left side...
        // row
        for (int j = 0; j < col; j++) {
            if(chess[r][j] == 1) return false;
        }
        // diagonal_1
        for (int i = r-1, j=col-1; i >=0 && j>=0 ; i--,j--) {
            if(chess[i][j] == 1) return false;
        }
        // diagonal_2
        for (int i = 0, j= col-1; i <=7 && j>= 0 ; i++, j--) {
            if(chess[i][j] == 1) return false;
        }
        return true;
    }
}
