class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node newnode) {
        Node temp = head.next;

        newnode.next = temp;
        newnode.prev = head;

        head.next = newnode;
        temp.prev = newnode;
    }

    private void deleteNode(Node delnode) {
        Node prevv = delnode.prev;
        Node nextt = delnode.next;

        prevv.next = nextt;
        nextt.prev = prevv;
    }

    public int get(int key) {
        if (m.containsKey(key)) {
            Node resNode = m.get(key);
            int ans = resNode.val;

            // m.remove(key);
            deleteNode(resNode);
            addNode(resNode);

            // m.put(key, head.next); here we can skip the operations that remove and then add  from the unordered hash map because, if in this case if the key exists in the hash map then it will stay in the map, irrespective of where in the hashmap it is. the order in which the key-node pair is present in the map m is not relevant for which the remove and add operation was being done, as the order in being maintained by the doubly-linkedList.
            return ans;
        }
        return -1;
    }

    public void put(int key, int value) {
        // if (m.containsKey(key)) {
        //     Node curr = m.get(key);
        //     // m.remove(key);
        //     deleteNode(curr);
        // }

        if (m.containsKey(key)) {
            Node node = m.get(key);
            node.val = value;
            deleteNode(node);
            m.remove(key);
            // addNode(node);
            // return;
        }

        if (m.size() == cap) {
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addNode(new Node(key, value));
        m.put(key, head.next);
    }
}