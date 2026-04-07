class Solution {
    public int[] countBits(int n) {
        int[] rs = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            rs[i] = rs[i >> 1] + (i & 1);
        }

        return rs;
    }
}