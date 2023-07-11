
package M2GearingUp.Recursion.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_HW_TowerOfHanoi_Second_Time {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfPiles = scn.nextInt();
        int moveNumber = scn.nextInt();
        System.out.println(shiftPile(noOfPiles, moveNumber));
    }
    static List<Integer> shiftPile(int N, int moveNumber){
        // code here
        List<Integer> ans = new ArrayList<>();
        int source = 1;
        int destination = 2;
        int helper = 3;
        int []totalMoves = {moveNumber};
        toh(N, source, destination, helper, totalMoves, ans);
        return ans;
    }

    private static void toh(int N, int source, int destination, int helper, int[] totalMoves, List<Integer> ans) {
        // for Smaller i/p na helper miku destination avutundi.
        // for smallest i.e., base case ki kuda na helper base yokka destination avutundi..
        if(N == 0){
            return;
        }
        if(totalMoves[0] == 0) return;
        toh(N-1, source, helper, destination, totalMoves, ans);
        // in this In-order position, I move my disk N from source to Destination
        totalMoves[0]--;
        if(totalMoves[0] == 0){
            ans.add(source, destination);
            System.out.println(ans);
            return;
        }
        toh(N-1, helper, destination, source, totalMoves, ans);
    }
}
