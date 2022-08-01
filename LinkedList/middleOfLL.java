

// Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.


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
    public ListNode middleNode(ListNode head) {
            int count=1;
            ListNode temp=head;
        for(;temp.next!=null;temp=temp.next)
        {
            count++;
            
        }
        count=(count/2)+1;
        ListNode dummy=head;
        for(;count>1;count--)
        {
            dummy=dummy.next;
        }
        return dummy;
    }
}
