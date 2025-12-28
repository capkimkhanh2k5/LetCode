package Easy;

import java.util.HashMap;
import java.util.Map;

public class P1 {
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

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        P1 p1 = new P1();
        
        int[] res = p1.twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        return;
    }
}
