package M1BeginWithProgramming.cToCPP;

import java.util.HashMap;
import java.util.Scanner;

public class DiverseSubStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int len = scn.nextInt();
            String str = scn.next();
            int ans = len;
            for (int subStrLen = 2; subStrLen <= 100; subStrLen++) {
                for (int i = 0; i <= len -subStrLen; i++) { // for 2_subStrLen run n-1 times
                    if(isDiverse(str.substring(i,i+subStrLen))) ans++;
                }
            }
            System.out.println(ans);
        }
    }

    private static boolean isDiverse(String subStr) {
        HashMap<Integer, Integer> diverseMap = new HashMap<>();
        int digCount = 0;
        for (int i = 0; i < subStr.length(); i++) {
            int d = (subStr.charAt(i) - '0');
            if(diverseMap.containsKey(d)) diverseMap.replace(d,diverseMap.get(d)+1);
            else{
                diverseMap.put(d,1);
                digCount ++;
            }
        }
        for (Integer value : diverseMap.values()) {
            if(value > digCount) return false;
        }
        return true;
    }
}
