class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Create a dummy node pointing to head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Step 2: Find the total length of the list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        // Step 3: Find the position from the front to stop at (right before target)
        int stepsToMove = length - n;
        temp = dummy; // Reset temp to start from dummy
        
        for (int i = 0; i < stepsToMove; i++) {
            temp = temp.next;
        }
        
        // Step 4: Skip the target node (e.g., changing 1 -> 2 -> 3 into 1 -> 3)
        temp.next = temp.next.next;
        
        // Return the actual starting node
        return dummy.next;
    }
}
