package Med;

public class P8 {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int i = 0;
        char firstChar = s.charAt(0);
        if (firstChar == '-') {
            sign = -1;
            i++;
        } else if (firstChar == '+') {
            i++;
        }

        long result = 0; // Use long to detect overflow

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Check for overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        P8 p = new P8();
        System.out.println(p.myAtoi("42"));
        System.out.println(p.myAtoi("     -042"));
        System.out.println(p.myAtoi("4193 with words"));
        System.out.println(p.myAtoi("words and 987"));
        System.out.println(p.myAtoi("1337c0d3"));
        System.out.println(p.myAtoi("0-1"));
        System.out.println(p.myAtoi("-91283472332"));

        return;
    }
}
