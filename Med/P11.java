package Med;

public class P11 {

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

    public static void main(String[] args) {
        P11 p = new P11();
        
        int[] x = {1,8,6,2,5,4,8,3,7};

        System.err.println(p.maxArea(x));
    }
}