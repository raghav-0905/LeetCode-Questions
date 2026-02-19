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
    //in slow fast pointer, agar fast null hota hai toh length even
    // agar null hota toh length even
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}