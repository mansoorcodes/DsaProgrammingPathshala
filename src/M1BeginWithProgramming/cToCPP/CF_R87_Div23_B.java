package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class CF_R87_Div23_B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            int [] arr = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
                arr[i] = Math.abs(arr[i] - i+1);
                max = (Math.max(max, arr[i]));
            }
            // find gcd of all updated elements in array
            int len = arr.length;
            System.out.println(findGCD(arr, len));

        }

    }
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    public static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }
}
