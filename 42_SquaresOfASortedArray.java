class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int index = right;

        int[] arr = new int[nums.length];

        while (left <= right)
        {
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
            {
                arr[index] = nums[left] * nums[left];
                left ++;
            }
            else if(Math.abs(nums[left]) < Math.abs(nums[right]))
            {
                arr[index] = nums[right] * nums[right];
                right --;
            }
            else
            {
                arr[index] = nums[left] * nums[left];
                left ++;
            }
            index --;
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = s.sortedSquares(new int[]{-7,-3,2,3,11});

        for(int i = 0; i < a.length; i ++)
        {
            System.out.println(a[i]);
        }
    }
}