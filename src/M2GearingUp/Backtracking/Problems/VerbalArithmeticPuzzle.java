package M2GearingUp.Backtracking.Problems;

public class VerbalArithmeticPuzzle {
    static boolean ansFound;
    public static void main(String[] args) {
        String[] words = {"SEND","MORE"};
        String result = "MONEY";
        ansFound = false;
        System.out.println(isSolvable(words, result));
    }
    public static boolean isSolvable(String[] words, String result) {
        int[] alphaNumberMap = new int[26];
        for (int i = 0; i < 26; i++) {
            alphaNumberMap[i] = -1;
        }
        int[] usedDigits = new int[10];
        int [] allNumbers = new int[words.length+1];
        helper(words, result, 0, 0, alphaNumberMap, usedDigits, allNumbers);
        return ansFound;
    }

    private static void helper(String[] words, String result, int idx, int subIdx, int[] alphaNumberMap, int[] usedDigits, int[] allNumbers) {
        if(ansFound) return;
        if(idx == words.length+1 && subIdx == 0){
            ansFound = true;
            return;
        }
        if(idx != words.length){
            // words[]
            char ch = words[idx].charAt(subIdx);
            // first send [1-9]
            for (int i = 1; i <= 9; i++) {
//                int equalantIdx = getEqualantIndex(idx, subIdx, words, result);
                if(usedDigits[i] == 0){
                    allNumbers[idx] *= 10; // 23 --> 23*10 --> 230 --> 230+7 --> 237
                    allNumbers[idx] += i;
                    usedDigits[i]++;
                    alphaNumberMap[ch-'A'] = i;
                    if(subIdx == words[idx].length()-1){
                        helper(words, result, idx +1, 0, alphaNumberMap, usedDigits, allNumbers);
                    }else {
                        helper(words, result, idx, subIdx+1, alphaNumberMap, usedDigits, allNumbers);
                    }
                    alphaNumberMap[ch-'A'] = -1;
                    usedDigits[i]--;
                    allNumbers[idx] /= 10;
                }
            }
            if(subIdx != 0){
                if(usedDigits[0] == 0){
                    allNumbers[idx] *= 10; // 23 --> 23*10 --> 230 --> 230+0 --> 230
                    allNumbers[idx] += 0;
                    usedDigits[0]++;
                    alphaNumberMap[ch-'A'] = 0;
                    if(subIdx == words[idx].length()-1){
                        helper(words, result, idx +1, 0, alphaNumberMap, usedDigits, allNumbers);
                    }else {
                        helper(words, result, idx, subIdx+1, alphaNumberMap, usedDigits, allNumbers);
                    }
                    alphaNumberMap[ch-'A'] = -1;
                    usedDigits[0]--;
                    allNumbers[idx] /= 10;
                }
            }
        }else {
            char ch = result.charAt(subIdx);
            // first send [1-9]
            for (int i = 1; i <= 9; i++) {
//                int equalantIdx = getEqualantIndex(idx, subIdx, words, result);
                if(usedDigits[i] == 0){
                    allNumbers[idx] *= 10; // 23 --> 23*10 --> 230 --> 230+7 --> 237
                    allNumbers[idx] += i;
                    usedDigits[i]++;
                    alphaNumberMap[ch-'A'] = i;
                    if(subIdx == result.length()-1){
                        helper(words, result, idx +1, 0, alphaNumberMap, usedDigits, allNumbers);
                    }else {
                        helper(words, result, idx, subIdx+1, alphaNumberMap, usedDigits, allNumbers);
                    }
                    alphaNumberMap[ch-'A'] = -1;
                    usedDigits[i]--;
                    allNumbers[idx] /= 10;
                }
            }
            if(subIdx != 0){
                if(usedDigits[0] == 0){
                    allNumbers[idx] *= 10; // 23 --> 23*10 --> 230 --> 230+0 --> 230
                    allNumbers[idx] += 0;
                    usedDigits[0]++;
                    alphaNumberMap[ch-'A'] = 0;
                    if(subIdx == result.length()-1){
                        helper(words, result, idx +1, 0, alphaNumberMap, usedDigits, allNumbers);
                    }else {
                        helper(words, result, idx, subIdx+1, alphaNumberMap, usedDigits, allNumbers);
                    }
                    alphaNumberMap[ch-'A'] = -1;
                    usedDigits[0]--;
                    allNumbers[idx] /= 10;
                }
            }
        }
    }

    private static int getEqualantIndex(int idx, int subIdx, String[] words, String result) {
        int ans = 0;
        if(idx != -1){
            for (int i = 0; i < idx; i++) {
                ans+= words[i].length();
            }
            ans+= subIdx;
            return ans;
        }
        else {
            for (int i = 0; i < words.length; i++) {
                ans+= words[i].length();
            }
            ans+= subIdx;
            return ans;
        }
    }
}
