package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class _2YoungPhysicist {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //int sum = 0;
        int x = 0, y = 0, z = 0;
        while(n-- >0){
            x += scn.nextInt();
            y += scn.nextInt();
            z += scn.nextInt();
        }
        //System.out.println(sum == 0? "YES": "NO");
        System.out.println((x==0 && y==0 && z==0)? "YES": "NO");
    }
}
