package com.java.misc.cache;

public class Node<T,U> {

    private T key;
    private U value;
    Node<T,U> prev;
    Node<T,U> next;

    public Node(T key, U value, Node<T, U> prev, Node<T, U> next) {
        this.key = key;
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public T getKey() {
        return key;
    }

    public U getValue() {
        return value;
    }
}
