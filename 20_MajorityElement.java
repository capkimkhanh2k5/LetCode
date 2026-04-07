class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int count = 0; 
        for(var i : nums)
        {
            if(count == 0) ans = i;
            if(i == ans) count ++;
            else count --;
        }

        return ans;
    }
}