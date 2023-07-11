package M2GearingUp.Backtracking.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class RatMazeMultipleJumps {
    // Finally AC...!
    static boolean [] ansFound;
    static int [][] ans;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(ShortestDistance(matrix)));
    }
    public static int[][] ShortestDistance(int[][] matrix){
        int n = matrix.length;
        int [][] paths = new int[n][n];
        ansFound = new boolean[1];
        // another method
        backtrackAnother(matrix, paths, 0, 0, n);
        if(ansFound[0]) {
            paths[0][0] = 1;
            return paths;
        }
        else{
            return new int[][]{{-1}};
        }


//        backtrack(matrix, paths, 0, 0, n);
////        if(ansFound[0]) return ans;
////        else{
////            return new int[][]{{-1}};
////        }
    }
    public static void backtrack(int [][] matrix, int [][] paths, int i, int j, int n){
        if(i == n-1 && j == n-1){
            // System.out.println("answer dorikinda");
            ansFound[0] = true;
            ans = new int[n][n];
            for (int k = 0; k < ans.length; k++) {
                for (int k2 = 0; k2 < ans.length; k2++) {
                    ans[k][k2] = paths[k][k2];
                }
            }
            ans[0][0] = 1;
            return;
        }
        int maxJumps = matrix[i][j];
        for (int jump = 1; jump <= maxJumps; jump++) {
            // first Right
            if(!ansFound[0]){
                if(j + jump < n && matrix[i][j + jump] != 0 || isDestination(i, j + jump, n)){
                    paths[i][j+jump] = 1;
                    // System.out.println("right from i,j to RIGHT: "+ i+" "+j+" to "+i+" "+(j+jump));
                    backtrack(matrix, paths, i, j+jump, n);
                    paths[i][j+jump] = 0;
                }

            }
            // next Down
            if (!ansFound[0]){
                if(i + jump < n && matrix[i+jump][j] != 0 || isDestination(i+jump, j, n)){
                    paths[i+jump][j] = 1;
                    // System.out.println("down from i,j to DOWN: "+ i+" "+j+" to "+(i+jump)+" "+j);
                    backtrack(matrix, paths, i+jump, j, n);
                    paths[i+jump][j] = 0;
                }
            }
        }
    }

    private static boolean isDestination(int i, int j, int n) {
        return i == n - 1 && j == n - 1;
    }


    public static void backtrackAnother(int [][] matrix, int [][] paths, int i, int j, int n){
        if(i == n-1 && j == n-1){
            // System.out.println("answer dorikinda");
            ansFound[0] = true;
//            ans = new int[n][n];
//            for (int k = 0; k < ans.length; k++) {
//                for (int k2 = 0; k2 < ans.length; k2++) {
//                    ans[k][k2] = paths[k][k2];
//                }
//            }
//            ans[0][0] = 1;
            return;
        }
        int maxJumps = matrix[i][j];
        for (int jump = 1; jump <= maxJumps; jump++) {
            // first Right
            if(j + jump < n && matrix[i][j + jump] != 0 || isDestination(i, j + jump, n)){
                paths[i][j+jump] = 1;
                // System.out.println("right from i,j to RIGHT: "+ i+" "+j+" to "+i+" "+(j+jump));
                backtrackAnother(matrix, paths, i, j+jump, n);
                if(ansFound[0]) return;
            }
            // next Down
            if(i + jump < n && matrix[i+jump][j] != 0 || isDestination(i+jump, j, n)){
                paths[i+jump][j] = 1;
                // System.out.println("down from i,j to DOWN: "+ i+" "+j+" to "+(i+jump)+" "+j);
                backtrackAnother(matrix, paths, i+jump, j, n);
                if(ansFound[0]) return;
            }
            paths[i][j+jump] = 0;
        }

    }
}

/*

4
2 0 1 4
0 1 0 3
0 0 2 1
3 2 4 0
this is failing

4
2 1 0 0
3 0 0 1
0 1 0 1
0 0 0 1
tis is passing
 */