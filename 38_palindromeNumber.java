import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0) return false;

        ArrayList<Integer> arr = new ArrayList<>();
        while(x != 0)
        {
            arr.add(x % 10);
            x /= 10;
        }

        int[] nums = arr.stream().mapToInt(i -> i).toArray();
        int left = 0, right = nums.length - 1;

        while(left < right)
        {
            if(nums[left] != nums[right]) return false;
            left ++;
            right --;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.isPalindrome(-121));
        System.out.println(s.isPalindrome(121));
    }
}