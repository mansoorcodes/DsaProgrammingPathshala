package M2GearingUp.Backtracking.Theory;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodechefProblemVersion
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- >0){
            int n = scn.nextInt();
            int [][] maze = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maze[i][j] = scn.nextInt();
                }
            }
            printPathsForRat(maze, 0, 0, new StringBuilder());
            System.out.println();
        }
    }

    private static void printPathsForRat(int[][] maze, int i, int j, StringBuilder sb) {
        // As there are 4 paths the rat rounds nd rounds inside maze never reaches destination
        // so implement visited logic...!!!
        if(maze[i][j] == 0) return;
        if(i == maze.length-1 && j == maze[0].length-1) {
            System.out.print(sb+" ");
            return;
        }

        // D
        sb.append('D');
        if(i <= maze.length-2){
            if(maze[i+1][j] == 1){
                maze[i][j] = -1;
                printPathsForRat(maze, i+1, j, sb);
                maze[i][j] = 1;
            }
        }
        sb.deleteCharAt(sb.length()-1);

        // L
        sb.append('L');
        if(j >= 1){
            if(maze[i][j-1] == 1){
                maze[i][j] = -1;
                printPathsForRat(maze, i, j-1, sb);
                maze[i][j] = 1;
            }
        }
        sb.deleteCharAt(sb.length()-1);

        // move right if right cell has 0 or right cel != 1
        sb.append('R');
        if(j <= maze[0].length-2) {
            if(maze[i][j+1] == 1){
                maze[i][j] = -1;
                printPathsForRat(maze, i, j+1, sb);
                maze[i][j] = 1;
            }
        }
        sb.deleteCharAt(sb.length()-1);

        // U
        sb.append('U');
        if(i >= 1){
            if(maze[i-1][j] == 1){
                maze[i][j] = -1;
                printPathsForRat(maze, i-1, j, sb);
                maze[i][j] = 1;
            }
        }
        sb.deleteCharAt(sb.length()-1);
    }
}
