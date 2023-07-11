package M1BeginWithProgramming.cToCPP;

//  https://codeforces.com/problemset/problem/4/A
import java.util.Scanner;

public class _1WaterMelon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int weight = scn.nextInt();
        if(weight >= 4 && weight %2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }

}
