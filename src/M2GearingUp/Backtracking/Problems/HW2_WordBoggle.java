package M2GearingUp.Backtracking.Problems;

import java.util.Arrays;

public class HW2_WordBoggle {
    public static void main(String[] args) {
//        char[][] board = {{'G','I','Z'},{'U','E','K'},{'Q','S','E'}};
//        char [][] board = {{'C','A','P'},{'A','N','D'},{'T','I','E'}};
//        String[] dictionary = {"CAT"};
//        String[] dictionary = {"GEEKS","FOR","QUIZ","GO"};
        String[] dictionary = {"df", "dec", "dfd", "fd", "ded", "e"};
        char [][] board = {
                {'f','f'},
                {'d', 'e'},
                {'f', 'b'},
                {'b', 'e'}
        };
        System.out.println(Arrays.toString(wordBoggle(board, dictionary)));

    }
    public static String[] wordBoggle(char[][] board, String[] dictionary)
    {
        // Write your code here
        String[] temp = new String[dictionary.length];
        Arrays.sort(dictionary);
//        System.out.println(Arrays.toString(dictionary));
        int cnt = 0;
        for (int i = 0; i < dictionary.length; i++) {
            String word = dictionary[i];
            if(exist(board, word)){
                temp[cnt] = dictionary[i];
                cnt++;
            }
        }
        String[] ans = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }
    public static boolean exist(char[][] board, String word) {
        char firstChar = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(firstChar == board[i][j]){
                    if(backtracking(board, word, i, j, 0)) return true;
                }
            }
        }
        return false;
    }

    private static boolean backtracking(char[][] board, String word, int i, int j, int idx) {
        if(idx == word.length()-1) {
            return true;
        }
        char nextChar = word.charAt(idx+1);
        // R
        if(isBound(i, j+1, board) && board[i][j+1] == nextChar && board[i][j+1] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i, j+1, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }
        // D
        if(isBound(i+1, j, board) && board[i+1][j] == nextChar && board[i+1][j] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i+1, j, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }
        // L
        if(isBound(i, j-1, board) && board[i][j-1] == nextChar && board[i][j-1] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i, j-1, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }
        // U
        if(isBound(i-1, j, board) && board[i-1][j] == nextChar && board[i-1][j] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i-1, j, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }

        // RU (i-1, j+1)
        if(isBound(i-1, j+1, board) && board[i-1][j+1] == nextChar && board[i-1][j+1] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i-1, j+1, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }
        // RD (i+1, j+1)
        if(isBound(i+1, j+1, board) && board[i+1][j+1] == nextChar && board[i+1][j+1] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i+1, j+1, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }
        // Ld (i+1, j-1)
        if(isBound(i+1, j-1, board) && board[i+1][j-1] == nextChar && board[i+1][j-1] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i+1, j-1, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }
        // LU (i-1, j-1)
        if(isBound(i-1, j-1, board) && board[i-1][j-1] == nextChar && board[i-1][j-1] != '.') {
            board[i][j] = '.';
            if(backtracking(board, word, i-1, j-1, idx+1)) {
                char ch = word.charAt(idx);
                board[i][j] = ch;
                return true;
            }
        }
        char ch = word.charAt(idx);
        board[i][j] = ch;
        return false;
    }

    private static boolean isBound(int i, int j, char[][] board) {
        return i < board.length && j < board[0].length && i >= 0 && j >= 0;
    }
}

/*
Wrong ans:

6
df dec dfd fd ded e
4 2
f f
d e
f b
b e

my o/p:
df e

Actual o/p:
df e fd

 */