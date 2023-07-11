package M2GearingUp.Recursion.Problems;

import java.util.Scanner;
// This code is so elegant and So high level easy stuff I need to MASTER this kind of coding...
// Yet this takes more memory compared to mine but still it's just beautiful looking...
public class _1_HW_TransformAtoB_OthersSoln_in_CF {

    static long b;
    static String ans;
    public static boolean can(long k, String route) {
        if (k == b) {
            ans = route;
            return true;
        }
        if (k > b)
            return false;
        return can(2 * k, route + (2 * k) + " ") || can(10 * k + 1, route + (10 * k + 1) + " ");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        b = s.nextInt();
        System.out.println(can(a, a + " ") ? "YES\n" + ans.trim().split(" ").length + "\n" + ans : "NO");
        s.close();
    }
}