package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoreIPAddresses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ip = scn.next();
        System.out.println(restoreIpAddresses(ip));
    }
    public static List<String> restoreIpAddresses(String ip) {
        List<String> ans = new ArrayList<String>();
        int[] digitSpotMap = new int[5];
        recursion(1, 0, digitSpotMap, ans, ip);

        // ans.add("");
        return ans;
    }

    private static void recursion(int currSpotNum, int digsUsedForCurrSpot, int[] digitSpotMap, List<String> ans, String ip) {
        // base case
        if(currSpotNum == 4){
            digitSpotMap[4] = digsUsedForCurrSpot;
            String res = giveMeIPAddress(digitSpotMap, ip);
            if(!res.equals("NO")) ans.add(res);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if(isPossible(digitSpotMap, currSpotNum, digsUsedForCurrSpot, ip.length())){
                digitSpotMap[currSpotNum] = i;
                recursion(currSpotNum+1, i, digitSpotMap, ans, ip);
            }
        }
    }

    private static boolean isPossible(int[] digitSpotMap, int currSpotNum, int digsUsedForCurrSpot, int len) {
        int digUsedSoFar = 0;
        for (int i = 1; i < currSpotNum; i++) {
            digUsedSoFar += digitSpotMap[i];
        }
        digUsedSoFar += currSpotNum;
        int remDigs = len - digUsedSoFar;
        int remSpots = 4- currSpotNum;
        if(remDigs/remSpots == 3 && remDigs%remSpots == 0) return true;
        else if (remDigs/remSpots == 3 && remDigs%remSpots != 0) return false;
        return remDigs / remSpots <= 3;
    }

    private static String giveMeIPAddress(int[] digitSpotMap, String ip) {
        StringBuilder res = new StringBuilder();
        int idx = 0;
        for (int i = 1; i <= 4; i++) {
            int digs = digitSpotMap[i];
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < digs; j++) {
                str.append(ip.charAt(idx));
                idx++;
            }
            int num = Integer.parseInt(str.toString());
            if(num > 255) return "NO";
            if(str.charAt(0) == '0') return "NO";
            res.append(str);
            if (i<4) res .append('.');
        }
        System.out.println(res);
        return res.toString();
    }
}
