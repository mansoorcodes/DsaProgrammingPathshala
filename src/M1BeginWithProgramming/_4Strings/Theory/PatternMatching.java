package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class PatternMatching {
    // to determine if the substring is present in given string or not
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        System.out.println(isSubstringPresent(str1, str2));

        //System.out.println(isSubstringPresent2(str1, str2));
    }

    private static boolean isSubstringPresent2(String str1, String str2) {
        for(int i = 0; i< str1.length() - str2.length() +1; i++){
            boolean isFound = str2.equals(str1.substring(i, i+str2.length()));
            if(isFound){
                return true;
            }
        }
        return false;
    }

    private static boolean isSubstringPresent(String str1, String str2) {
        for(int i = 0; i< str1.length() - str2.length() +1; i++){
            int count = 0;
            for(int j = i, k=0; j< i+ str2.length(); j++, k++){
                char ch1 = str1.charAt(j);
                char ch2 = str2.charAt(k);
                if(ch1 == ch2){
                    count++;
                }else{
                    break;
                }
            }
            if(count == str2.length()){
                return true;
            }
        }
        return false;
    }
}
