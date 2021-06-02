package easyPractice.Day1;

/**
 * 283
 */
public class moveZero {
    public void moveZeroes(int[] nums) {
//        int j = 0;//慢指针
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=0){
//                int temp=nums[i];
//                nums[i]=nums[j];
//                nums[j]=temp;
//                j++;
//            }
//            System.out.println(Arrays.toString(nums));
//        }
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
           // System.out.println(Arrays.toString(nums));
        }
    }
    public static void main(String[] args) {
        moveZero moveZero = new moveZero();
        moveZero.moveZeroes(new int[]{0,1,0,3,12});
    }
}


