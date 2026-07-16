class MyHashSet {

    private boolean[] table;

    public MyHashSet() {
        // Constraint says keys are in range [0, 1,000,000]
        table = new boolean[1000001];
    }
    
    public void add(int key) {
        table[key] = true;
    }
    
    public void remove(int key) {
        table[key] = false;
    }
    
    public boolean contains(int key) {
        return table[key];
    }
}

/**
 * Usage:
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1); // set = [1]
 * myHashSet.add(2); // set = [1, 2]
 * System.out.println(myHashSet.contains(1)); // true
 * System.out.println(myHashSet.contains(3)); // false
 * myHashSet.remove(2); // set = [1]
 * System.out.println(myHashSet.contains(2)); // false
 */
