package ru.geekbrains;

import java.util.ArrayList;
import java.util.Comparator;

public class Task004 {
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
        int i = 1;
        int size = list1.size();
        while (i < size) {
            System.out.println(i);
            System.out.println(list1.get(i));
            if (name.equals(list1.get(i))) {
                list1.remove(i);
                size--;
            }
            else {
                name = list1.get(i);
                i++;
            }

        }
        System.out.println(list1);
    }
}
