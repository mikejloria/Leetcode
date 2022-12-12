class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // for (int i = 2; i < cost.length; i++) {
        //     cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        // }
        // System.out.println(Arrays.toString(cost));
        // return Math.min(cost[cost.length - 1], cost[cost.length - 2]);

        int cache[] = new int[cost.length + 1];
        for (int i = 2; i <= cost.length; i++) {
            cache[i] = Math.min(cache[i - 1] + cost[i - 1], cache[i - 2] + cost[i - 2]);
        }
        System.out.println(Arrays.toString(cache));
        System.out.println(cache.length);
        return cache[cost.length];
    }
}
