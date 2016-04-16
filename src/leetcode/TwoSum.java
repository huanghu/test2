package leetcode;

/**
 * 第一题
 * @author huanghu
 *
 */
public class TwoSum {
	public static void main(String[] args){
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 13;
		int[] result = twoSum(nums, target);
		System.out.println("result "  + result[0] + " " + result[1]);
	}
    public static int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = nums[i];
					result[1] = nums[j];
					return result;
				}
			}
		}
        return result;
    }
}
