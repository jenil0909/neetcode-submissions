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
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode temp1 = l1, temp2 = l2;
    int carry = 0;
    ListNode dummy = new ListNode(0);
    ListNode pookie = dummy;

    // Use OR (||) so we don't stop prematurely if one list is longer
    // Also run if there's a leftover carry at the very end!
    while (temp1 != null || temp2 != null || carry != 0) {
        int val1 = (temp1 != null) ? temp1.val : 0;
        int val2 = (temp2 != null) ? temp2.val : 0;
        
        int totalSum = val1 + val2 + carry;
        
        // Calculate the value for the new node and the next carry
        int nodeVal = totalSum % 10;
        carry = totalSum / 10;

        // FIX 1: Create a brand new node instead of accessing .next.val directly
        pookie.next = new ListNode(nodeVal);
        
        // Move the worker pointer forward
        pookie = pookie.next;

        // FIX 2 & 3: Safely advance the temporary tracking pointers forward
        if (temp1 != null) temp1 = temp1.next;
        if (temp2 != null) temp2 = temp2.next;
    }

    // Return the actual head skipping the dummy anchor
    return dummy.next;
}

}