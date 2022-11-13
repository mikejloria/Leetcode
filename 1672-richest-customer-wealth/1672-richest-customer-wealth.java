class RichestCustomerWealth {
/* 
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of
 * money the ith customer has in the jth bank. Return the wealth that the richest customer has.
 * 
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest
 * customer is the customer that has the maximum wealth. 
 * 
 * Example 1
 * -------
 * Input: accounts = [[1,2,3], [3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the riches with a wealth of 6 each, so return 6.
 * 
 * Example 2
 * -------
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation: 
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10 
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 */
    public int maximumWealth(int[][] accounts) {
        int biggestBankValue = 0;
        for(int[] customer : accounts) {
            int wealthSoFar = 0;
            for(int bank : customer) {
                wealthSoFar += bank;
            }
            biggestBankValue = Math.max(biggestBankValue, wealthSoFar);
        }
        return biggestBankValue;
    }
    public static void main(String[] args) {
        RichestCustomerWealth solution = new RichestCustomerWealth();
        int[][] accounts = {{4,7,3},{1,8,2},{0,3,6}};
        System.out.println(solution.maximumWealth(accounts));

    }
}