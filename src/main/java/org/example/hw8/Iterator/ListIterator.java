package org.example.hw8.Iterator;

import java.util.List;

public class ListIterator<T> implements MyIterator<T> {
    private List<T> list;
    private int position;

    public ListIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            T item = list.get(position);
            position++;
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
