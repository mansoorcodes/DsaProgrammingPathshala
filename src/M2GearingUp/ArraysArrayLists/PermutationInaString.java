package M2GearingUp.ArraysArrayLists;

import java.util.HashMap;
import java.util.Scanner;

public class PermutationInaString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0){
            String s1 = scn.next();
            String s2 = scn.next();
            // System.out.println(doesS2ContainPermutationOfS1(s1, s2) ?"True": "False");
            System.out.println(solve(s1, s2)? "True":"False"); // this also failed...
        }
    }

    private static boolean solve(String s1, String s2) {
        // use 2 maps
        if(s1.length() > s2.length()) return false;
        int k = s1.length();
        HashMap <Character, Integer> ref = new HashMap<>();
        HashMap <Character, Integer> curr = new HashMap<>();
        // fill the ref map
        for (int i = 0; i < k; i++) {
            char ch = s1.charAt(i);
            int val = (ref.getOrDefault(ch, 0));
            ref.put(ch, val+1);
        }
        // first window
        for (int i = 0; i < k; i++) {
            char ch = s2.charAt(i);
            if(ref.containsKey(ch)){
                int val = (curr.getOrDefault(ch, 0));
                curr.put(ch, val+1);
            }
        }
        if(checkIfCurrHasRequiredElem(ref, curr)) return true;

        // next windows
        for (int i = k; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            int val = (curr.getOrDefault(ch,0));
            if(ref.containsKey(ch)) curr.put(ch, val+1);
            ch = s2.charAt(i-k);
            val = (curr.getOrDefault(ch,0));
            if(ref.containsKey(ch)) curr.put(ch,val-1);
            if(checkIfCurrHasRequiredElem(ref, curr)) return true;
        }
        return false;
    }

    private static boolean checkIfCurrHasRequiredElem(HashMap<Character, Integer> ref, HashMap<Character, Integer> curr) {
        for (char ch : curr.keySet()) {
            int val = ref.get(ch);
            if(val != curr.get(ch)) return false;
        }
        return true;
    }

    private static boolean doesS2ContainPermutationOfS1(String s1, String s2) {
        // this does'nt Work fuck........

        // FUCK....
        int k = s1.length();

        System.out.println("k: "+k);

        if(s1.length() > s2.length()) return false;
        // use Hashmap to store s1 elements and to retrieve in O(1) time
        HashMap <Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char ch = s1.charAt(i);
            mp.put(ch, 0);
        }

        System.out.println("hash map: "+mp);

        int hashLegalCount = 0;
        int legalElementCount = 0;
        for (int i = 0; i < k; i++) {
            char ch = s2.charAt(i);
            if(mp.containsKey(ch)) {
                mp.replace(ch,1);
                hashLegalCount++;
            }
        }

        System.out.println("in first window Legal Cnt: "+legalElementCount);

        if(legalElementCount == k) return true;
        for (int i = k; i < s2.length(); i++) {
            System.out.println("i,k : "+i+""+k);
            char ch = s2.charAt(i);
            if(mp.containsKey(ch)) legalElementCount++;
            System.out.print("after add: "+ch +legalElementCount);

            ch = s2.charAt(i-k);

            if(mp.containsKey(ch)) legalElementCount--;

            System.out.println(" || after removing: "+ch +legalElementCount);

            if(legalElementCount == k) return true;
        }
        return false;
    }
}
