package M1BeginWithProgramming._1IntroToProg.Theory;
import java.util.Scanner;

public class SpecialSeriesFractions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double a = 1, sum = 0;
        for(int i = 1; i<= n; i++){
            a = 1.0/i;
            sum += a;
        }
        System.out.println(sum);

    }
}
