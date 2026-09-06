class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start the recursion with an initial carry of 0
        return addListsRecursive(l1, l2, 0);
    }

    private ListNode addListsRecursive(ListNode l1, ListNode l2, int carry) {
        // Base Case: If both lists are empty and there is no leftover carry, stop!
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        // 1. Extract values safely (default to 0 if the list has ended)
        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        // 2. Perform the addition math
        int totalSum = val1 + val2 + carry;
        int nodeVal = totalSum % 10;
        int nextCarry = totalSum / 10;

        // 3. Create the current node for the result list
        ListNode resultNode = new ListNode(nodeVal);

        // 4. Safely get the next nodes (if a list is null, pass null forward)
        ListNode nextL1 = (l1 != null) ? l1.next : null;
        ListNode nextL2 = (l2 != null) ? l2.next : null;

        // 5. Recursive Step: Connect this node's .next to the result of the remaining elements
        resultNode.next = addListsRecursive(nextL1, nextL2, nextCarry);

        // Return the current built node up the call stack
        return resultNode;
    }
}
