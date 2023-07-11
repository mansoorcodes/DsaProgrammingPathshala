package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][2];
        int count = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 2; col++) {
                arr[row][col] = scn.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i][0] == arr[j][1]) count++;
                if(arr[i][1] == arr[j][0]) count++;
            }
        }
        System.out.println(count);
    }
}
