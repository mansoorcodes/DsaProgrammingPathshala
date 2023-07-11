package M1BeginWithProgramming._1IntroToProg.Theory;

public class Loops {
    public static void main(String[] args) {
        int i = 1, n = 9;
        while(i <= n){ // 1st while loop
            System.out.print(i + ((i==n)?"" :"->")); // Shorthand if else
            i++;
        }
        System.out.println();

        i = 1;
        while(i <= n){// 2nd while loop
            System.out.print(i++ + ((i==n+1)?"" :"->")); // Shorthand if else
            // here we are comparing after changing value so it's misbehaving so (i == n+1)
        }
        System.out.println();

        i = 1;
        while (i<= n){
            System.out.print(i + ((i++ == n)?"":"->")); // chatgpt solution. COOL
        }
        System.out.println();

        i = 1;
        while(i <= n){
            if(i ==n){
                System.out.print(i++ ); // Shorthand if else
            }else{
                System.out.print(i++ + "->"); // Shorthand if else
            }

        }
    }
}
