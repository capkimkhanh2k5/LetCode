package Easy;

import java.util.HashMap;
import java.util.Map;

public class P9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        Map<Integer, Integer> map = new HashMap<>();

        // đếm số phần tử
        int i = 0;
        while(x > 0){
            int tmp = x % 10;
            map.put(i, tmp);
            x = x / 10;
            i++;
        }

        for(int j = 0; j < i / 2; j++){
            if(map.get(j) != map.get(i - j - 1)){
                return false;
            }
        }       

        return true;
    }


    public static void main(String[] args) {
        P9_Palindrome_Number p = new P9_Palindrome_Number();
        System.out.println(p.isPalindrome(123454321));
    }
}
