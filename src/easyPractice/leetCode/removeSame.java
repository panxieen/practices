package easyPractice.leetCode;

public class removeSame {
    public static int removeElement(int[] nums, int val) {
        if(nums.length<=1){
            return nums.length;
        }
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int i = removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(i);
    }
}
