package org.example.hw3.synchronizedcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SyncMap<K, V> {
    private final Map<K, V> map = new HashMap<>();
    private final Semaphore semaphore = new Semaphore(1);

    public void put(K key, V value) throws InterruptedException {
        semaphore.acquire();
        try {
            map.put(key, value);
        } finally {
            semaphore.release();
        }
    }

    public V get(K key) throws InterruptedException {
        semaphore.acquire();
        try {
            return map.get(key);
        } finally {
            semaphore.release();
        }
    }

    public boolean containsKey(K key) throws InterruptedException {
        semaphore.acquire();
        try {
            return map.containsKey(key);
        } finally {
            semaphore.release();
        }
    }

    public Set<K> keySet() throws InterruptedException {
        semaphore.acquire();
        try {
            return map.keySet();
        } finally {
            semaphore.release();
        }
    }

    public V remove(K key) throws InterruptedException {
        semaphore.acquire();
        try {
            return map.remove(key);
        } finally {
            semaphore.release();
        }
    }

    public int size() throws InterruptedException {
        semaphore.acquire();
        try {
            return map.size();
        } finally {
            semaphore.release();
        }
    }
}
