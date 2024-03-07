package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E> {
    private ArrayList<E> delegate;
    public MyStack() {
        delegate = this;
    }

    public void push(E e) {

        this.add(e);
    }

    public E pop() {
        if (this.isEmpty()) throw new EmptyStackException();
        E e = this.get(size() - 1);
        this.remove(size() -1 );
        return e;
    }
    public E peek() {
        if (this.isEmpty()) throw new EmptyStackException();
        return this.get(size() - 1);
    }


}
