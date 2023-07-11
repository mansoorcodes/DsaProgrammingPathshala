package M1BeginWithProgramming.cToCPP;

import java.util.HashMap;
import java.util.Scanner;

public class CFContest5_19_23A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0){
            int n = scn.nextInt();
            String str = scn.next();
            HashMap<String, Integer> freq = new HashMap<>();
            for (int i = 0; i <= n-2; i++) {
                String note = ""+ str.charAt(i) +str.charAt(i+1);
                if(!freq.containsKey(note))freq.put(note, 1);
            }
            System.out.println(freq.size());
        }
    }
}
