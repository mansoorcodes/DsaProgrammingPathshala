package M2GearingUp.Math.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _HW_Colliders_CF_154_B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfColliders = scn.nextInt();
        int noOfRequests = scn.nextInt();
        int maxSize = noOfColliders;
        int [] primes = new int[maxSize + 5];
        sieve(primes);
        scn.nextLine();
        ArrayList<Integer> onList = new ArrayList<>();
        while (noOfRequests-- >0){
            String req = scn.nextLine();
            char toggle = req.charAt(0);
            int colliderNum = Integer.parseInt(req.substring(2));
            boolean isColliderOn = isColliderOn(colliderNum, onList);
            if(toggle == '+'){
                if(isColliderOn){
                    System.out.println("Already on");
                } else if (isSafeToOn(colliderNum, onList, primes) == 0) {
                    onList.add(colliderNum);
                    System.out.println("Success");
                }else {
                    int conflictingCollider = isSafeToOn(colliderNum, onList, primes);
                    System.out.println("Conflict with "+conflictingCollider);
                }
            }else {
                if(isColliderOn){
                    offCollider(colliderNum, onList);
                    System.out.println("Success");
                }else {
                    System.out.println("Already off");
                }
            }
        }
    }

    private static void offCollider(int colliderNum, ArrayList<Integer> onList) {
        int size = onList.size();
        for (int i = 0; i < size; i++) {
            if(colliderNum == onList.get(i)) {
                onList.remove(i);
                break;
            }
        }
    }

    private static int isSafeToOn(int colliderNum, ArrayList<Integer> onList, int [] primes) {
        int size = onList.size();
        int gcd;
        for (int i = 0; i < size; i++) {
            int conflictingNumber = onList.get(i);
            gcd = gcd(conflictingNumber, colliderNum, primes);
            if(gcd > 1) return conflictingNumber;
        }
        return 0;
    }

    private static int gcd(int conflictingNumber, int colliderNum, int[] primes) {
        int min = Math.min(conflictingNumber, colliderNum);
        int max = Math.max(conflictingNumber, colliderNum);
        int divisor = min;
        int dividend = max;
        if(min +1 == max ) return 1;
        if(primes[min] == 1 && primes[max] == 1) return 1;
        if(primes[min] == 1 && max % min != 0) return 1;
        if(primes[max] == 1) return 1; // this line is doubt...
        if(min == 0) return max;
        while (true){
            int rem = dividend % divisor;
            if(rem == 0) return divisor;
            dividend = divisor;
            divisor = rem;
        }
    }

    private static boolean isColliderOn(int colliderNum, ArrayList<Integer> onList) {
        int size = onList.size();
        for (int i = 0; i < size; i++) {
            if(colliderNum == onList.get(i)) return true;
        }
        return false;
    }
    private static void sieve(int [] primes){
        Arrays.fill(primes, 1);
        primes[1] = 0;
        for (int p = 2; p*p < primes.length; p++) {
            if(primes[p] == 1) {
                for (int m = p; p*m < primes.length; m++) {
                    primes[p*m] = 0;
                }
            }
        }
    }
}
