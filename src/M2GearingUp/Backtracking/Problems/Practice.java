package M2GearingUp.Backtracking.Problems;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // LOOPS
//        for(int i = 0; i< 1000; i++){
//            System.out.println(i+" My name is Thahura");
//        }


        // if else
        // rules 35 pass below 35 fail...
        // Thabiya marks
        System.out.println("Please enter thabiya marks: ");
        int marks = scn.nextInt();
        if(marks >= 35){
            System.out.println("Thabiya is passed");
        }
        else {
            System.out.println("Thabiya Failed");
        }


        // Thahura Marks
        System.out.println("Please enter Thahura marks: ");
        marks = scn.nextInt();
        if(marks >= 35){
            System.out.println("Thahura is passed");
        }
        else {
            System.out.println("Thahura Failed");
        }

        // Mansoor marks
        System.out.println("Please enter Mansoor marks: ");
        marks = scn.nextInt();
        if(marks >= 35){
            System.out.println("Mansoor is passed");
        }
        else {
            System.out.println("Mansoor Failed");
        }

    }
}
