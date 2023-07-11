package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class CopyAString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch);
        }
        System.out.println("Copied string is :"+sb);
        // StringBuilder.equals() method always returns false.
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println("are both strings equal"+sb.equals(sb1));
    }
}
