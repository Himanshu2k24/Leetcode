class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = null;
        ListNode prev = null;
        while(head != null){
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;   
        }
        return curr;
    }
}