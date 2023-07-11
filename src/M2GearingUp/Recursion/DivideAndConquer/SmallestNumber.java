package M2GearingUp.Recursion.DivideAndConquer;

import java.util.Scanner;

public class SmallestNumber {
    static long ans;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long [] nums = new long[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scn.nextLong();
        }
        scn.nextLine();
        String operators = scn.nextLine();
        String str = new String();
        for (int i = 0; i < operators.length(); i++) {
            if(operators.charAt(i) != ' ') str = str + operators.charAt(i);
        }
        operators = str;
        ans = Long.MAX_VALUE;
        recursion(nums, operators, 0);
        System.out.println(ans);
    }

    private static void recursion(long[] nums, String operators, int idx) {

        // System.out.println(Arrays.toString(nums));

        if(idx == 3){
            ans = Math.min(ans, nums[0]);
            // System.out.println(nums[0] + " ");
            return;
        }
        long [][] allCombos = getAllCombos(nums);
        for (int i = 0; i < allCombos.length; i++) {

            // System.out.println("-->"+allCombos[i][0] +" "+allCombos[i][1]);

            long [] copy = new long[nums.length];
            for (int j = 0; j < copy.length; j++) {
                copy[j] = nums[j];
            }
            long idx1 = allCombos[i][2];
            long idx2 = allCombos[i][3];
            long [] newNums = new long[copy.length-1];
            char operator = operators.charAt(idx);
            if(operator == '+'){
                // System.out.println("hey +");
                newNums[0] = allCombos[i][0] + allCombos[i][1];
            }else if(operator == '*'){
                // System.out.println("hey *");
                newNums[0] = allCombos[i][0] * allCombos[i][1];
            }
            int cpyIdx = 0;
            for (int j = 1; j < newNums.length; j++) {

                // System.out.println("cpyIdx: "+cpyIdx+" idx1: "+idx1+" idx2: "+idx2);

                while (true){ // wammo yenta sepu debugging taruvata loloooooo  loolu...
                    if(cpyIdx == idx1 || cpyIdx == idx2){
                        cpyIdx++;
                    }else {
                        newNums[j] = copy[cpyIdx];
                        cpyIdx++;
                        break;
                    }
                }

//                if(cpyIdx == idx1) {
//                    cpyIdx++;
//
//                    continue;
//                }
//                if (cpyIdx == idx2){
//                    continue;
//                }
//                newNums[j] = copy[cpyIdx];
//                cpyIdx++;
            }
            recursion(newNums, operators, idx+1);
        }
    }

    private static long[][] getAllCombos(long[] nums) {
        long nfact = 1;
        for (int i = 1; i <= nums.length; i++) {
            nfact *= i;
        }
        long nm2fact = 1;
        for (int i = 1; i <= nums.length-2; i++) {
            nm2fact *= i;
        }
        long ncr = nfact/(nm2fact*2);
        long[][] allCombos = new long[(int)ncr][4];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                allCombos[idx][0] = nums[i];
                allCombos[idx][1] = nums[j];
                allCombos[idx][2] = i; // indices tracking...
                allCombos[idx][3] = j; // these are for indices tracking...
                idx++;
            }
        }
        return allCombos;
    }
}
