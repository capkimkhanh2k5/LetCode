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
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        Stack<Integer> stack = new Stack<>();

        ListNode control = head;

        while(control != null)
        {
            stack.push(control.val);
            control = control.next;
        }
        
        ListNode result = new ListNode(-1);
        control = result;

        while (!stack.isEmpty()) 
        {
            control.next = new ListNode(stack.pop());
            control = control.next;
        }

        return result.next;
    }
}