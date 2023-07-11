package M1BeginWithProgramming._2Arrays;

import java.util.Arrays;

public class ReverseAnArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0, j= 8; j>i; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
