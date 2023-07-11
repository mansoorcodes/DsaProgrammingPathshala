package M2GearingUp.Recursion.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_HW_TowerOfHanoi {
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
        int []currMoves = {0};
        boolean[] flag = {false};
        toh(N, source, destination, helper, moveNumber, currMoves, ans, flag);
        return ans;
    }

    private static void toh(int N, int source, int destination, int helper, int moveNumber, int []currMoves, List<Integer> ans, boolean[] flag) {
        // for Smaller i/p na helper miku destination avutundi.
        // for smallest i.e., base case ki kuda na helper base yokka destination avutundi..
        if(N == 1){
            currMoves[0]++;
            // here also same logic applies I'm moving my 1 disk from src to dest.
            if(currMoves[0] == moveNumber && !flag[0]) {
                flag[0] = true;
                ans.add(source);
                ans.add(destination);
                return;
            }
            return;
            // you have to return no matter what
            // because you reached base case / termination case
        }
        toh(N-1, source, helper, destination, moveNumber, currMoves, ans, flag);
        currMoves[0]++;
        // in this in order position I move my disk N from source to Destination
        if(currMoves[0] == moveNumber && !flag[0]) {
            flag[0] = true;
            ans.add(source);
            ans.add(destination);
            return;
        }
        if(flag[0]) return;
        toh(N-1, helper, destination, source, moveNumber, currMoves, ans, flag);
    }
}
