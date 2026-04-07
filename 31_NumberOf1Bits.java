import java.util.Stack;

class Solution {
    public int hammingWeight(int n) {
        Stack<Integer> s = new Stack<>();

        while(n > 0)
        {
            int x = (int) Math.floor(Math.log(n) / Math.log(2) + 1e-10);
            n = (int) (n - Math.pow(2, x));

            s.push(x);
        }

        return s.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.hammingWeight(2147483645));
    }
}