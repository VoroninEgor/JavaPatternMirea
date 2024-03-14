package org.example.hw8.Iterator;
// оторый используется для последовательного доступа к элементам коллекции без раскрытия её внутренней структуры.
public interface MyIterator<T> {
    boolean hasNext();
    T next();
}
