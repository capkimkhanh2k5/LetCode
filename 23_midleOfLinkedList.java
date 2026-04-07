import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        Stack<Integer> s = new Stack<>();

        ListNode control = head;
        
        while(control != null)
        {
            s.push(control.val);
            control = control.next;
        }

        int n = s.size();

        int index = n / 2 + 1;

        ListNode rs = new ListNode(-1);
        control = rs;
        
        for(int i = index - 1; i < n; i ++)
        {
            System.out.println("Index" + index );
            System.out.println("Stack " + s.elementAt(i));
            ListNode newNode = new ListNode(s.elementAt(i));
            control.next = newNode;
            control = control.next;
        }

        return rs.next;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Tạo linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        // new ListNode(5,
                        new ListNode(5
                        // new ListNode(6
                        )))));

        ListNode result = sol.middleNode(head);

        // In kết quả
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}