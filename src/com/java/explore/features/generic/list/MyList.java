package com.java.explore.features.generic.list;

public class MyList <T> {
    private Object[] elementData ;
    private int size;

    public MyList() {
        this.elementData = new Object[10];
        size = 0;
    }

    public boolean add(T e){
        if(rangeCheck(size)){
            elementData[size++] = e;
            return true;
        }else{
            return false;
        }
    }

    public T get(int index){
        if(rangeCheck(index)){
            return elementData(index);
        }
        return null;
    }

    public T set(T elem, int index){
        if(rangeCheck(index)){
            T oldValue = elementData(index);
            elementData[index] = elem;
            return oldValue;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private T elementData(int index) {
        return (T) elementData[index];
    }

    private boolean rangeCheck(int size) {
        if(size < 10){
            return true;
        }
        return false;
    }

}
