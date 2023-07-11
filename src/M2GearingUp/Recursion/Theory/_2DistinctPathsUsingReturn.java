package M2GearingUp.Recursion.Theory;

import java.util.Scanner;

public class _2DistinctPathsUsingReturn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        System.out.println(countPaths(0,0,rows,cols));
        System.out.println(countPathsElegant(0, 0, rows, cols));
        System.out.println(countPathsMostElegantVIVEKAM(0,0, rows, cols));


        // StringBuilder path = new StringBuilder();
        // printPaths(0, 0, rows, cols, path);
    }

    private static int countPathsMostElegantVIVEKAM(int i, int j, int rows, int cols) {
        if(i == rows-1 || j == cols -1) return 1;
        return (countPathsMostElegantVIVEKAM(i, j+1, rows, cols) +
                countPathsMostElegantVIVEKAM(i+1, j, rows, cols));
    }

    private static void printPaths(int i, int j, int rows, int cols, StringBuilder path) {
        // complete this function in future...
    }

    private static int countPathsElegant(int i, int j, int rows, int cols) {
        if(i == rows-1 && j == cols-1) return 1;
        if(i == rows || j == cols) return 0;
        return countPaths(i, j+1, rows, cols) + countPaths(i+1, j, rows, cols);
    }

    private static int countPaths(int i, int j, int rows, int cols) {
        if(i == rows-1 && j == cols-1) return 1;
        int rightPaths = 0;
        if(j < cols-1) rightPaths = countPaths(i, j+1, rows, cols);
        int downPaths = 0;
        if(i < rows-1) downPaths = countPaths(i+1, j, rows, cols);
        return rightPaths + downPaths;
    }
}
