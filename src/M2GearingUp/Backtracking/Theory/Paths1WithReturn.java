package M2GearingUp.Backtracking.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Paths1WithReturn {
//    static List<List<Integer>> path;
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
//        path = new ArrayList<>();
//        List<Integer> pos = new ArrayList<>();
//        pos.add(0);
//        pos.add(0);
//        path.add(pos);
        List<List<Integer>> ans = new ArrayList<>();
        System.out.println(printPathsForRat(maze, 0, 0, ans));
    }

    private static List<List<Integer>> printPathsForRat(int[][] maze, int i, int j, List<List<Integer>> ans) {
        if(i == maze.length-1 && j == maze[0].length-1) {
            // System.out.println(path);
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> curr = new ArrayList<>();
            curr.add(i);
            curr.add(j);
            res.add(curr);
            return res;
        }
        // R
//        List<Integer> pos = new ArrayList<>();
//        pos.add(i);
//        pos.add(j+1);
//        path.add(pos);
        if(j+1 < maze[0].length && maze[i][j+1] == 0){

            List<List<Integer>> res = printPathsForRat(maze, i, j+1, ans);
            List<Integer> curr = new ArrayList<>();
            curr.add(i);
            curr.add(j);
            for (int k = 0; k < res.size(); k++) {
                res.add(0, curr);
            }
            ans = new ArrayList<>(res);
        }
//        path.remove(path.size()-1);
        // D
//        pos = new ArrayList<>();
//        pos.add(i+1);
//        pos.add(j);
//        path.add(pos);
        if(i+1 < maze.length && maze[i+1][j] == 0) {
            List<List<Integer>> res = printPathsForRat(maze, i+1, j, ans);
            List<Integer> curr = new ArrayList<>();
            curr.add(i);
            curr.add(j);
            for (int k = 0; k < res.size(); k++) {
                res.add(0, curr);
            }
            ans.addAll(res);
        }
//        path.remove(path.size()-1);
        return ans;
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