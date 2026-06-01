class Minimum_Cost_Of_Buying_Candies_With_Discount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalCost = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            totalCost += cost[i];
            if (i - 1 >= 0) {
                totalCost += cost[i - 1];
            }
        }
        return totalCost;
        //TC:O(n log n) where n is the length of the cost array due to sorting.
        //SC:O(1) as we are using only constant space.
    }
}