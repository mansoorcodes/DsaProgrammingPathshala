package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        // NOW working for negative numbers Also PROUD OF MYSELF MASHAALLAH...
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        long pow = 1; // should be  long only not int b/c it will overflow for large numbers...
        long ans = 0;
        for (int i = str.length()-1; i >= 0 ; i--) {
            //int digit = (int) (str.charAt(i));
            // this won't work b/c this is getting ASCII value of it.
            // simple technique is to subtract the '0'
            int digit = str.charAt(i) - '0';
            ans += digit * pow;
            pow *= 10;
        }
        System.out.println("String is: "+ str+"\nInteger is: "+ans);

        convertNegativeAlso(str);
    }

    private static void convertNegativeAlso(String str) {
        long pow = 1;
        long ans = 0;
        for (int i = str.length()-1; i >= 1 ; i--) {
            int digit = str.charAt(i) - '0';
            ans += digit * pow;
            pow *= 10;
        }
        if(str.charAt(0) == '-'){
            ans = -ans;
        }else{
            int digit = str.charAt(0) - '0';
            ans += digit * pow;
        }
        System.out.println("String is: "+ str+"\nInteger is: "+ans);
    }
}
