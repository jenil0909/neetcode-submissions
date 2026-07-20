class MyHashMap {

    private static class Node {
        int Key;
        int Value;
        Node next;

        Node(int Key,int Value){
            this.Key = Key;
            this.Value = Value;
        }
    }
        
    private final int size = 10000;
    private Node[] buckets;
    public MyHashMap() {
        buckets = new Node[size];
    }

    private int hash(int Key){
        return Key%size;
    }
    
    public void put(int Key, int Value) {
        int index = hash(Key);
        Node head = buckets[index];
        Node curr = head;

         while (curr != null) {
            if (curr.Key == Key) {
                curr.Value = Value;
                return;
            }
            curr = curr.next;
        }
        Node newNode = new Node(Key, Value);
        newNode.next = head;
        buckets[index] = newNode;
    }
    
    public int get(int Key) {
        int index = hash(Key);
        Node current =buckets[index];
        while(current != null){
            if (current.Key == Key){
                return current.Value;
            }
        }
        return -1;
    }
    
    public void remove(int Key) {
         int index = hash(Key);
        Node curr = buckets[index];
        Node prev = null;

        while (curr != null) {
            if (curr.Key == Key) {
                if (prev == null) {
                    buckets[index] = curr.next; // remove head
                } else {
                    prev.next = curr.next; // bypass node
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */