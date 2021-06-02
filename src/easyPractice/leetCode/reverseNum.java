package easyPractice.leetCode;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围[−2的31次方, 2的31次方− 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 *
 *
 */

public class reverseNum {
    public static int reverse(int x) {
        int num=0;
        while (x!=0){
            if(num> Integer.MAX_VALUE/10||num<Integer.MIN_VALUE/10){
                num=0;
                break;
            }
            num=num*10+x%10;
            x/=10;
        }
        return num;
    }

    public static void main(String[] args) {
        int reverse = reverseNum.reverse(-2147483412);
        System.out.println(reverse);
    }
}
