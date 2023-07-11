package M1BeginWithProgramming._4Strings.Theory;

import java.util.ArrayList;
import java.util.LinkedList;

public class OperatorsInString_Plus {
    public static void main(String[] args) { // check out in future play with different data types
        // like arrays, lists, hash map, linked list, stacks etc....
        System.out.println("a" + "b"); // str + str
        System.out.println('a' + 'b'); // char is conv into its ascii int value and those are added
        System.out.println((char)('a' + 5)); // prim + obj
        System.out.println(new Integer(55) + 5); // Wrapper Obj + primitive
        //System.out.println(new ArrayList<>() + 6); // obj + prim -> this is not working
        System.out.println(""+ new ArrayList<>() + 6); // ""+ obj + prim
        System.out.println(new ArrayList<>() + "" +new Integer(58)); // obj +""+ Wrapper
        //System.out.println(true + false); // bool + bool NO
        System.out.println(new LinkedList<>()); // whatever complex data type is there -> convert into String...
        teluguChar();
    }

    private static void teluguChar() {
        for (char i = 'అ'; i < ('అ' +55); i++) {
            System.out.print(i+" ");
        }
    }
}
