package easyPractice.leetCode;


public class romToSum {
    //7   V+II
    //17  X+V+II   X+IV
    //27  XX+V+II
    public static int romanToInt(String s) {
        //正常情况下累加，左边的数字大于右边的数字
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    num = num + 1;
                    break;
                case 'V':
                    num = num + 5;
                    break;
                case 'X':
                    num = num + 10;
                    break;
                case 'L':
                    num = num + 50;
                    break;
                case 'C':
                    num = num + 100;
                    break;
                case 'D':
                    num = num + 500;
                    break;
                case 'M':
                    num = num + 1000;
                    break;
                default:
            }
            if (i != 0) {
                if (((s.charAt(i) == 'V') || (s.charAt(i) == 'X')) && (s.charAt(i - 1) == 'I')) {
                    num = num - 2;
                } else if (((s.charAt(i) == 'L') || (s.charAt(i) == 'C')) && (s.charAt(i - 1) == 'X')) {
                    num = num - 10 * 2;
                } else if (((s.charAt(i) == 'D') || (s.charAt(i) == 'M')) && (s.charAt(i - 1) == 'C')) {
                    num = num - 100 * 2;
                }
            }

        }
        return num;
    }



    public static void main(String[] args) {
        System.out.println(romanToInt("MDCLI"));
    }
}