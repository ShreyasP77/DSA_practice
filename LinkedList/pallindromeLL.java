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
    public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null) return true;
        ListNode cur = head;
        ListNode middle = middleLL(cur);
        ListNode prev = null;
        ListNode res = reverse(middle,prev);
        while(res!=null){
                if(head.val!=res.val)return false;
                head = head.next;
                res = res.next;
        }
        return true;
            
    }
    public ListNode middleLL(ListNode head){
            ListNode slow = head, fast = head;
            while(fast!= null && fast.next!=null){
                    slow = slow.next;
                    fast = fast.next.next;         
            }
            return slow;  
    }
    public ListNode reverse(ListNode cur, ListNode prev){
        if(cur == null) return prev;

        ListNode temp = cur.next;
        cur.next = prev;
        return reverse(temp,cur);
        
    }
     
}
