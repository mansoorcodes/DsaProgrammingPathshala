package M2GearingUp.ArraysArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<List<Integer>> list = generate(n);
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        // JAVA ArrayList is weird AS FUCK!!!
        for(int i = 0; i<numRows; i++){
            ans.add(new ArrayList());
        }
        // the above thing should be initialised...!!!
        for(int rowIndex = 0; rowIndex< numRows; rowIndex++){
            int N = rowIndex;
            int R = 0;
            int NCR = 1;
            ans.get(rowIndex).add(NCR);
            for(R = 1; R<=N/2; R++){
                NCR = (int)((long)NCR*(N-R+1)/R);
                ans.get(rowIndex).add(NCR);
            }
            int i = (N%2 ==0? R-2: R-1);
            for(R = N/2 +1; R<= N; R++){
                ans.get(rowIndex).add(R, ans.get(rowIndex).get(i));
                i--;
            }
        }
        return ans;
    }
}
