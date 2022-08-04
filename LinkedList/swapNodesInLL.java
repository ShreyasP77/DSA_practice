// Q. You are given the head of a linked list, and an integer k.

//    Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).




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
    public ListNode swapNodes(ListNode head, int k) {
            ListNode cur = head,endInd=head,startInd=head;
            int count = 0;
            while(cur!=null){
                    count++;            // Counting total nodes
                    cur = cur.next;
            }
            int n = count-k;
            for(int i=0; i<n;i++){
                    endInd = endInd.next; // Moving endIndex Location backwards at kth node from end
            }
            
            for(int i=0; i<k-1; i++){
                    startInd = startInd.next; // Moving startIndex Location forward at kth node from start
            }
            
//             Swap Values
            int temp = endInd.val;
            endInd.val = startInd.val;
            startInd.val = temp;
            return head;
        
    }
}
