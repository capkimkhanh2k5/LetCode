class Solution {
    public int singleNumber(int[] nums) {
        int rs = 0;
        for(int i : nums)
        {
            rs ^= i;
        }

        return rs;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.singleNumber(new int[]{4,1,2,2,1}));
    }
}