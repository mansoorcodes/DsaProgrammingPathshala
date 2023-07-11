package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class SortAString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = scn.nextLine();
        sb.append(str);
        // insertion sort
        for(int sortStrLen = 1; sortStrLen < sb.length(); sortStrLen++){
            for(int i = sortStrLen; i >0; i--){
                char ch = sb.charAt(i);
                if(ch < sb.charAt(i-1)){
                    // swap
                    char temp = sb.charAt(i-1);
                    sb.setCharAt(i-1, ch);
                    sb.setCharAt(i, temp);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
