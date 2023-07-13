/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) 
			return false;
		ListNode p = head;
		ListNode q = head;
		while(q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
			if (p == q)
				return true;
		}
		return false;
        
        
//     ListNode slow = head;
//     ListNode fast = head;
        
//         if(head == null || head.next == null){
//             return false;
//         }
        
        
//         while(fast != null && fast.next.next != null){
//             fast = head.next.next;
//             slow = head.next;
//             if(fast == slow){
//                 return true;
//             }
//         }
        
//         return false;
        
    }
}