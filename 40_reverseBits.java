import java.util.Stack;

class Solution {
    public int reverseBits(int n) {
        Stack<Integer> s = new Stack<>();

        while ( n > 0)
        {
            int x = (int)(Math.log(n) / Math.log(2));
            s.push(x);
            n = (int) (n - Math.pow(2, x));

            //System.out.println(x + "|" + n);
        }

        // System.out.println("Stack:");
        // while(!s.isEmpty())
        // {
        //     System.out.println(s.pop());
        // }

        int[] x = new int[32];
        while(!s.isEmpty())
        {
            x[s.pop()] = 1;
        }

        int sum = 0;

        // System.out.println("Array Bit:");
        for(int i = 0; i < 32; i ++)
        {
            // System.out.println(x[i]);
            
            if(x[i] != 0)
            {
                sum += Math.pow(2, 31-i);
            }
        }

        return sum;
    }

    // public static void main(String[] args) {
    //     Solution s = new Solution();

    //     System.out.println( s.reverseBits(43261596));
    // }
}