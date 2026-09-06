/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null){
            Node copyNode = new Node(curr.val);
            copyNode.next = curr.next;
            curr.next = copyNode;
            curr = copyNode.next;
        }

        curr = head;
        while (curr != null){
            if (curr.random != null){
                curr.next.random = curr.random.next;
            }
            else       curr.next.random = null;

            curr = curr.next.next;

        }

        curr = head;

        Node baseHolder = new Node(0);
        Node pointerMover = baseHolder; //currently pointing to base

        while(curr!= null){
           Node cloneNode = curr.next; //pointing to A'
    

   pointerMover.next = cloneNode; //head of new copied array to A'
    pointerMover = pointerMover.next; // pointermover will be at A'
            curr.next = curr.next.next;
            curr = curr.next;

        }        

        return baseHolder.next;
    }
}
