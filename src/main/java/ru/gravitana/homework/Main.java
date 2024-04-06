package ru.gravitana.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {
    private static final int COUNT_DOORS = 1100;
    private static final int COUNT_GAMES = 1000;

//    private static final HashMap<Integer, Boolean> doors = new HashMap<>();
    private static final int[] results = new int[COUNT_GAMES];

    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("Всего игр: " + COUNT_GAMES);
        System.out.println();

        for (int countDoors = 3; countDoors < COUNT_DOORS; countDoors+=500){

            System.out.println("Количество дверей: " + countDoors);

            for (int i = 0; i < COUNT_GAMES; i++) {
                int prizeIndex = r.nextInt(countDoors);
                int userChoice = r.nextInt(countDoors);

                results[i] = userChoice == prizeIndex ? 1 : 0;
            }

            int countWin = Arrays.stream(results).sum();

            System.out.println("Количество выигрышей: " + countWin);
            System.out.println("Количество выигрышей при смене выбора: " + (COUNT_GAMES - countWin));
            System.out.println();
        }
    }

//    private static void printResult(int prizeIndex, int userChoice) {
//        System.out.println("----------------------------------------------------");
//        System.out.println("Приз за дверью № " + (prizeIndex + 1));
//        System.out.println("Игрок выбрал дверь № " + (userChoice + 1));
//        System.out.println("Игрок " + ((userChoice == prizeIndex) ? "выиграл" : "проиграл"));
//        System.out.println("----------------------------------------------------");
//    }

//    private static void putPrize(int prizeIndex) {
//        for (int i = 0; i < COUNT_DOORS; i++) {
//            if (i == prizeIndex) {
//                doors.put(i, true); // приз
//            } else {
//                doors.put(i, false);
//            }
//        }
//    }
}
