package org.example.hw3.synchronizedcollections;

public class SyncMapMain {
    public static void main(String[] args) throws InterruptedException {
        SyncMap<Integer, String> syncMap = new SyncMap<>();

        syncMap.put(5, "Hello");
        syncMap.put(10, "World");
        System.out.println(syncMap.containsKey(5));
        System.out.println(syncMap.get(10));
        System.out.println(syncMap.size());
        System.out.println(syncMap.remove(5));
    }
}
