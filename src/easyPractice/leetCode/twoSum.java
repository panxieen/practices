package easyPractice.leetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 题目：给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 * 解题思路1：使用嵌套循环遍历数组，如果数组内的某两个值相加等于target ，返回这两个数组对应序号。
 * 解题思路2；使用循环将数组的KV存入HashMap ，遍历循环数组，使用一个值来接受target-num[j]的值
 * 在从HashMap中取出这个值，并得到所在位置，如果不存在或数组内的值使用重复则继续，最后返回对应序号。
 */
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++) {
            int a = target - nums[j];
            Integer b = map.get(a);
            if(b==null || b==j) {
                continue;
            }
            return new int[]{j,b};
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,5,5,11}, 10)));
        System.out.println(Arrays.toString(twoSum1(new int[]{2,5,6,8,11}, 10)));
    }
}
