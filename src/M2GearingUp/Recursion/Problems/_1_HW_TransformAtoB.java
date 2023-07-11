package M2GearingUp.Recursion.Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class _1_HW_TransformAtoB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextInt();
        long b = scn.nextInt();
        // transform a --> b
        // constraint is atleast you have to do operation 1 time
        // So if b == a then you cant do operation
        if(b <= a) {
            System.out.println("NO");
            return;
        }
        // o/p is "YES" -> print(no of recursion level) ->
        // if i find ans in any level i return completely.I do this with (boolean[] isPossible)
        // if (isPossible [0] == true) then return back completely.
        // I use ArrayList<Integer>() to update my transformation.
        boolean[] isPossible = {false};
        ArrayList<Long> transformation = new ArrayList<>();
        transformation.add(a);
        recursion(a, b, isPossible, transformation, 1);
        if(!isPossible[0]) System.out.println("NO");
    }

    private static void recursion(long a, long b, boolean[] isPossible, ArrayList<Long> transformation, int level) {
        if(a == b){
            isPossible[0] = true;
            System.out.println("YES");
            System.out.println(level);
            for (long elem:transformation) {
                System.out.print(elem+" ");
            }
            return;
        }
        if(a > b) return;
        transformation.add(2*a);
        recursion(2*a, b, isPossible, transformation, level+1);
        transformation.remove(transformation.size()-1);
        if(isPossible[0]) return;

        transformation.add((10*a)+1);
        recursion((10*a)+1, b, isPossible, transformation, level+1);
        transformation.remove(transformation.size()-1);
        // if(isPossible[0]) return;
        // I want to know why this line is redundant...
    }
}
