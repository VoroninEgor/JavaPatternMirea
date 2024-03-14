package org.example.hw7.Composite;

public class Main {
    public static void main(String[] args) {
        // Создаем файлы
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        FileSystemComponent file3 = new File("File3.txt");

        // Создаем папки
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Добавляем файлы в папки
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);

        // Создаем композицию
        Folder rootFolder = new Folder("Root");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Печатаем всю структуру файловой системы
        rootFolder.print();
    }
}
