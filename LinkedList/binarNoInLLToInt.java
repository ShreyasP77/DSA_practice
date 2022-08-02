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
//   Takes Extra Space for String Storage in Stack memory. TC:O(n) SC:O(n)
    public int getDecimalValue(ListNode head) {
            String str = "";
            
            while(head != null){
                    str += Integer.toString(head.val);
                    head = head.next;
            }
            int val = Integer.parseInt(str,2);
        return val;
    }
//   TC:O(n) SC:O(1)
    // public int getDecimalValue(ListNode head) {
    //         int n = head.val;
    //         while(head.next != null){
    //                 // n = n*2 + head.next.val;
    //                 n = (n<<1) | head.next.val;
    //                 head = head.next;
    //         }
    //     return n;
    // }
//         [1,0,1]
        
//         n            head.next       head.val
//         1            2               0
//         1*2+0(2)     3               1
//         2*2+1(5)     x
}
