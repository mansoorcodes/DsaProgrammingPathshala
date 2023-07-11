package M2GearingUp.Backtracking.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Paths1 {
    static List<List<Integer>> path;
    static List<List<Integer>> pathVivekam;
    static List<List<Integer>> pathVivekam2;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = scn.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(maze));
        path = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        pos.add(0);
        pos.add(0);
        path.add(pos);
        pathVivekam = new ArrayList<>();
        pathVivekam2 = new ArrayList<>();
        printPathsForRat(maze, 0, 0);
        printPathsForRatVivekam(maze, 0, 0);
        printPathsForRatVivekam2(maze, 0, 0);
    }

    private static void printPathsForRatVivekam2(int[][] maze, int i, int j) {
        // this is little dumb I need to Refactor this little bit to work...!!!
//        if(i >= maze.length || j >= maze[0].length) return;
        if(i == maze.length-1 && j == maze[0].length-1) {
            System.out.println("Vachava");
            System.out.println(pathVivekam2);
            return;
        }else if(i == maze.length -1 && j >= maze[0].length -1) return;
        else if (j == maze[0].length -1 && i >= maze.length -1) return;

        List<Integer> pos = new ArrayList<>();
        pos.add(i);
        pos.add(j);
        pathVivekam2.add(pos);
        if( maze[i][j+1] == 0) printPathsForRatVivekam2(maze, i, j+1);
        if( maze[i+1][j] == 0) printPathsForRatVivekam2(maze, i+1, j);
        pathVivekam2.remove(pathVivekam2.size()-1);
    }

    private static void printPathsForRatVivekam(int[][] maze, int i, int j) {
        if(i == maze.length-1 && j == maze[0].length-1) {
            // teda answer for a below example test case...
            // need to be fixed...
            List<Integer> pos = new ArrayList<>();
            pos.add(i);
            pos.add(j);
            pathVivekam.add(pos);
            System.out.println(pathVivekam);
            pathVivekam.remove(pathVivekam.size()-1);
            // this is the fix for my teda answer remove ...!!!
            return;
        }
        List<Integer> pos = new ArrayList<>();
        pos.add(i);
        pos.add(j);
        pathVivekam.add(pos);
        // R , D
        if(j <= maze[0].length-2 && maze[i][j+1] == 0) printPathsForRatVivekam(maze, i, j+1);
        if(i <= maze.length-2 && maze[i+1][j] == 0) printPathsForRatVivekam(maze, i+1, j);
        pathVivekam.remove(pathVivekam.size()-1);
    }

    private static void printPathsForRat(int[][] maze, int i, int j) {
        if(i == maze.length-1 && j == maze[0].length-1) {
            System.out.println(path);
            return;
        }

        // move right if right cell has 0 or right cel != 1
        List<Integer> pos = new ArrayList<>();
        pos.add(i);
        pos.add(j+1);
        path.add(pos);
        if(j <= maze[0].length-2) {
            if(maze[i][j+1] == 0){
                printPathsForRat(maze, i, j+1);
            }
        }
        path.remove(path.size()-1);

        pos = new ArrayList<>();
        pos.add(i+1);
        pos.add(j);
        path.add(pos);
        if(i <= maze.length-2){
            if(maze[i+1][j] == 0){
                printPathsForRat(maze, i+1, j);
            }
        }
        path.remove(path.size()-1);
    }
}

/*

i/p
4
0 0 1 1
0 0 1 0
1 0 1 1
0 0 0 0

o/p
[[0, 0], [0, 1], [1, 1], [2, 1], [3, 1], [3, 2], [3, 3]]
[[0, 0], [1, 0], [1, 1], [2, 1], [3, 1], [3, 2], [3, 3]]

 */