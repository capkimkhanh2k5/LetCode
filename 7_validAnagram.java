import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] c1 = s.toLowerCase().toCharArray();
        char[] c2 = t.toLowerCase().toCharArray();

        if(c1.length != c2.length) return false;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }


        for (int val : map.values()) {
            if (val != 0) return false;
        }


        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isAnagram("anagram", "nagaram"));
    }
}