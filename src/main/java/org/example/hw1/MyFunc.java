package org.example.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyFunc implements Function<List<Student>, Map<String,List<Student>>>{

    @Override
    public Map<String, List<Student>> apply(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::group));
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("A"));
        studentList.add(new Student("B"));
        studentList.add(new Student("B"));
        studentList.add(new Student("C"));\
        studentList.add(new Student("A"));

        MyFunc myFunc = new MyFunc();

        Map<String, List<Student>> apply = myFunc.apply(studentList);
        System.out.println(apply);
    }
}
