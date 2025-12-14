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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        st.add(head.val);
        head = head.next;
        while(head != null){
            if(st.peek() >= head.val){
                st.add(head.val);
                head =head.next;
            }else{
                while(!st.isEmpty() && st.peek() < head.val){
                    st.pop();
                }
                st.add(head.val);
                head = head.next;
            }
        }
        ListNode path = null;
        while(!st.isEmpty()){
            ListNode dummy = new ListNode(st.pop());
            dummy.next = path;
            path = dummy;
        }
        return path;
        
    }
}