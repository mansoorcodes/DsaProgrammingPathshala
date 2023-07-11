package M1BeginWithProgramming._1IntroToProg.Theory;

public class Facto {
    public static void main(String[] args) {
        int n = 5, i = 1, fact = 1;
        while(i<= n){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
