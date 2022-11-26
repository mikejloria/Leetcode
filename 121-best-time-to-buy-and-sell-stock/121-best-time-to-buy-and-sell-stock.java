class BestTimeToBuyAndSellStock {

    public int bestTimeToBuyAndSell (int[] prices) {
        // max difference
        // buy index and sell index
        // Math.min and Math.max
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;

    }
    public static void main (String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {1,4,8,6};
        System.out.println(solution.bestTimeToBuyAndSell(prices));

    }
}