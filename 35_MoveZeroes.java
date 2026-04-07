class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int ptr = 0;

        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[ptr] != 0)
            {
                nums[ptr ++] = nums[i];
            }
        }

        for(int i = ptr; i < nums.length; i ++)
        {
            nums[i] = 0;
        }
    }

    public void moveZeroes2(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}