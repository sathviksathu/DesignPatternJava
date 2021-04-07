package com.java.misc.cache;



import java.util.HashMap;
import java.util.Map;

public class LRUCache<K,V> implements Cache<K,V>{

    /**
     * Placeholder for least recently used node
     */
    private Node<K,V> lru;

    /**
     * Placeholder for most recently used node
     */
    private Node<K,V> mru;

    /**
     * mapping between Nodes and their keys
     */
    private Map<K,Node<K,V>> cache;

    /**
     * maintain the capacity
     */
    private int capacity;

    public LRUCache() {
      this(DEFAULT_MAX_CAPACITY);
    }

    public LRUCache(int initialCapacity){
        this.capacity = initialCapacity;
        this.lru = null;
        this.mru = null;
        cache = new HashMap<>(initialCapacity);
    }

    @Override
    public boolean inCache(K k) {
        return cache.containsKey(k);
    }

    @Override
    public int size() {
        return cache.size();
    }

    @Override
    public void put(K k, V v) {
        //check if already present
        if(cache.containsKey(k)){
            //if it's already present simply return
            //this is not counted as access and map/list structure dosent change.
            System.out.println("already exisitng hence not inserting\n");
            return;
        }else{
            System.out.println("Putting new entry: "+v.toString()+"\n");
            putNewEntry(new Node(k,v,null,null));
        }
    }

    private void putNewEntry(Node<K,V> node) {
        //check for capacity
        if(size() == capacity){
            System.out.println("reached capacity hence evicting..\n");
            //if capacity reached, evict an entry and then proceed to entry
            evict();
        }
        //insert at end
        System.out.println("linking current node at end..\n");
        linkAtEnd(node);
        cache.put(node.getKey(),node);
    }

    private void evict() {
        //update the lru
        cache.remove(lru.getKey());
        System.out.println("removing lru: "+lru.getValue().toString()+"\n");
        lru = lru.next;
        lru.prev = null;
        System.out.println("new lru after evicting is: "+lru.getValue().toString()+"\n");
    }

    private void linkAtEnd(Node<K,V> node) {
        //for the first ever entry
        if(mru == null && lru == null){
            System.out.println("First ever entry into map, hence both lru and mru is the node\n");
            lru = mru = node;
            return;
        }
        // make current mru's next point to present node
        mru.next = node;
        node.prev = mru;
        node.next = null;
        //update mru to present node
        mru = node;
        System.out.println("linking current node at end and updating mru: "+mru.getValue().toString()+"\n");
    }

    @Override
    public V get(K k) {
        if(!cache.containsKey(k)){
            System.out.println("The accessed key doesnt exist: "+k.toString()+"\n");
            return null;
        }
        Node<K,V> accessedNode = cache.get(k);
        //if it's the mru already simply return
        if(accessedNode == mru){
            System.out.println("The accessed key is already mru: "+accessedNode.getValue().toString()+"\n");
            return accessedNode.getValue();
        } else {
            //we gotta update the list before returning
            if(accessedNode.prev==null){
                /**
                 * this means lru/head has been accessed, so
                 * qualify next to lru as current lru before
                 * linking current node at tail and make it mru
                 */
                System.out.println("The accessed key is lru: "+accessedNode.getValue().toString()+"\n");
                lru = lru.next;
                lru.prev = null;
            } else {
                /**
                 * this means some intermediate node has been accessed
                 * hence we need to modify internal connections before
                 * linking current node at tail and make it mru
                 */
                System.out.println("The accessed key is intermediate: "+accessedNode.getValue().toString()+"\n");
                Node<K,V> prev = accessedNode.prev;
                Node<K,V> next = accessedNode.next;
                prev.next = next;
                next.prev = prev;
            }
            //linking current node at tail and make it mru
            linkAtEnd(accessedNode);
            System.out.println("The updated lru after access: "+lru.getValue().toString()+"\n");
        }
        return mru.getValue();
    }

}
