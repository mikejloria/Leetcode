class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] dp = new int[r][c];
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < c; j++) dp[0][j] = matrix[0][j];
        for (int i = 1; i < r; i++)
            for (int j = 0; j < c; j++) {
                if (j == 0) dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j+1]);
                else if (j == r - 1) dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j-1], dp[i-1][j]);
                else dp[i][j] = matrix[i][j] + Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i-1][j+1]);
            }
        for (int i = 0; i < r; i++) 
            if (dp[r - 1][i] < min) min = dp[r-1][i];
            
        return min;
    }
}
