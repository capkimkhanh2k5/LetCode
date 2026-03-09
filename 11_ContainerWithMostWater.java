class Solution {
    public int maxArea(int[] height) {
            int right = height.length - 1;
            int left = 0;
            int max = 0;

            while (left < right) {
                max = Math.max(max, (right - left) * Math.min(height[left], height[right]));

                if(height[left] < height[right]){
                    left ++;
                } else {
                    right --;
                }
            }

            return max;
        }
}