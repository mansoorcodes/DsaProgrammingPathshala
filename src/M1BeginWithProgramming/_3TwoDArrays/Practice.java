package M1BeginWithProgramming._3TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        int [] [] arr = {
                {2,4,5,6},
                {5,2,3},
                {6,5},
                {8, 8, 0, 3,2,1}
        };
        System.out.println(arr);

//        int[][] arr2D = new int [4][];
//        for(int i = 0; i<4; i++){  // taking variable inputs in 2d arrays in java
//            System.out.print("how many columns for "+i+"-th row: ");
//            int col = scn.nextInt();
//            arr2D[i] = new int[col];
//            for(int j = 0; j<col; j++){
//                arr2D[i][j] = scn.nextInt();
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            System.out.println(Arrays.toString(arr2D[i]));
//        }

        System.out.println("Printing using for each loop: ");
        for (int[] a: arr ) {
            System.out.print(Arrays.toString(a)+"\n");
        }


    }
}
