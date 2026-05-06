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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode re = dummy;
        int sum = 0;
        while(l1 != null && l2 != null){
            sum += l1.val + l2.val;
            if(sum > 9){
                int rem = sum % 10;
                sum /= 10;
                dummy.next = new ListNode(rem);
            }else{
                dummy.next = new ListNode(sum);
                sum /= 10;
            }
            l1 = l1.next;
            l2 = l2.next;
            dummy = dummy.next;
        }
        while(l1 != null){
            sum += l1.val;
            if(sum > 9){
                int rem = sum % 10;
                sum /= 10;
                dummy.next = new ListNode(rem);
            }else{
                dummy.next = new ListNode(sum);
                sum /= 10;
            }
            l1 = l1.next;
            dummy = dummy.next;
        }
        while(l2 != null){
            sum += l2.val;
            if(sum > 9){
                int rem = sum % 10;
                sum /= 10;
                dummy.next = new ListNode(rem);
            }else{
                dummy.next = new ListNode(sum);
                sum /= 10;
            }
            l2 = l2.next;
            dummy = dummy.next;
        }
        if(sum > 0){
            dummy.next = new ListNode(sum);
        }

        return re.next;
    }
}