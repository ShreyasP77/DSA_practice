
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
//     public ListNode deleteDuplicates(ListNode head) {
//             if(head == null) return null;
//             ListNode prev = head, checkCur = head.next;
//             while(checkCur != null){
//                     if(prev.val == checkCur.val){
//                             prev.next = checkCur.next;
//                             checkCur = checkCur.next;
                            
//                     }else{  prev.next = checkCur;
//                             checkCur = checkCur.next;
//                             prev = prev.next;
//                     }
//             }
//             return head;
        
//     }
    public ListNode deleteDuplicates(ListNode head) {
            if(head == null) return null;
            ListNode cur =  head;
            while(cur.next != null){
                    if(cur.val == cur.next.val){
                            cur.next = cur.next.next;
                            
                    }else cur = cur.next;
            }
            return head;
        
    }
//         [1,1,1,2,2,3] 
//         cur
//          |---|
//         [1,1,1,1,2,2,3] cur.val == cur.next.val
//         cur
//          |---|
//         [1,1,1,2,2,3] cur.val == cur.next.val 
//         cur
//          |---|
//         [1,1,2,2,3] cur.val == cur.next.val 
//           cur
//            |
//         [1,2,2,3] cur.val != cur.next.val 
//           cur
//            |---|
//         [1,2,2,3] cur.val == cur.next.val 
//              cur
//              |
//         [1,2,3] cur.val != cur.next.val 
        
        
        
}
