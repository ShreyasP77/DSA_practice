/*
Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [0,1,2,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result
*/



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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode start_a = list1;
            for(int i=0; i<a-1; i++){
                    start_a = start_a.next; // finding Node ~~~``a``~~~~
            }
            ListNode end_b = start_a;
            for(int i=a; i<=b; i++){
                    end_b = end_b.next; // finding Node ~~~``b``~~~~
            }
            start_a.next = list2; // connect ath node to list starting Node
            
            while(list2.next!=null){
                    list2 = list2.next; // finding the end node of list2
            }
        list2.next = end_b.next; // connect  list ending Node to bth node
            return list1;
    }
}
