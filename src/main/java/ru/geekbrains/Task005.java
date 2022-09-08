package ru.geekbrains;

import java.util.ArrayList;

public class Task005 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("fdfsdfdsfdsf");
        arr.add(123);
        arr.add(123656);
        arr.add("qrrtyui");
        arr.add("123");
        arr.add(345);
        arr.add(7896);
        System.out.println(arr);
        int i = 1;
        int size = arr.size();
        while (i < size) {
            boolean b = arr.get(i) instanceof Number;
            if (b) {
                arr.remove(i);
                size--;
            }
            else {
                i++;
            }
        }
//        boolean b1 = arr.get(0) instanceof String;
//        boolean b2 = arr.get(0) instanceof Integer;
        System.out.println(arr);
    }
}
