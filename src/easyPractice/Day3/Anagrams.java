package easyPractice.Day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static boolean isAnagram(String s, String t) {
//            if(s.length() != t.length()){
//                return false;
//            }
//            char[] str1 =t.toCharArray();
//            char[] str2 =s.toCharArray();
//            Arrays.sort(str1);
//            Arrays.sort(str2);
//            return Arrays.equals(str1,str2);

//        if(s.length() != t.length()){
//            return false;
//        }
//        int [] table = new int [26];
//        for (int i=0;i<t.length();i++){
//            table[t.charAt(i)-'a']++;
//        }
//        for (int j=0 ;j<s.length();j++){
//            table[s.charAt(j)-'a']--;
//            if(table[s.charAt(j)-'a']<0){
//                return false;
//            }
//        }
//        return true;
//    }
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
        System.out.println(isAnagram("car", "rat"));

    }
}

