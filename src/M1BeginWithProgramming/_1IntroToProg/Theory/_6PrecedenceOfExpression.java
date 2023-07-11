package M1BeginWithProgramming._1IntroToProg.Theory;

public class _6PrecedenceOfExpression {
    public static void main(String[] args) {
        System.out.println(3%4);
        int a = 10;
        int res = ++a * a++;
        System.out.println(res);

        a = 10;
        res = a++ * ++a;
        System.out.println(res);

        a = 10;
        res = (++a * (a++));
        System.out.println(res);

        System.out.println(a == res);
    }
}

