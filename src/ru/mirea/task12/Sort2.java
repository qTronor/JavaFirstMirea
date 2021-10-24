package ru.mirea.task12;

import java.util.Arrays;

public class Sort2 {
    private static final int arraySize = 5;
    public static void main(String[] args) {
        Students[] id = new Students[arraySize];

        id[0] = new Students(8, "Mary", "Sue", 66);
        id[1] = new Students(4, "Jack", "Black", 55);
        id[2] = new Students(1, "Jack", "White", 73);
        id[3] = new Students(0, "Mary", "White",67);
        id[4] = new Students(3, "Isaak", "Clarke", 98);

        System.out.println(Arrays.toString(id));
        Arrays.sort(id, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(id));
    }
}
