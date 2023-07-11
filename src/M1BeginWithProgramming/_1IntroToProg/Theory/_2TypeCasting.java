package M1BeginWithProgramming._1IntroToProg.Theory;

public class _2TypeCasting {
    public static void main(String[] args) {

        characterArithmetics(); // char internally has int value(ASCII).
        // operations on char returns an int value

//        intOperationOverflowHowToAvoid();
//        intOperationOverflow();
//        teluguPrinting();
//        convertIntToDoubleWhenOperations();


    }

    private static void characterArithmetics() {
        int i = (int)7.5;
        //System.out.println(i);
        double d = 67.5;
        //System.out.println(d);
        char cha = 'a';
        int ch = 'a';
        System.out.println(ch);
        System.out.println((char)(ch -'0'));

        System.out.println(/*(d * i) +" "+ (d+i) +" "+  (d-i) +" "+ (i/d) +" " + */(cha *d)+" " + (cha + i));
    }

    private static void intOperationOverflowHowToAvoid() {
        // before doing any operations type cast INT to LONG one variable
        // Then the whole expression is done as Long and result is stored temporarily in long...
        // you can assign that result in a Long variable as answer...
        int a = 1000000000, b = 1000000000;
        System.out.println(a * b);// int overflow happens you should type cast the result
        System.out.println((long)a * b);// explicit conversion
    }

    private static void intOperationOverflow() {
        int i1 = 1000000000, i2 = 1000000000;
        System.out.println(i1 * i2); //this gives int overflow b/c internally its doing operation
        //and its storing value in int type temporarily and printing the overflown value. So convert it to long and then print
        System.out.println((long) i1 * i2);
        // now long
        long l1 = 1000000000L;
        System.out.println(i1 * l1); //while doing operations of diff types it auto converts into larger type.
        System.out.println(Long.MAX_VALUE);// 9,223,372,036,854,775,807
    }

    private static void convertIntToDoubleWhenOperations() {
        double d = 5 / 10; // op: 0
        System.out.println("double value is: "+ d);// Doesn't work.
        double dd = (double) 5 / 10;// this works.
        System.out.println("double value is: "+ d);
        double ddd = 5 * 1.0 / 10; // also can be done.
        System.out.println("double value is: "+ dd);
    }

    private static void teluguPrinting() {
        int a1 = 'A';
        char ch1 = 10000;
        char ch2 = 'అ';
        int chi2 = ch2;
        System.out.println("a1: " + a1 +"\n"+ "ch1: "+ch1 +"\n"+ "ch2: "+ch2 +"\n"+ "chi2: "+chi2);
        for(int ii = 3077; ii< (3077+56); ii++){ // WOW Printing telugu characters. LOL/.
            // System.out.println((char)ii);
        }
        System.out.println('G' + 'n');
    }

}
