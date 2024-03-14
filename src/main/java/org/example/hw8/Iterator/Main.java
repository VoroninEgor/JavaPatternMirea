package org.example.hw8.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("Item 1");
        collection.add("Item 2");
        collection.add("Item 3");

        // Создание и использование итератора
        MyIterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
