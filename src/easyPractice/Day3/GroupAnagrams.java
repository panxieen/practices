package easyPractice.Day3;

import java.util.*;

public class GroupAnagrams {
        public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str:strs) {
                char [] ch = str.toCharArray();
                Arrays.sort(ch);
                String key = new String(ch);
                List<String> list = map.getOrDefault(key,new ArrayList<String>());
                list.add(str);
                map.put(key,list);
            }
            return new ArrayList<List<String>>(map.values());
        }

            public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}



