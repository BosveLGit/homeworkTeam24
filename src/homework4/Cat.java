package homework4;

import java.util.Comparator;

public class Cat {

    private String name;
    private String color = "grey";
    private int age = 0;
    private static int catCount;

    public Cat(String name) {
        this.name = name;
        catCount += 1;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        catCount += 1;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        catCount += 1;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getAllCatsCount() {
        return catCount;
    }

    public static Comparator<Cat> AgeComparator = new Comparator<Cat>() {

        @Override
        public int compare(Cat e1, Cat e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    public static Comparator<Cat> NameComparator = new Comparator<Cat>() {

        @Override
        public int compare(Cat e1, Cat e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

}
