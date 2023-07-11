package M2GearingUp.Backtracking.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerbalArithmeticPuzzleAnother {
    static List<Character> nonZeroLetters;
    static StringBuilder sb;
    static boolean ansFound;
    public static void main(String[] args) {
        String[] words = {"SIX","SEVEN","SEVEN"};
        String result =  "TWENTY";
        ansFound = false;
        System.out.println(isSolvable(words, result));
    }
    public static boolean isSolvable (String[] words, String result) {
        sb = new StringBuilder();
        // now I want to know where I can't put 0
        nonZeroLetters = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j< words[i].length(); j++){
                if(j == 0) nonZeroLetters.add(words[i].charAt(j));
                sb.append(words[i].charAt(j));
            }
        }
        for(int j = 0; j< result.length(); j++){
            if(j == 0) nonZeroLetters.add(result.charAt(j));
            sb.append(result.charAt(j));
        }
        char[] unqCharArr = new char[sb.length()];
        for(int i = 0; i<sb.length(); i++) unqCharArr[i] = sb.charAt(i);
        Arrays.sort(unqCharArr);
        System.out.println(Arrays.toString(unqCharArr));
        sb = new StringBuilder();
        char previous = unqCharArr[0];
        sb.append(previous);
        for(int i = 1; i<unqCharArr.length; i++){
            char current = unqCharArr[i];
            if(current != previous) sb.append(current);
            previous = current;
        }
        System.out.println(sb);
        System.out.println(nonZeroLetters);
        ansFound = false;
        int[] digCharMap = new int[26];
        Arrays.fill(digCharMap, -1);
        helper(words, result, 0, new boolean[10], digCharMap);
        return ansFound;
    }
    public static void helper
            (String[] words, String result, int idx,
             boolean[] usedNumbers, int[] digCharMap){
        // System.out.println(idx+" "+ sb.length());
        if(ansFound) return;
        if(idx == sb.length()){
            // System.out.print("Base Case Hit???");
            int[] wordsIntoNumbers = new int[words.length];
            int resultIntoNumbers;
            for(int i = 0; i<words.length; i++){
                StringBuilder numInStr = new StringBuilder();
                for(int j = 0; j< words[i].length(); j++){
                    char temp = words[i].charAt(j);
                    numInStr.append(digCharMap[temp - 'A']);
                }
                // System.out.print(numInStr);
                int num = Integer.parseInt(numInStr.toString());
                wordsIntoNumbers[i] = num;
            }
            StringBuilder numInStr = new StringBuilder();
            for(int j = 0; j< result.length(); j++){
                char temp = result.charAt(j);
                numInStr.append(digCharMap[temp - 'A']);
            }
            resultIntoNumbers = Integer.parseInt(numInStr.toString());
            int lhs = 0;
            for(int i = 0; i<wordsIntoNumbers.length; i++){
                // System.out.print(wordsIntoNumbers[i]+" ");
                lhs += wordsIntoNumbers[i];
            }
            // System.out.print(resultIntoNumbers+" ");
            if(lhs == resultIntoNumbers) {
                ansFound = true;
            }
            return;
        }
        char curr = sb.charAt(idx);
        for(int i = 0; i<= 9; i++){
            if(i == 0 && isNonZeroChar(curr, nonZeroLetters)) continue;
            if(!usedNumbers[i]){
                usedNumbers[i] = true;
                digCharMap[curr - 'A'] = i;
                helper(words,result, idx+1, usedNumbers, digCharMap);
                usedNumbers[i] = false;
                digCharMap[curr - 'A'] = -1;
            }
        }
    }
    public static boolean isNonZeroChar
            (char curr, List<Character> nonZeroLetters){
        for(int i = 0; i< nonZeroLetters.size(); i++){
            if(curr == nonZeroLetters.get(i)) return true;
        }
        return false;
    }
}
