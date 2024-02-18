package homework3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("cat1", "blue");
        Cat cat2 = new Cat("cat2", "green");
        Cat cat3 = new Cat("cat3", "black");
        Cat cat4 = new Cat("cat4", "blue");
        Cat cat5 = new Cat("cat5", "white");
        Cat cat6 = new Cat("cat6", "braun");
        Cat cat7 = new Cat("cat7", "blue");
        Cat cat8 = new Cat("cat8", "yellow");
        Cat cat9 = new Cat("cat9", "green");
        Cat cat10 = new Cat("cat10", "black");

        Map<String, Cat> cats = new HashMap<>();

        cats.put(cat1.getName(), cat1);
        cats.put(cat2.getName(), cat2);
        cats.put(cat3.getName(), cat3);
        cats.put(cat4.getName(), cat4);
        cats.put(cat5.getName(), cat5);
        cats.put(cat6.getName(), cat6);
        cats.put(cat7.getName(), cat7);
        cats.put(cat8.getName(), cat8);
        cats.put(cat9.getName(), cat9);
        cats.put(cat10.getName(), cat10);

        System.out.println(cats.keySet());

        for (Map.Entry<String, Cat> entry : cats.entrySet()) {
            String nameCat = entry.getKey();
            String ColorCat = entry.getValue().getColor();
            System.out.println(nameCat + ": " + ColorCat);
        }

    }


}
