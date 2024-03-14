package org.example.hw8.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<T> {
    private List<T> items;

    public MyCollection() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public MyIterator<T> createIterator() {
        return new ListIterator<>(items);
    }
}
