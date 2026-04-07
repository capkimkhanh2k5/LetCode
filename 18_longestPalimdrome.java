import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        boolean hasMain = false;

        HashMap<Character, Integer> map = new HashMap<>();

        System.out.println(c);
        
        for(var i : c)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (var n : map.values())
        {
            if (n % 2 == 1 && !hasMain)
            {
                hasMain = true;
                count++;
            }

            count += (n / 2) * 2;
        }

        System.out.println(map);

        return count;
    }

    // public static void main(String[] args) {
    //     Solution s = new Solution();

    //     System.out.println(s.longestPalindrome("null"));
    //     System.out.println(s.longestPalindrome("abccccdd"));
    //     System.out.println(s.longestPalindrome("aab"));
    // }
}