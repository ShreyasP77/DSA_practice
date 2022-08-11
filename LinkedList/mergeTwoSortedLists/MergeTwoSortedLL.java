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
    public ListNode eval( ListNode first, ListNode second){
            
            if(first.next == null){
                    first.next = second;
                    return first;
                    
            }
            
            ListNode cur1 = first;
            ListNode next1 = cur1.next;
            
            ListNode cur2 = second;
            ListNode next2 = cur2.next;
            
            while(next1!=null && cur2!=null){
                    if(cur2.val>=cur1.val && cur2.val<=next1.val){
                            cur1.next = cur2;
                            next2 = cur2.next;
                            
                            cur2.next = next1;
                            cur1 = cur2;
                            cur2 = next2;
                    }else{
                            cur1 = next1;
                            next1 = next1.next;
                            if(next1==null){
                                    cur1.next = cur2;
                                    return first;
                            }
                    }
            }
                
            return first;
            
            
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
            
        if(list1.val <= list2.val)  return eval(list1, list2);
        else return eval(list2, list1);
    }
}
