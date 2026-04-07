import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        HashMap<Character, Integer> inventory = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            inventory.put(c, inventory.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int currentCount = inventory.getOrDefault(c, 0) - 1;
        
            if (currentCount < 0) {
                return false;
            }

            inventory.put(c, currentCount);
        }

        return true;
    }
}