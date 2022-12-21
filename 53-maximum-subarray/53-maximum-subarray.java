class Solution {
	public int maxSubArray (int[] nums) {
		int n = nums.length;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++){
			sum += nums[i];
			max = Math.max(max, sum);
			sum = sum < 0 ? 0 : sum;
		}
		return max;
	}
}
