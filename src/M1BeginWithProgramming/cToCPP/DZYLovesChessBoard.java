package M1BeginWithProgramming.cToCPP;

import java.util.Arrays;
import java.util.Scanner;

public class DZYLovesChessBoard {
    // my approach is very BIGGGG CHutiya approach I failed misera fuck bully in this.....
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();

        String [] arr = new String[rows];
        for (int row = 0; row < rows; row++) {
            arr [row] = scn.next();
        }
        char [][] chessBoard = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            chessBoard [row] = arr[row].toCharArray();
        }

        // this is normal i/p . above is array of strings --> converted into 2d array of characters.
//        char [] [] chessBoard = new char[rows][columns];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                chessBoard [i][j] = scn.next().charAt(0);
//            }
//        }
        // solution begins
        // notWorkingAndDumbSolution(chessBoard, rows, columns);
        workingSolution(chessBoard, rows, columns);

    }

    private static void workingSolution(char[][] chessBoard, int rows, int columns) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                char ch = chessBoard [row][col];
                if(ch == '.'){
                    if((row + col) % 2 == 0) chessBoard [row][col] = 'B';
                    else chessBoard [row][col] = 'W';
                }
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(chessBoard [row][col]);
            }
            System.out.println();
        }
    }

    private static void notWorkingAndDumbSolution(char[][] chessBoard, int rows, int columns) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                char ch = chessBoard [row][col];
                char up = '@', left = '@';
                if(row > 0) {
                    up = chessBoard [row-1][col];
                }
                if(col > 0) {
                    left = chessBoard [row][col-1];
                }

                if(ch == '.'){
                    if(row == 0 && col == 0){
                        chessBoard [row][col] = 'B';
                    } else if ((up == 'W' || up == '_' || row == 0)&&(left == 'W' || left == '_' || col == 0)) {
                        chessBoard [row][col] = 'B';
                    } else if ((up == 'B' || up == '_' || row == 0)&&(left == 'B' || left == '_' || col == 0)) {
                        chessBoard [row][col] = 'W';
                    }
                }
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(chessBoard [row][col]);
            }
            System.out.println();
        }
    }
}
