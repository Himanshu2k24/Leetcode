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
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        while(l1!=null){
            arr1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            arr2.add(l2.val);
            l2=l2.next;
        }

        ListNode head=null;
        int sum=0;
        
        int carry=0;
        int a=arr1.size()-1;int b=arr2.size()-1;
        while(a>=0 || b>=0){
            if(a>=0 && b>=0){
                sum=(carry+arr1.get(a)+arr2.get(b));
                carry=sum/10;
                
            }else if(a>=0 && b<0){
                sum=(carry+arr1.get(a));
                carry=sum/10;
            }else if(a<0 && b>=0){
                sum=(carry+arr2.get(b));
                carry=sum/10;
            }
            a--;
            b--;
            
            
            
            ListNode temp=new ListNode(sum%10);
            temp.next=head;
            head=temp;
            sum=0;

            

        }

        if(carry!=0){
            ListNode temp=new ListNode(carry);
            temp.next=head;
            head=temp;
        }
        return head;
    }
}