package easyPractice.leetCode;

public class isValidPractice {
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if(chars.length % 2 == 1){
            return false;
        }
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.length() == 0;
    }
    public static void main(String[] args) {
        System.out.println(isValid("(}{})"));
    }
}
