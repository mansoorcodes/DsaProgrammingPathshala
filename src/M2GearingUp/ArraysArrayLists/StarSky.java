package M2GearingUp.ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class StarSky {
    // this is not working!!!
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfStars = scn.nextInt(), queries = scn.nextInt(), maxBri = scn.nextInt();
        int [][] starsInfoInitially = new int[noOfStars][3];
        for (int i = 0; i < starsInfoInitially.length; i++) {
            for (int j = 0; j < starsInfoInitially[0].length; j++) {
                starsInfoInitially[i][j] = scn.nextInt();
            }
        }
        int [][] rectangle = new int[queries][5]; // here indexing is from 1 in problem
        // here indexing is like cartesian geometry. So change rows.. {row = 99-row}
        // so change the given indices to our desired matrix indices.
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[0].length; j++) {
                if(j == 1 || j == 3) rectangle[i][j] = 99- scn.nextInt();
                else rectangle[i][j] = scn.nextInt();
            }
        }
        // now filling 2d arrays of all possible times.
        int [][][] pSum = new int[maxBri+1][100][100];
        // initialize all with -1 first...
//        for (int t = 0; t <= maxBri; t++) {
//            for (int i = 0; i < 100; i++) {
//                Arrays.fill(pSum[t][i], -1);
//            }
//        }
        for (int i = 0; i < starsInfoInitially.length; i++) {
            int r = starsInfoInitially[i][0] -1;
            int c = starsInfoInitially[i][1] -1;
            pSum[0][r][c] = starsInfoInitially[i][2]; // this has initial brightness at t = 0;
        }
        for (int t = 1; t <= maxBri; t++) { // filling for all times.
            for (int i = 0; i < starsInfoInitially.length; i++) {
                int r = starsInfoInitially[i][0] -1;
                int c = starsInfoInitially[i][1] -1;
                pSum[t][r][c] = starsInfoInitially[i][2];
            }
        }
        // now tricky part prefix sum of all 2d arrays of all possible times
        for (int t = 0; t <= maxBri; t++) {
            // if any bri is -1 then make it to 0 on the first column.
//            for (int i = 0; i < 100; i++) {
//                if(pSum[t][i][0] == -1) pSum[t][i][0] = 0;
//            }
            // prefix sum of rows
            for (int i = 0; i < 100; i++) {
                for (int j = 1; j < 100; j++) {
//                    if(pSum[t][i][j] == -1){
//                        pSum[t][i][j] = pSum[t][i][j-1];
//                    }else{
//                        pSum[t][i][j] += pSum[t][i][j-1];
//                    }
                    pSum[t][i][j] += pSum[t][i][j-1];
                }
            }
            // prefix sum of columns
            for (int j = 0; j < 100; j++) {
                for (int i = 1; i < 100; i++) {
                    pSum[t][i][j] += pSum[t][i-1][j];
                }
            }
        }
        // now traverse the rectangle and find our desired sum...
        for (int i = 0; i < rectangle.length; i++) {
            // given BL and TR --> convert into TL and BR
            int t = rectangle[i][0]; // time
            t %= (maxBri+1);
            int xi1 = rectangle[i][1], xi2 = rectangle[i][3];
            int yi1 = rectangle[i][2], yi2 = rectangle[i][4];
            // TL and BR
            int x1 = xi2-1, y1 =- yi1 -1;
            int x2 = xi1 -1, y2 = yi2 -1;
            int ans = sumRegion(pSum, t, x1, y1, x2, y2);
            System.out.println(ans);
        }
    }
    //
    public static int sumRegion(int [][][] pSum, int t, int i1, int j1, int i2, int j2) {
        int sum = 0;
        sum = pSum[t][i2][j2];
        sum -= (i1>0? pSum[t][i1-1][j2]: 0);
        sum -= (j1>0? pSum[t][i2][j1-1]: 0);
        sum += (i1>0 && j1>0? pSum[t][i1-1][j1-1]: 0);
        return sum;
    }
}
