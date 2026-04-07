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

    public boolean isPalindrome2(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;

        // push
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        // compare
        curr = head;
        // while (curr != null) {
        //     if (curr.val != stack.pop()) {
        //         return false;
        //     }
        //     curr = curr.next;
        // }

        for(int i = 0; i < stack.size(); i ++)
        {
            if(curr.val != stack.pop()){
                return false;
            }
            curr = curr.next;
        }

        return true;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        // Midle -> Slow
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        //Reverse
        ListNode prev = null;
        while(slow != null)
        {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode left = head;
        ListNode right = prev;

        while(right != null)
        {
            if(left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
}