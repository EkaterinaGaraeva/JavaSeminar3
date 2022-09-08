package ru.geekbrains;

import java.util.ArrayList;
import java.util.Comparator;

public class Task003 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Меркурий");
        list1.add("Меркурий");
        list1.add("Венера");
        list1.add("Земля");
        list1.add("Юпитер");
        list1.add("Земля");
        list1.add("Венера");
        list1.add("Земля");
        list1.add("Юпитер");
        list1.add("Земля");
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
        String name = list1.get(0);
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (name.equals(list1.get(i))) {
                count++;
            }
            else {
                System.out.printf("%s = %d\n", name, count);
                name = list1.get(i);
                count = 1;
            }
        }
        System.out.printf("%s = %d\n", name, count);
    }
}
