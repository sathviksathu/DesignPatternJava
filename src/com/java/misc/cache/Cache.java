package com.java.misc.cache;

public interface Cache<K,V> {
    int DEFAULT_MAX_CAPACITY = 3;
    float DEFAULT_LOAD_FACTOR = 0.75f;
    boolean inCache(K k);
    int size();
    void put(K k,V v);
    V get(K k);
}
