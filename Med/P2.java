package Med;

public class P2 {
    // Link List
    public static class ListNode{
        int val;
        ListNode next;
        
        ListNode(int val){
            this.val = val;
        }

        ListNode(int[] x){
            if (x == null || x.length == 0) {
                return;
            }
            this.val = x[0];
            ListNode current = this;
            for (int i = 1; i < x.length; i++) {
                current.next = new ListNode(x[i]);
                current = current.next;
            }
        }

        ListNode(){
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next =next;
        }

        public Integer count(){
            int count = 1;
            ListNode current = this;
            while (current.next != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        public void print(){
            ListNode current = this;
            while (current != null) {
                System.out.print(current.val);
                current = current.next;
            }
            System.out.println();
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; //Biến nhớ
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        P2 p = new P2();

        ListNode node1 = new ListNode(new int[]{2,4,3});
        ListNode node2 = new ListNode(new int[]{5,6,4});
        p.addTwoNumbers(node1, node2).print();

        return;
    }
}
