import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int length = 0;

        for(int i = 0; i < s.length(); i ++)
        {
            if (map.containsKey(s.charAt(i)))
            {
                l = Math.max(l, map.get(s.charAt(i)) + 1);
            }

            length = Math.max(length, i - l + 1);

            map.put(s.charAt(i), i);
        }
        
        return length;
    }
}