package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class MaxNoOfVowelsInKLenSubString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- >0){
            String str = scn.next();
            int k = scn.nextInt();
            // k len sliding Window
            int maxVowels = 0;
            for (int i = 0; i < k; i++) {
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') maxVowels++;
            }
            int currVowels = maxVowels;
            for (int i = k; i < str.length() -k; i++) {
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') currVowels++;
                ch = str.charAt(i-k);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') currVowels--;
                maxVowels = Math.max(maxVowels, currVowels);
            }
            System.out.println(maxVowels);
        }
    }
}
