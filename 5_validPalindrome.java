class Solution {
    public boolean isPalindrome(String s) {
        // Loại bỏ các ký tự không phải chữ hoặc số
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] c = s.toCharArray();

        // for(char ch : c)
        // {
        //     System.out.print(ch + " ");
        // }

        //Kiểm tra đối xứng
        int n = c.length;
        if(n == 0) return true;

        for(int i = 0; i <= (int) n/2; i ++)
        {
            char left = c[i];
            char right = c[n - i - 1];
            if(left != right) return false;
        }

        return true;
    }


    // public static void main(String[] args) {
    //     Solution p = new Solution();
    //     System.out.println(p.isPalindrome("A man, a plan, a canal: Panama"));
    // }
}