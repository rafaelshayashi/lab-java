package com.rafaelshayashi.util;

public class ArrayBaseStructure<T> {

    protected T[] elements;
    protected int size;
    public static final int DEFAULT_SIZE = 10;

    public ArrayBaseStructure() {
        this(DEFAULT_SIZE);
    }

    public ArrayBaseStructure(int size){
        this.elements = (T[]) new Object[size];
        this.size = 0;
    }

    protected void increaseSize() {
        var newSize = elements.length * 2;
        var newArray = (T[]) new Object[newSize];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    public void clear() {
        elements = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
