package M1BeginWithProgramming._4Strings.Theory;

import java.util.Scanner;

public class WeirdNextLineInputInScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the string array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        // Consume the newline character left by nextInt()
        String[] stringArray = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for element " + (i+1) + ": ");
            stringArray[i] = scanner.nextLine();
        }
        System.out.println("The contents of the string array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(stringArray[i]);
        }


//        String [] str = new String[4];
//        for (int i = 0; i < 4; i++) {
//         str[i] = scn.next();
//        }
////        scn.close();
//        for (int i = 0; i < 4; i++) {
//            System.out.print(str[i]);
//        }
//        System.out.println();
//        scn.reset();
//
//
//        String str1 = scn.nextLine();
//        System.out.println("str1 is:"+str1);
//
//        String str2 = scn.next();
//        System.out.println("str2 is: "+str2);
    }
}
