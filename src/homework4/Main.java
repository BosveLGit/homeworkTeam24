package homework4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Simba");
        Cat cat3 = new Cat("Boris");
        Cat cat4 = new Cat("Archie", "black");
        Cat cat5 = new Cat("Kitty", "white");
        Cat cat6 = new Cat("Chip", "braun");
        Cat cat7 = new Cat("Sylvia", "braun", 7);
        Cat cat8 = new Cat("Wendy", "yellow", 2);
        Cat cat9 = new Cat("Tina", "green", 5);
        Cat cat10 = new Cat("Lily", "black", 3);

        System.out.println("Всего котов создано: " + Cat.getAllCatsCount());

        List<Cat> catsList = new ArrayList<>();
        catsList.add(cat1);
        catsList.add(cat2);
        catsList.add(cat3);
        catsList.add(cat4);
        catsList.add(cat5);
        catsList.add(cat6);
        catsList.add(cat7);
        catsList.add(cat8);
        catsList.add(cat9);
        catsList.add(cat10);

        System.out.println("//////////// \nsort by age:");

        Collections.sort(catsList, Cat.AgeComparator);
        for(Cat s : catsList) {
            System.out.println(s);
        }

        System.out.println("//////////// \nsort by name:");

        Collections.sort(catsList, Cat.NameComparator);
        for(Cat s : catsList) {
            System.out.println(s);
        }

    }
}
