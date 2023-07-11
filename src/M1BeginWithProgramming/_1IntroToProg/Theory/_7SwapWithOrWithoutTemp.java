package M1BeginWithProgramming._1IntroToProg.Theory;

public class _7SwapWithOrWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swapping intelligently
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a +" "+b);

        a = 10;
        b = 20;
        // swapping with *and/
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a +" " +b);
    }
}
