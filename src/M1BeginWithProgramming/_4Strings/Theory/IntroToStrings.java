package M1BeginWithProgramming._4Strings.Theory;

import java.util.Arrays;

public class IntroToStrings {
    public static void main(String[] args) {
        //stringClassDemo0(); // this has Bug! may be check out
        //arrayClassDemo1();
        //wrapperClassDemo2();
        prettyPrinting();

    }

    private static void prettyPrinting() {
        float num = 23.3278f;
        System.out.printf("Formatted number is: %.2f\n", num);
        System.out.printf("pi value: %.3f\n",Math.PI);
        System.out.printf("Hi I'm %s I have %s\n", "Mansoor", "Ipad" );
        // many placeholders are there works same as c language...
    }

    private static void stringClassDemo0() {
        String a = "Mansoor";
        String b = "Mansoor";
        System.out.println(a == b); //1

        String aa = "Syed";
        String bb = new String("Syed");
        //System.out.println("Here bb is created new String\naa == bb: " + "\nMaybe Java BUG!\nJava BUG!\nJava BUG!\nThe above line is not running in below print statement\n but (strin(aa == bb)strin) works");
        System.out.println("Here bb is created new String\naa == bb: " +aa == bb); //2

        String x = new String("Mansoor Bhai");
        String y = new String("Mansoor Bhai");
        System.out.println(x == y); //3
        System.out.println(x.equals(y)); //4
    }
    private static void arrayClassDemo1() {
        System.out.println(15);
        System.out.println("Manic");
        System.out.println(new int[] {3,5, 1,2,6});// this only prints address
        System.out.println(Arrays.toString(new int[] {55,44,33,22,11}));// wrap inside Arrays.toString()
    }
    private static void wrapperClassDemo2() {
        System.out.println(33);
        Integer num = new Integer(55);
        System.out.println(num);
        System.out.println(num.toString()); // actually this does the same thing as above so toString here is not necessary
    }
}
