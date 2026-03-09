import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // Key là giá trị, value là index của nums

        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                // Lấy vị trí
                return new int[] {map.get(tmp), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}