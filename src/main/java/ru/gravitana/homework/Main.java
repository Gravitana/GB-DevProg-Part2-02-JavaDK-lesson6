package ru.gravitana.homework;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int COUNT_DOORS = 3;
        final HashMap<Integer, Boolean> doors = new HashMap<>();

        Random r = new Random();
        final int prizeIndex = r.nextInt(COUNT_DOORS);

        for (int i = 0; i < COUNT_DOORS; i++) {
            if (i == prizeIndex) {
                doors.put(i + 1, true);
            } else {
                doors.put(i + 1, false);
            }
        }

        System.out.println(doors);
    }
}
