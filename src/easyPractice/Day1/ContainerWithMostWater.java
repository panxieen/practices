package easyPractice.Day1;

/**
 * 11
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        for (int i = 0,j=height.length-1; i < j; ) {
            int minHeight= height[i] < height [j] ? height[i++] : height[j--];
            int area=(j-i+1)*minHeight;
            max= Math.max(max,area);
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater water = new ContainerWithMostWater();
        System.out.println(water.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
