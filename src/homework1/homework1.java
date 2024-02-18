package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homework1 {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("////////////////////");

        int numbersArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int num : numbersArray) {
            System.out.print(num + " ");
            sum += num;
        }

        double avg = (double)sum / numbersArray.length;

        System.out.println("\nSum = " + sum + ", avg = " + avg);

        System.out.println("////////////////////");

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.addAll(Arrays.asList(10,11,12,13,14,15,16,17,18,19,20));

        for (Integer num : listNumbers) {
            System.out.print(num + " ");
            sum += num;
        }

        avg = (double)sum / numbersArray.length;

        System.out.println("\nSum = " + sum + ", avg = " + avg);

        System.out.println("////////////////////");

        System.out.println("А можем еще поиграться с рандомными числами");

        listNumbers.clear();

        for (int i = 0; i < 10; i++) {
            int randNum = (int) (Math.random()*200 - 100);
            listNumbers.add(randNum);
            System.out.print(randNum + " ");
            sum += randNum;
        }
        avg = (double)sum / numbersArray.length;

        System.out.println("\nSum = " + sum + ", avg = " + avg);

    }

}
