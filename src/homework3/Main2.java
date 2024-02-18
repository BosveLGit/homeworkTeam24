package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listStrings = new ArrayList<>();

        System.out.println("Введите значения:");

        while (true) {

            String currentValue = scanner.nextLine();

            if(currentValue.toLowerCase().equals("end")) {
                break;
            } else {
                listStrings.add(currentValue);
            }
        }

        System.out.println("Показываю список введенных значений:");

        for(String str : listStrings) {
            System.out.println(str);
        }


    }
}
