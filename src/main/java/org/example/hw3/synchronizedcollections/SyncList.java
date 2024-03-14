package org.example.hw3.synchronizedcollections;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncList<T>{
    private final ArrayList<T> list = new ArrayList<T>();

    private static final Lock lock = new ReentrantLock();

    public int size() {
        lock.lock();
        try {
            return list.size();
        } finally {
            lock.unlock();
        }
    }

    public boolean isEmpty() {
        lock.lock();
        try {
            return list.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    public boolean contains(T o) {
        lock.lock();
        try {
            return list.contains(o);
        } finally {
            lock.unlock();
        }
    }

    public boolean add(T t) {
        lock.lock();
        try {
            return list.add(t);
        } finally {
            lock.unlock();
        }
    }

    public boolean remove(T t) {
        lock.lock();
        try {
            return list.remove(t);
        } finally {
            lock.unlock();
        }
    }

    public void clear() {
        lock.lock();
        list.clear();
        lock.unlock();
    }

    public T get(int i) {
        lock.lock();
        try {
            return list.get(i);
        } finally {
            lock.unlock();
        }
    }

    public int indexOf(T t) {
        lock.lock();
        try {
            return list.indexOf(t);
        } finally {
            lock.unlock();
        }
    }
}
