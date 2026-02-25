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
    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        return prev;
    }

    ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        ListNode head1 = head;
        ListNode head2 = reverse(mid(head));

        while(head1!=null && head2!=null){
            ListNode temp = head1.next;
            head1.next=head2;
            head1=temp;

            temp = head2.next;
            head2.next=head1;
            head2=temp;
        }
        if(head1!=null){
            head1.next=null;
        }
     
    }

}