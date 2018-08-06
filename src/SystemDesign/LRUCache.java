package SystemDesign;

import java.util.Hashtable;

public class LRUCache<S, S1> {
    class CacheNode {
        CacheNode prev;
        CacheNode next;
        Object key;
        Object value;
        public CacheNode() {

        }
    }
    private int currentCacheSize;
    private int cacheCapacity;
    private Hashtable<Object, CacheNode> nodes;
    private CacheNode first;
    private CacheNode last;

    public LRUCache(int size) {
        currentCacheSize = 0;
        this.cacheCapacity = size;
        nodes = new Hashtable<>(size);
    }

    public Object get(S key) {
        CacheNode node = nodes.get(key);
        if (node == null) {
            return null;
        } else {
            moveToHead(node);
            return node;
        }
    }

    public void put(S key, S1 value) {
        CacheNode node = nodes.get(key);
        if (node == null) {
            if (currentCacheSize >= cacheCapacity) {
                nodes.remove(last.key);
                removeLast();
            } else {
                currentCacheSize ++;
            }
            node = new CacheNode();
        }
        node.key = key;
        node.value = value;
        moveToHead(node);
        nodes.put(key, node);
    }

    public void remove(S key) {
        CacheNode node = nodes.get(key);
        if (node != null) {
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }

            if (last == node) {
                last = node.prev;
            }
            if (first == node) {
                first = node.next;
            }
        }
        nodes.remove(key);
    }

    private void removeLast() {
        if (last != null) {
            if (last.prev != null) {
                last.prev.next = null;
            } else {
                first = null;
            }
            last = last.prev;
        }
    }

    private void moveToHead(CacheNode node) {
        if (node == first) return;
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
        if (last == node) last = node.prev;
        if (first != null) {
            node.next = first;
            first.prev = node;
        }
        first = node;
        node.prev = null;
        if (last == null) last = first;
    }

    public void clear() {
        first = null;
        last = null;
        currentCacheSize = 0;
    }

    public static void main(String[] args) {
        LRUCache<String, String> c = new LRUCache<>(3);
        c.put ("1", "one");                           // 1
        c.put ("2", "two");                           // 2 1
        c.put ("3", "three");                         // 3 2 1
        c.put ("4", "four");                          // 4 3 2
        if (c.get("2") == null) throw new Error();    // 2 4 3
        c.put ("5", "five");                          // 5 2 4
        c.put ("4", "second four");                   // 4 5 2
        // Verify cache content.
        if (!c.get("4").equals("second four")) throw new Error();
        if (!c.get("5").equals("five"))        throw new Error();
        if (!c.get("2").equals("two"))         throw new Error();

    }


}
