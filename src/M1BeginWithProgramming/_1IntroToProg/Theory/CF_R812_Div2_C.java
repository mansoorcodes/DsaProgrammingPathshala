package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class CF_R812_Div2_C {
    /*
    Hi manic,
    Tonight I solved this q from CF C problem (5/16/2023)
    I was successful in my attempt my pattern
    But it took me to modify many things inside loops and I finally did it LOL
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            int maxPerfSqCount = (int) Math.sqrt(n-1+ n-1);
            int [] perfSqArr = new int[maxPerfSqCount+1];
            int psidx = 0;
            for (; psidx <= maxPerfSqCount; psidx++) {
                perfSqArr[psidx] = psidx*psidx;
            }
            boolean flag = true;
            int currPerfSq = perfSqArr[--psidx];
            int [] ans = new int[n];
            for (int i = ans.length - 1; i >= 0; i--) {
                if(ans[i] != 0) continue;
                int x = currPerfSq - i;
//                if(x> i ){
////                    if (psidx == 0) {
////                        flag = false;
////                        break;
////                    }
//                    currPerfSq = perfSqArr[--psidx];
//                    x = currPerfSq - i;
////                    i++;
////                    continue; instead of doing this I can use loops like until we get (x<i)
//                }
                while (x > i){
                    currPerfSq = perfSqArr[--psidx];
                    x = currPerfSq - i;
                }
                ans[i] = x;
                if(i>x) ans[x] = i;
//                System.out.println("currPerfSq is: " +currPerfSq);
//                System.out.println("x: "+x+" i: "+i);
//                System.out.println(Arrays.toString(ans));
            }
            for (int i = 0; i < ans.length && flag; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
