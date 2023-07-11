package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class ArraysDuplicateRemoval {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scn.nextInt());
        }
        sortAndRemoveDuplicates(arr);
        System.out.println(arr);
    }

    private static void sortAndRemoveDuplicates(ArrayList<Integer> arr) {
        Collections.sort(arr);
        // we have to remove duplicate elements from ArryList A
        // so that we can get all unique combinations if not we will get repetitions...
        int size = arr.size();
        for(int k = 1; k< size; k++){
            if(Objects.equals(arr.get(k), arr.get(k - 1))){
                // if(arr.get(k) == arr.get(k-1))
                // while comparing objects use the above Standard methods
                // Don't use ==
                arr.remove(k);
                size--;
                k--;
            }
        }
    }

}