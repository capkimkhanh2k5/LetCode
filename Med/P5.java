package Med;

public class P5 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left ++;
            right --;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;

        int maxLength = 1;
        String rs = s.substring(0, 1);

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < i; j ++){
                int len = i - j + 1;
                if(len > maxLength && isPalindrome(s.substring(j, i + 1))){
                    maxLength = len;
                    rs = s.substring(j, i + 1);
                }
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        P5 p = new P5();
        System.out.println(p.longestPalindrome("babad"));
        System.out.println(p.longestPalindrome("cbbd"));
        System.out.println(p.longestPalindrome("aa"));
        System.out.println(p.longestPalindrome("ac"));

        return;
    }
}
