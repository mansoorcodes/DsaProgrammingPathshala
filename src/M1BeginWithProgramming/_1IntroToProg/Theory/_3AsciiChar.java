package M1BeginWithProgramming._1IntroToProg.Theory;

public class _3AsciiChar {
    public static void main(String[] args) {

        storeIntegerInChar();
        storeCharInInteger();
        convertCharDigitIntoIntDigit();

        arithmeticOperationsUsingChar();
        // characters are stored as numbers & we can do arith Operations as if they are integers...

        teluguChar();   // looping directly using ('అ') to ('అ'+55)
        teluguCharLoopingWithNumbers();      // traditional way of looping

        convertCharacterDigitsIntoActualIntegers();
    }

    private static void convertCharDigitIntoIntDigit() {
        char chDig = '3';
        int intDig = chDig - '0';
        System.out.println("converted char into int: "+ intDig);
    }

    private static void convertCharacterDigitsIntoActualIntegers() {
        char digInChar = '7';
        int digInInt;
        // to get value in int just subtract char value with '0'
        digInInt = digInChar - '0';
        System.out.println((int)digInChar +" --> "+ digInInt);
        for(char ch = '1'; ch <='9'; ch++){
            System.out.print(ch +" char to number is: "+ (ch-'0')+"\n");
        }
        System.out.println();
    }

    private static void arithmeticOperationsUsingChar() {
        int a1 = 'A';
        char ch1 = 10000;
        char ch2 = 'అ';
        int intValueOfChar = ch2;
        System.out.println("a1: " + a1 +"\n"+ "ch1: "+ch1 +"\n"+ "ch2: "+ch2 +"\n"+ "intValueOfChar: "+intValueOfChar);

        System.out.println( 'A' + 'B');
        char aPlusz = 'A'+'z';
        System.out.println("aPlusz: "+ aPlusz); // op: aPlusz: » || here char arith operations are done
        // and res INT value is stored in a char...
        System.out.println('a' + 0); // 0/p is 97 // here operation is taking place and
        // int is returning and printing as string
    }

    private static void teluguCharLoopingWithNumbers() {
        for(int i = 3077; i< (3077+56); i++){ // WOW, Printing telugu characters. LOL/.
            System.out.print((char)i);
        }
        System.out.println();
    }

    private static void storeCharInInteger() {
        int i = 'a';
        System.out.println(i);
    }

    private static void storeIntegerInChar() {
        char ch = 97; // this is valid wtf how?
        // b/c internally char has 2 byte(16 bits) in JAVA,
        // and it can store Many diff types of int for which
        //ASCII is associated to the character. You CAN store integer values in char from [0-65535]
        System.out.println(ch); // o/p : a
    }

    private static void teluguChar() {
        for (char i = 'అ'; i < ('అ' +55); i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
