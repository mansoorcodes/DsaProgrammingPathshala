package M1BeginWithProgramming._1IntroToProg.Theory;

public class CeilFloor {
    public static void main(String[] args) {
        double a = 7.6;
        int floor = (int) Math.floor(a);
        int ceil = (int) Math.ceil(a);
        System.out.println("floor: "+ floor +" ceil: "+ ceil);

        int x = 45;
        System.out.println(Math.sqrt(x));
        System.out.println((long) Math.pow(x,10));
        System.out.println(Math.pow(x,10));
        int y = 345627890;
        System.out.println((double)y);
        System.out.println((double) 123456789876543223L);
        long big = 1234567898765432L;
        float deci = 237.8754f;
        double bigdesi = 4752947478342876854286465.2548047825392612618540186;
        System.out.println("long: "+big + "\nfloat: "+deci+"\ndouble: "+bigdesi);

        System.out.println("Absolute value is: " +Math.abs(-9.75));


    }
}
