package easyPractice.Day1;

/**
 * 70
 */

public class ClimbingStairs {
    public int climbStairs(int n) {
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//        return climbStairs(n-1)+climbStairs(n-2);
//        }
        if(n<2){
            return n;
        }

        int i=1;
        int j=2;
        for (int k=3;k<=n;k++){
            int temp=i+j;
            i=j;
            j=temp;
        }
        return j;
    }

    public static void main(String[] args) {
        ClimbingStairs stairs = new ClimbingStairs();
        int i = stairs.climbStairs(5);
        System.out.println(i);
    }

}
