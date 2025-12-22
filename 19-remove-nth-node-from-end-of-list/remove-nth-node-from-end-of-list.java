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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode curr = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len == 1) return head.next;
        int nth = len - n;
        if(nth == 0) return head.next;
        int i =1;
        while(i < nth){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;

        return head;
    }
}

























