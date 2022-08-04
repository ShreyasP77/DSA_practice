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
    public ListNode removeElements(ListNode head, int val) {
         while(head!=null && head.val==val) head = head.next; // This loop is to check whether the ``element`` asked to be deleted is present from the start or not.
            ListNode cur = head; // such that head ptr is not lost.
        while(cur!=null && cur.next != null){
                if(cur.next.val==val) cur.next = cur.next.next;// Skipping that particular ``node``
                else cur = cur.next; // Else simply move forward.
     
        }
            
            return head;
    }
}
