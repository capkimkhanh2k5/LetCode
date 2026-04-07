import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        char[] c1 = s.toLowerCase().toCharArray();
        char[] c2 = t.toLowerCase().toCharArray();

        for(var c : c1)
        {  
            if(c == '#')
            {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            }
            else
            {
                s1.push(c);
            }
        }

        for(var c : c2)
        {
            if(c == '#')
            {
                if (!s2.isEmpty()) {
                    s2.pop();
                }
            }
            else
            {
                s2.push(c);
            }
        }     

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.backspaceCompare("ab#c", "ab#c"));

        return;
    }
}