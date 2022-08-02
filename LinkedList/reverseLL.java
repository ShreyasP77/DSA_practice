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
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev=null,cur=head;
    //     while(cur != null){
    //             ListNode temp = cur.next;//so that my head node of the list is not lost.
    //             cur.next = prev;
    //             prev = cur;
    //             cur = temp;
    //     }
    //         return prev;
    // }
        
//  2.1 Recursive Approach
//         If you look at it carefully is similar to iterative one.
        
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode cur = head;
//         ListNode res = reverse(cur,prev);
//         return res;
//     }
        
//     ListNode reverse(ListNode cur, ListNode prev){
//         if(cur == null) return prev;

//         ListNode temp = cur.next;
//         cur.next = prev;
//         return reverse(temp,cur);
        
//     }
        
//  2.2 Recursive Approach
     public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
        
    ListNode reverse(ListNode cur, ListNode prev){
        

        ListNode temp = cur.next;
        cur.next = prev;
        return reverse(temp,cur);
        
    }
              
//         Initail setup.
//          head
//            |
//     x     [1]->[2]->[3]->[4]->[5]->x
//     |      |
//     prev  cur
        
//         Inside while Loop
//         Iteration 1
//                cur=temp
//                 |
//         x<-[1] [2]->[3]->[4]->[5]
//             |
//            prev
        
        
//         Iteration 2
//                     cur=temp
//                       |
//         x<-[1]<-[2]  [3]->[4]->[5]
//                 |
//                prev
        
        
//         Iteration 3
//                           cur=temp
//                            |
//         x<-[1]<-[2]<-[3]  [4]->[5]
//                       |
//                      prev
        
        
//         Iteration 4
//                               cur=temp
//                                 |
//         x<-[1]<-[2]<-[3]<-[4]  [5]
//                            |
//                           prev
        
        
//         Iteration 5
//                                      cur=temp
//                                      |
//         x<-[1]<-[2]<-[3]<-[4]<-[5]   null
//                                 |
//                                 prev
}
