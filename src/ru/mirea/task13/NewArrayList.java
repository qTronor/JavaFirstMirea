package ru.mirea.task13;

import java.util.ArrayList;

public class NewArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Qwerty");

        ArrayList<String> list2 = new ArrayList<>(list);
        list2.add(0, "abc");

        System.out.println("List 2: " + list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        System.out.println("Insert of list 2  to list 3: " + list3);
        list3.addAll(1, list2);
        System.out.println("Second insert of list 2 to list 3: " + list3);

        list.clear();
        System.out.println("List after clear(): " + list);

        ArrayList<String> copyOflist3 = (ArrayList<String>) list3.clone();
        System.out.println("Copy of third list: " + copyOflist3);

        System.out.println("Is 'Qwerty' in list3: " + copyOflist3.contains("Qwerty"));
        System.out.println("Is 'abc' in list3: " + copyOflist3.contains("abc"));

        System.out.println("Element 0 from list 2: " + list2.get(0));
        System.out.println("Index of 'Qwerty': " + list2.indexOf("Qwerty"));
        System.out.println("Is list 2 empty: " + list2.isEmpty());
        System.out.println("Last index of 'Qwerty' in list 2: " + list2.lastIndexOf("Qwerty"));
        list2.remove(0);
        System.out.println("List 2 without element 0: " + list2);
        list2.remove("Qwerty");
        System.out.println("List 2 without 'Qwerty': " + list2);

        list3.set(2, "QWERTY");
        System.out.println("List 2: " + list3);

        System.out.println("Size of list 3: " + list3.size());

        System.out.println("String array:");
        String[] array = new String[list3.size()];
        list3.toArray(array);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
