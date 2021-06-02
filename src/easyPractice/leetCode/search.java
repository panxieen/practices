package easyPractice.leetCode;

public class search {
    public static int searchInsert(int[] nums, int target) {
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                return temp=i;
            }else if(nums[nums.length-1]<target){
                return temp=nums.length;
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 5, 6}, 0);
        System.out.println(i);
    }
}
