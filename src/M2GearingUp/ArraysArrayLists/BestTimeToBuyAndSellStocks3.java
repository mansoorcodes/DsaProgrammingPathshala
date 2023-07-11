package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocks3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }

        // find 1st transaction maximum profit array from starting traversal
        // find 2nd transaction maximum profit array from end traversal
        // the idea is to divide array into two parts where 1 part denotes 1st transaction
        // and 2nd part is for 2nd transaction

        int [] prefixFirstMaxPrefix = new int[n];
        // this stores what is the maximum profit until now if I Sell the first stock (i+1)st day
        prefixFirstMaxPrefix[0] = 0;
        int currMinCost = prices[0];
        int maxProfit = 0;
        int currProfit = 0;
        for (int i = 1; i < n; i++) {
            currMinCost = Math.min(currMinCost, prices[i]);
            currProfit = prices[i] - currMinCost;
            maxProfit = Math.max(maxProfit, currProfit);
            prefixFirstMaxPrefix[i] = Math.max(maxProfit, prefixFirstMaxPrefix[i-1]);
        }

        int [] suffixSecondMaxProfit = new int[n];
        // this stores what is the maximum profit until now if I buy the second stock at (i+1)st day
        suffixSecondMaxProfit[n-1] = 0;
        int currMaxSell = prices[n-1];
        maxProfit = 0;
        currProfit = 0;
        for (int i = n-2; i >= 0 ; i--) {
            currMaxSell = Math.max(currMaxSell, prices[i]);
            currProfit = currMaxSell - prices[i];
            maxProfit = Math.max(maxProfit, currProfit);
            suffixSecondMaxProfit[i] = Math.max(suffixSecondMaxProfit[i+1], maxProfit);
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= n-1; i++) {
            // we can buy 2nd stock on the same day after selling 1st...
            // I missed this little detail. I think It will work now...
            ans = Math.max(prefixFirstMaxPrefix[i] + suffixSecondMaxProfit[i], ans);
        }
        System.out.println(ans);
    }
}
