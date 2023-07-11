package M2GearingUp.Recursion.DivideAndConquer;

import java.util.Scanner;

public class KthLexicographicalHappyString {
    public static StringBuilder finalBoss = new StringBuilder();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println("Bro My final anwer is: "+getHappyString(n, k));
    }
    public static String getHappyString(int n, int k) {
        StringBuilder res = new StringBuilder();
        int [] Kth = {k};
        helper('a', n-1, Kth, new StringBuilder("a"), res);
        helper('b', n-1, Kth, new StringBuilder("b"), res);
        helper('c', n-1, Kth, new StringBuilder("c"), res);

        System.out.println("Inka ide last: "+res);
        return finalBoss.toString();
    }

    private static void helper(char ch, int n, int[] Kth, StringBuilder ans, StringBuilder res) {
        if(Kth[0] == 0) {
//            res = ans;
//            System.out.println("Ultimate: "+res);
            return;
        }
        if(n == 0 && Kth[0] != 0){
            Kth[0]--;
            if(Kth[0] == 0) {
                finalBoss = new StringBuilder(ans);
//                System.out.println("FinalBoss: "+res);
            }
            System.out.println("Kth :"+Kth[0]);
            return;
        }
        if(ch == 'a'){
            ans.append('b');
            System.out.println(ans);
            helper('b', n-1, Kth, ans, res);
            ans.deleteCharAt(ans.length()-1);
            ans.append('c');
            System.out.println(ans);
            helper('c', n-1, Kth, ans, res);
            ans.deleteCharAt(ans.length()-1);
        }else if(ch == 'b'){
            ans.append('a');
            System.out.println(ans);
            helper('a', n-1, Kth, ans, res);
            ans.deleteCharAt(ans.length()-1);
            ans.append('c');
            System.out.println(ans);
            helper('c', n-1, Kth, ans, res);
            ans.deleteCharAt(ans.length()-1);
        }else {
            ans.append('a');
            System.out.println(ans);
            helper('a', n-1, Kth, ans, res);
            ans.deleteCharAt(ans.length()-1);
            ans.append('b');
            System.out.println(ans);
            helper('b', n-1, Kth, ans, res);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}
