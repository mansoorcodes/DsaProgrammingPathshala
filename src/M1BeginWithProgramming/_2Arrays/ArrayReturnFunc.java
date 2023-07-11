package M1BeginWithProgramming._2Arrays;

import java.util.Arrays;

public class ArrayReturnFunc {
    public static void main(String[] args) {
        int [] prr = giveMeAnArray();
        System.out.println(Arrays.toString(prr));
    }

    public static int[] giveMeAnArray() {
        int[] arr = {4,5,3,7,1,9};
        return arr;
    }
}
