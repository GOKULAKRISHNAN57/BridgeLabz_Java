package Data_Structure_And_Algorithm.Stack_Queue_HashMap_and_Hashing_Function;

class MyHashMap {

    static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 1000;
    private Node[] bucket;

    public MyHashMap() {
        bucket = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);

        if (bucket[index] == null) {
            bucket[index] = new Node(key, value);
            return;
        }

        Node curr = bucket[index];
        while (true) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            if (curr.next == null) break;
            curr = curr.next;
        }

        curr.next = new Node(key, value);
    }

    public int get(int key) {
        int index = hash(key);
        Node curr = bucket[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node curr = bucket[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) bucket[index] = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}