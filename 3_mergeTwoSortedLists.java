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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode target = new ListNode(-1);
        ListNode control = target;

        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                control.next = list1;
                list1 = list1.next;
            }
            else
            {
                control.next = list2;
                list2 = list2.next;
            }
            control = control.next;
        }

        if(list1 == null)
        {
            control.next = list2;
        }
        else
        {
            control.next = list1;
        }

        return target.next;
    }
}