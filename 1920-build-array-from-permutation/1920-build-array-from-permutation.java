import java.util.*;
class BuildArrayFromPermutation {
    public int[] buildArray (int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;

    }
    public static void main(String[] args) {
        BuildArrayFromPermutation solution = new BuildArrayFromPermutation();
        int[] nums = {3,4,5,1,2,0};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(solution.buildArray(nums)));
    }
}
