package M2GearingUp.Recursion.Theory;

import java.util.Scanner;

public class IntroToRecursionSomeKnowledge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if(n == 0) return 1;
        return n * fact(n-1);
    }
}

/**
 * I'm not able to visualize how the height of stack is giving the space complexity.
 * Is it because there are N function calls stored in the call stack
 * and each function call takes O(1) space so N functions take O(N) space?
 * (Just like an array of N elements takes O(N) space so a stack of N function calls takes O(N) space? )
 *
 * Also suppose I declare N variables in each stack and pass it by value,
 * so for each of the function calls, again a set of N new variables would be
 * created for that function call, so would the space complexity become N^N ?
 *
 * ********* REPLY *************
 *
 * Yes, your understanding is correct; the space complexity would become N^2.
 * For your first question, let's take the following example:
 *
 * int f(int a, int b)
 * {
 *       int t = 7;
 *       return a*b*t;
 * }
 * int main(){
 * int x=4,y=7;
 * x= x+f(2,3)+y;
 * }
 *
 * When the main function calls f,
 *
 * 1) We are assigning a=2, b = 3.
 *
 * 2) within f, we are creating t.
 *
 * 3) after f returns, we must know where to resume the execution of main -
 *    storing this information will take a constant space - 4 bytes in a 64-bit computer.
 *
 * 4) For doing x = x+f(2,3) +y, we must have saved the values of x and y
 *    of the main function somewhere, while f's lines of code were getting executed.
 *
 * So, any variables declared before a function calls another function, or itself,
 * must be stored in the memory, so that we can resume from the same point.
 * Hence, the space requirement associated with function call.
 *
 * If we keep on nesting function calls, i.e., one function calls another,
 * and that function calls another and so on, for correct resumptions of all these functions,
 * we need to store the resumption points and the values of the variables within each function.
 * NOTE: After f terminates, the variables a, b and t are destroyed and
 * they no longer need space. That's why the maximum space that we are utilizing
 * at a point of time depends on the current depth of the recursion/function call,
 * rather than the total number of function calls
 * during the whole history of execution of the program.
 */