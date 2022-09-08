// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task002 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.println(list1);
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
    }
}
