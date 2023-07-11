package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class CompareSBobjects {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(scn.nextLine());
        StringBuilder sb2 = new StringBuilder(scn.nextLine());
        // we can't use .equals() in SB bc it doesn't have overriden method of .equals()
        // .equals() in Object class compares if ref of both obj are same not the content.

        // 1) convert sb into str and use .equals() in str => inefficient
        // 2) traverse every char and check

        boolean isSame = true;
        // here it is easy to initialize flag TRUE.....
        // b/c in loop we want to change it to false once and break;
        // and its intuitive as well
        if(sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++){
                if(sb1.charAt(i) != sb2.charAt(i)){
                    isSame = false;
                    break;
                }
            }
        }else{
            isSame = false;
        }
        System.out.println("Both SB are same: "+isSame);
    }


}
