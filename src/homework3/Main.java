package homework3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Cat> cats = new HashMap<>();

        cats.put("cat1", new Cat("cat1", "blue"));
        cats.put("cat2", new Cat("cat2", "green"));
        cats.put("cat3", new Cat("cat3", "black"));
        cats.put("cat4", new Cat("cat4", "blue"));
        cats.put("cat5", new Cat("cat5", "white"));
        cats.put("cat6", new Cat("cat6", "braun"));
        cats.put("cat7", new Cat("cat7", "blue"));
        cats.put("cat8", new Cat("cat8", "yellow"));
        cats.put("cat9", new Cat("cat9", "green"));
        cats.put("cat10", new Cat("cat10", "black"));

        System.out.println(cats.keySet());

        for (Map.Entry<String, Cat> entry : cats.entrySet()) {
            String nameCat = entry.getKey();
            String ColorCat = entry.getValue().getColor();
            System.out.println(nameCat + ": " + ColorCat);
        }



    }


}
