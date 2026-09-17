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
public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Step 1: Handle edge case or trivial requests
        if (head == null || left == right) return head;
        
        // Step 2: Establish the structural anchor (Dummy Node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Step 3: Walk 'prev' to the node right before the reversal zone
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        
        // Step 4: Set up 'curr' at the launch point of reversal
        ListNode curr = prev.next;
        
        // Step 5: Perform the iterative cutting and splicing
        for (int i = 0; i < right - left; i++) {
            ListNode temp = curr.next;     // 1. Grab the next node to move
            curr.next = temp.next;         // 2. Bypass 'temp'
            temp.next = prev.next;         // 3. Point 'temp' to current front of sublist
            prev.next = temp;              // 4. Connect 'prev' to 'temp'
        }
        
        // Step 6: Return the anchored start of the modified list
        return dummy.next;
    }
}
