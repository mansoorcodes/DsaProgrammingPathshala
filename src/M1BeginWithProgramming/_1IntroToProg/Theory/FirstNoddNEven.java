package M1BeginWithProgramming._1IntroToProg.Theory;

public class FirstNoddNEven {
    public static void main(String[] args) {
        int i = 0, n = 12, count = 0;
        while(count <n){
            System.out.print(i +" ");
            i+= 2;
            count++;
        }
        System.out.println("count of even is: "+count);

        i = 1; count = 0;
        while (count < n){
            System.out.print(i+" ");
            i+= 2;
            count++;
        }
        System.out.println("count of odd is: "+count);
        i = 1;
        while(i<= 10){ //multiple table
            System.out.println(n +"*" +i+"="+ n*i);
            i++;
        }

    }
}
