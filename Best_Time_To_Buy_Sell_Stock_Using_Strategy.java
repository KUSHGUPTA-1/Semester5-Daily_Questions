public class Best_Time_To_Buy_Sell_Stock_Using_Strategy {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long bp = 0;
        for (int i = 0; i < n; i++) {
            bp += (long) strategy[i] * prices[i];
        }
        long[] prefOld = new long[n + 1];
        long[] prefPrice = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefOld[i + 1] = prefOld[i] + (long) strategy[i] * prices[i];
            prefPrice[i + 1] = prefPrice[i] + prices[i];
        }
        long bd= 0;
        int half = k / 2;
        for (int l = 0; l + k <= n; l++) {
            int r = l + k - 1;
            long oldContribution = prefOld[r + 1] - prefOld[l];
            long newContribution = prefPrice[r + 1] - prefPrice[l + half];
            long delta = newContribution - oldContribution;
            if (delta > bd) bd = delta;
        }
        return bp + bd;
        // Time Complexity: O(n)
        // Space Complexity: O(n)
    }
}
