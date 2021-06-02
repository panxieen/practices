package easyPractice.leetCode;

public class remove {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=nums[i]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
     int[] ints=  new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(ints));

    }
}
