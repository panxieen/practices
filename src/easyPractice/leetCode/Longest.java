package easyPractice.leetCode;

public class Longest {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null ||strs.length==0){
            return "";
        }
            String pre=strs[0];
        for (String str:strs) {
            while (str.indexOf(pre)!=0){
                pre= pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        String s = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);
    }
}
