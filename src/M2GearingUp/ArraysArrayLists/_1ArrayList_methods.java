package M2GearingUp.ArraysArrayLists;

import java.util.ArrayList;

public class _1ArrayList_methods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        System.out.println(al);
        al.add(0,100);
        al.add(2,200);
        al.add(0,999);
        // al.add(9, 9000); idx out pof bound Exception...
        al.add(5,500); // we can add elem at the last also where (idx == size)
        System.out.println(al);


    }
}
