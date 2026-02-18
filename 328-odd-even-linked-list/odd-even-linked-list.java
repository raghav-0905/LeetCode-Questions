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
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        ListNode head1 = head;
        ListNode head2 = head.next;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while (temp2 != null && temp2.next != null) {
            ListNode odd = temp2.next;
            ListNode even = odd.next;

            temp1.next = odd;
            temp2.next = even;

            temp1 = odd;
            temp2 = even;
        }
        temp1.next=head2;
        return head1;
    }
}