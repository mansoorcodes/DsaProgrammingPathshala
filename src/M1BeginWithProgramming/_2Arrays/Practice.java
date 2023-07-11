package M1BeginWithProgramming._2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int n = 5;
        Scanner scn = new Scanner(System.in);
        String [] arr = new String[n]; //we can create a String array also
        for(int i =0; i<n; i++){
            arr[i] = scn.next();
        }
        System.out.println("Contents of string array are: "+Arrays.toString(arr));
    }
}
