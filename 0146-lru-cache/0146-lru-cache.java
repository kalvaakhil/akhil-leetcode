class LRUCache {

    public class Node {
    int key;
    int value;

    public Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

    private final int capacity;
    private Map<Integer, Node> map;
    Deque<Node> dll = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        int val = -1;
        if (map.containsKey(key)) {
        Node node = map.get(key);
        val = node.value;
        dll.remove(node);
        dll.addFirst(node);
        }
        return val;
    }
    
    public void put(int key, int value) {
        Node node;
        if (map.containsKey(key)) {
            node = map.get(key);
            dll.remove(node);
            node.value = value;
        } else {
        if (map.size() >= capacity) {
            Node n = dll.removeLast();
            map.remove(n.key);
        }
            node = new Node(key, value);
            map.put(key, node);
        }
        dll.addFirst(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */