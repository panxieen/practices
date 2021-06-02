package easyPractice.leetCode;

public class maxArray {
    public static int maxSubArray(int[] nums) {
        int j = nums[0];
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num > 0) {
                num = num + nums[i];
            } else {
                num = nums[i];
            }
            j = Math.max(j, num);
        }
        return j;
    }

    public static void main(String[] args) {
        int i = maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }
}

