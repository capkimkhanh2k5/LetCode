class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int index = 0;
        for(int i = 0; i < n; i ++){
            for(int j = index; j < i; j ++){
                if(s.charAt(i) == s.charAt(j)){
                    ans = Math.max(ans, i - index);
                    index = j + 1;
                    break;
                }
            }
        }
        
        ans = Math.max(ans, n - index);
        return ans;
    }
}