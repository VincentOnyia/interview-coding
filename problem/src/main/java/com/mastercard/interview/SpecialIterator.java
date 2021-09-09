package com.mastercard.interview;

import java.util.Iterator;

public class SpecialIterator implements Iterator {
    private String[] data;

    public SpecialIterator(String[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
