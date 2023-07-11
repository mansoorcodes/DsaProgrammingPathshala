package M1BeginWithProgramming._1IntroToProg.Theory;

public class _1IntegerOverflow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //max = max+1;
        //System.out.println("the new int value is " + (max+max+2));
        System.out.println(min);
        int x = min -1;
        System.out.println("the new int value is " + (x));
        System.out.println(max+1);
        //System.out.println(2147483649+2);
        System.out.println((min +1 ) - min ); // wrote this imagining the circle of integers...
    }
}
