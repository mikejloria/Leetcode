class FindPivotIndex {
    public int findPivot(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for(int x : nums) {
            totalSum += x;
        }

        for(int i = 0; i < nums.length; i++) {
            if(leftSum == totalSum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        FindPivotIndex solution = new FindPivotIndex();
        int[] nums = {1,2,3,4,6};
        System.out.println(solution.findPivot(nums));
    }
}