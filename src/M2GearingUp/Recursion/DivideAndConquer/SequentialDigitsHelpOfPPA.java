package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequentialDigitsHelpOfPPA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        System.out.println(sequentialDigits(low, high));
    }

    private static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
//        int ld = Integer.toString(low).length();
//        int hd = Integer.toString(high).length();
//        int [] numbers = new int[10];
        addAllValidNumbersToList(ans,1, low, high, 1, 1, 1);

        System.out.println(ans.size());
        return ans;
    }
    private static void addAllValidNumbersToList(List<Integer> ans, int currNum, int low, int high, int currDig, int startIdx, int endIdx){
        if(currNum >= low && currNum <= high){
            // pilla kaluva code...
            ans.add(currNum);
        }
        if(currNum > high){
            return;
        }

        int i = currDig + 1;
//        numbers[currDig] = currDig;
//        int temp = currNum;
        while (currNum <= high){
            StringBuilder sb = new StringBuilder(Integer.toString(currNum) + i);
            sb.deleteCharAt(0);
//            numbers[endIdx] = i;
            currNum = Integer.parseInt(String.valueOf(sb));
            if(endIdx < 9) addAllValidNumbersToList(ans, Integer.parseInt(String.valueOf(sb)), low, high, currDig+1, startIdx+1, endIdx+(i-1));
            i++;
        }
    }
}
