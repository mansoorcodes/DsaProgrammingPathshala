package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class VowelsInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        // Take nextLine() to take input as string b/c
        // next() don't take i/p after a white space...

        findVowles1(str); // my basic ugly approach
        findVowles2(str); // Vivek sir approach much cleaner much readable...
    }

    private static void findVowles2(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            for(int j = 0; j< vowels.length(); j++){
                char vow = vowels.charAt(j);
                if(ch == vow){
                    count++;
                    break;
                }
            }
        }
        System.out.println("no of vowels are: "+ count);
    }

    private static void findVowles1(String str) {
        int len = str.length();
        int count = 0;
        for(int i = 0; i< len; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        System.out.println("no of vowels are: "+ count);
    }
}
