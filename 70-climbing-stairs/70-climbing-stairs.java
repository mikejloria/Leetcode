class Solution {
    public int climbStairs(int n) {
        // brute force top down
        // if (n <= 2) return n;
        // return climbStairs(n - 1) + climbStairs(n - 2);

        // bottom up
        if (n <= 1)return 1;
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;

        for (int i = 3; i < cache.length; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}
