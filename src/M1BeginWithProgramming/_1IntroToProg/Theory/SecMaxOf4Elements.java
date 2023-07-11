package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class SecMaxOf4Elements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt(), q = scn.nextInt(), r = scn.nextInt(), s = scn.nextInt();
        if(isMax(p, q, r, s)){             // if p is max out of 4 elements
            if(isMax(q, r, s)){            // if q is max out of 3 elements (i.e., q is second MAX)
                System.out.println(q);
            }else if(isMax(r, q, s)){      // if r is max out of 3 elements (i.e., r is second MAX)
                System.out.println(r);
            }else{                         // if s is max out of 3 elements (i.e., s is second MAX)
                System.out.println(s);
            }
        }
        else if(isMax(q, r, s, p)){ // q
            if(isMax(r, s, p)){      //r
                System.out.println(r);
            }else if(isMax(s, r, p)){
                System.out.println(s);
            }else{
                System.out.println(p);
            }
        }
        else if(isMax(r, s, p, q)){ // r
            if(isMax(s, p, q)){      //s
                System.out.println(s);
            }else if(isMax(p, q, s)){
                System.out.println(p);
            }else{
                System.out.println(q);
            }
        }
        else { //s
            if(isMax(p, q, r)){      //s
                System.out.println(p);
            }else if(isMax(q, r, p)){
                System.out.println(q);
            }else{
                System.out.println(r);
            }
        }
    }

    private static boolean isMax(int p, int q, int r, int s) { // find max out of 4 elements
        return (p>=q && p>=r && p>=s);
    }
    private static boolean isMax(int p, int q, int r) { // find max out of 3 elements
        return (p>=q && p>=r);
    }
}
