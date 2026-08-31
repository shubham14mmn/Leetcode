class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Best profit from 0 -> i
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);

            left[i] = Math.max(
                left[i - 1],
                prices[i] - minPrice
            );
        }

        // Best profit from i -> n-1
        int maxPrice = prices[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);

            right[i] = Math.max(
                right[i + 1],
                maxPrice - prices[i]
            );
        }

        // Combine two transactions
        int profit = 0;

        for (int i = 0; i < n; i++) {
            profit = Math.max(
                profit,
                left[i] + right[i]
            );
        }

        return profit;
    }
}