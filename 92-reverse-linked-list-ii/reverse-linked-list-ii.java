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
    ListNode findNode(ListNode head,int n){
        if(n==0)return null;
        ListNode temp = head;
        while(n>1){
            temp=temp.next;
            n--;
        }
        return temp;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right)return head;
        ListNode prevNode = findNode(head,left-1);
        ListNode leftNode = left==1?head:prevNode.next;
        
        ListNode prev = null;
        ListNode curr = leftNode;
        while(left<=right){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            left++;
        }
        leftNode.next = curr;
        if(prevNode == null){
            head = prev;
        }else{
            prevNode.next = prev;
        }
        return head;
    }

}