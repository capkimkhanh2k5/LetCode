import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (var i : nums)
        {
            if(map.containsKey(i)) return true;
            map.put(i, 1);
        }

        return false;
    }
}