package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = scn.nextLine();
        // taking string i/p and appending to SB class obj...
        sb.append(str);
        // a: 97, z: 122        A: 65, Z: 90
        // Pattern is diff b/w (a and A) is 32
        // so to convert just sub 32 => we get Uppercase
        //      sb.setCharAt(1, 'f');
        // updates charAt(index, character)
        for(int i = 0; i< sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 97 && ch <= 122){ // This means lower case
                sb.setCharAt(i,(char)(ch - 32));
            }
        }
        System.out.println(sb);


    }
}
