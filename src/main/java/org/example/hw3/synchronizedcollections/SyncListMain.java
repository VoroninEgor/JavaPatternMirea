package org.example.hw3.synchronizedcollections;

public class SyncListMain {
    public static void main(String[] args) {
        SyncList<Integer> syncList = new SyncList<>();
        System.out.println(syncList.add(5));
        System.out.println(syncList.contains(5));
        System.out.println(syncList.get(0));
        System.out.println(syncList.add(10));
        System.out.println(syncList.indexOf(10));
    }
}
