package M2GearingUp.Backtracking.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeetCodeProblem {
    public static int cntOfPermutations;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String tiles = scn.next();
        System.out.println("Final Boss: " +numTilePossibilities(tiles));
    }
    public static int numTilePossibilities(String tiles) {
        cntOfPermutations = 0;
        char [] nums = new char[tiles.length()];
        for(int i = 0; i< nums.length; i++){
            nums[i] = tiles.charAt(i);
        }
        Arrays.sort(nums);
        List<List<Character>> ansList = subsetsWithDup(nums);


        System.out.println(ansList);


        for(int i = 1; i< ansList.size(); i++){
            System.out.println("Mana ansList size: "+ansList.size());
            System.out.println("okkokka list of unq subsets: "+ ansList.get(i));
            StringBuilder sb = new StringBuilder();
            System.out.println("ansList.get(i).size() is good?: "+ ansList.get(i).size());
            for(int j = 0; j< ansList.get(i).size(); j++){
                System.out.println("okkokka char in a subset: "+ansList.get(i).get(j));
                char ch = ansList.get(i).get(j);
                System.out.println("Sus area: "+ch);
                sb.append(ch);
                System.out.println("Append Ayinda?: "+sb);
            }
            System.out.println("SB: "+sb);
            printAllPermutationsUsingBacktracking3UsingVivekamRotate(sb, 0);
        }
        return cntOfPermutations;
    }


    private static void printAllPermutationsUsingBacktracking3UsingVivekamRotate(StringBuilder sb, int idx) {
        System.out.println("Ikadaki vachava? ");
        if(idx == sb.length()-1){
            cntOfPermutations++;
            return;
        }
        char prev = sb.charAt(idx);
        for (int i = idx; i < sb.length(); i++) {
            char curr = sb.charAt(i);
            rightRotate(idx, i, sb);
            if(i == idx || (i != idx && prev != curr)) printAllPermutationsUsingBacktracking3UsingVivekamRotate(sb, idx+1);
            leftRotate(idx, i, sb);
            prev = curr;
        }
    }

    private static void leftRotate(int idx, int i, StringBuilder sb) {
        char temp = sb.charAt(idx);
        for (int k = idx; k <= i-1; k++) {
            sb.setCharAt(k, sb.charAt(k+1));
        }
        sb.setCharAt(i, temp);
    }

    private static void rightRotate(int idx, int i, StringBuilder sb) {
        char temp = sb.charAt(i);
        for (int k = i; k >= idx+1; k--) {
            sb.setCharAt(k, sb.charAt(k-1));
        }
        sb.setCharAt(idx, temp);
    }





    // this copied from Striver...
    // Need to Re-learn...
    public static void findSubsets
    (int ind, char[] nums, List<Character> ds, List<List<Character>> ansList) {
        ansList.add(new ArrayList<>(ds));
        for(int i = ind; i<nums.length; i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }

    }
    public static List<List<Character>> subsetsWithDup(char[] nums) {
        Arrays.sort(nums);
        List<List<Character>> ansList = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }
}
