package org.example.hw2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HumanService {

    public List<Human> generateHumanList() {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("Danil", "Pupkin"
                , LocalDate.of(2004, 5, 2), 70));
        humanList.add(new Human("Egor", "Ivanov"
                , LocalDate.of(2005, 2, 6), 80));
        humanList.add(new Human("Alyeana", "Katelnikova"
                , LocalDate.of(1950, 8, 9), 50));
        humanList.add(new Human("Kirill", "Petrov"
                , LocalDate.of(1987, 10, 11), 55));
        humanList.add(new Human("Arsen", "Vasilkin"
                , LocalDate.of(1949, 7, 20), 40));
        return humanList;
    }

    public List<Human> sortByBirthDate(List<Human> humanList) {
        return humanList.stream()
                .sorted(Comparator.comparing(Human::getBirthDate))
                .collect(Collectors.toList());
    }

    public List<Human> filterByAgeLessThan50(List<Human> humanList) {
        return humanList.stream()
                .filter(h -> h.getAge() < 50)
                .collect(Collectors.toList());
    }

    public List<Human> sortByWeight(List<Human> humanList) {
        return humanList.stream()
                .sorted(Comparator.comparing(Human::getWeight))
                .collect(Collectors.toList());
    }

    public String allNamesOnOneLine(List<Human> humanList) {
        return humanList.stream()
                .map(Human::getFirstName)
                .collect(Collectors.joining(" "));
    }
}
