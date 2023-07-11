package M2GearingUp.Backtracking.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char [] chArr = {'f', 'u', 'a', 'e', 'b', 'a', 'e', 'u'};
        Arrays.sort(chArr);
        System.out.println(chArr);










//        StringBuilder sb = new StringBuilder(scn.next());
//        System.out.println(sb);
//        swap(0, 3, sb);
//        System.out.println(sb);
//        int x = 3;
//        char ch = (char) (x + '0');
//        System.out.println(ch);
//
//        int n = 9;
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i<n; i++){
//            char ch1 = (char)(i+1 + '0');
//            sb.append(ch1);
//        }
//        System.out.println(sb);
    }

    private static void swap(int i, int i1, StringBuilder sb) {
        char ch = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(i1));
        sb.setCharAt(i1, ch);
    }
}
