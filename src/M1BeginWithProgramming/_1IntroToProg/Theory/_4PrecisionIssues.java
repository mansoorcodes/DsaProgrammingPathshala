package M1BeginWithProgramming._1IntroToProg.Theory;

public class _4PrecisionIssues {
    public static void main(String[] args) {
        double d = 3.785649976334678d;
        System.out.println(3f + " " + 5d + " " + 0.003d);
        System.out.println(d);
        System.out.println("%.5d "+ d);// this won't work,
        // learn how it works in JAVA. some methods are used. fucl
        System.out.printf("number upto two digits with round of is: %.2f ", d);
    }
}
