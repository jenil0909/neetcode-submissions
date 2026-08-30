class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to easily handle removing the head node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // Step 1: Move fast pointer so there is a gap of n nodes between slow and fast
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Step 2: Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Step 3: slow is now right BEFORE the node to delete. Skip it!
        slow.next = slow.next.next;
        
        // Return the actual head (handles head deletion seamlessly)
        return dummy.next;
    }
}
