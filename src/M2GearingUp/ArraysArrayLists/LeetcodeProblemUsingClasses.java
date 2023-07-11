/*package M2GearingUp.ArraysArrayLists;

public class LeetcodeProblemUsingClasses {
    class NumMatrix {

        public NumMatrix(int[][] arr) {
            // pre computation prefix sum of matrices
            // psum[][] rows sum.
            int m = arr.length;
            int n = arr[0].length;
            for(int i = 0; i<m; i++){
                for(int j = 1; j<n; j++){
                    arr[i][j] = arr[i][j-1] + arr[i][j];
                }
            }
            // psum[][] column sum --> here matrix sum
            for(int j = 0; j<n; j++){
                for(int i = 1; i<m; i++){
                    arr[i][j] = arr[i-1][j] + arr[i][j];
                }
            }
        }

        public int sumRegion(int i1, int j1, int i2, int j2) {
            int sum = 0;
            sum = arr[i2][j2];
            sum -= (i1>0? arr[i1-1][j2]: 0);
            sum -= (j1>0? arr[i2][j1-1]: 0);
            sum += (i1>0 && j1>0? arr[i1-1][j1-1]: 0);
            return sum;
        }
    }

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */




