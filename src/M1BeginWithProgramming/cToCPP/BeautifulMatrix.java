package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [][] arr = new int[5][5];
        int row1 = 0, col1 = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                arr[row][col] = scn.nextInt();
                if(arr[row][col] == 1) {
                    row1 = row+1;
                    col1 = col+1;
                }
            }
        }
        System.out.println(Math.abs(row1 -3)+Math.abs(col1-3));
    }
}
