package M2GearingUp.Backtracking.Problems;

import java.util.Arrays;

public class practiceCharArrayDefaultValues {
    public static void main(String[] args) {
        char ch = (char)0;
        System.out.println(ch);
        char [] digitAlphaMap = new char[10];
        Arrays.fill(digitAlphaMap, (char) 0);
        System.out.println(Arrays.toString(digitAlphaMap));
        digitAlphaMap[4] = 'a';
        // We can't put -1 into a char value...!
        for (int i = 0; i < 10; i++) {
            if(digitAlphaMap[i] == 0) digitAlphaMap[i] = (char) (i+65);
        }
        System.out.println(Arrays.toString(digitAlphaMap));
    }
}

