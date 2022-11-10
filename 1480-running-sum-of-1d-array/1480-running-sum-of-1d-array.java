import java.util.*;

class RunningSumOfOneDimensionalArray {
/*
 * Given an array nums. We define a running sum of an array as
 * runningSum[i] = sum(nums[0]...nums[i]).
 * Return the running sum of nums.
 * 
 * Examples
 * -------
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
 * -------
 */
    public int[] runningSum (int[] nums) {
        int[] results = new int[nums.length]; 
        results[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i - 1];
        }
        return results;
    }
    public static void main (String[] args) {
        RunningSumOfOneDimensionalArray solution = new RunningSumOfOneDimensionalArray();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
}
