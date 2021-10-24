package ru.mirea.task12;

import java.util.Arrays;

public class SortClass {
    private static final int arraySize = 5;

    public static void sorting(Students[] students){
        int minId;
        Students temp;
        for(int left = 0; left < students.length - 1; left++){
            // Students q = students[left];
             minId = left;
            for(int j = left + 1; j < students.length; j++){
                if(students[j].compareTo(students[minId]) > 0){
                    minId = j;
                }
            }
            temp = students[minId];
            students[minId] = students[left];
            students[left] = temp;
        }
    }

    public static void main(String[] args) {
        Students[] id = new Students[arraySize];

        id[0] = new Students(8, "Mary", "Sue", 66);
        id[1] = new Students(4, "Jack", "Black", 55);
        id[2] = new Students(1, "Jack", "White", 73);
        id[3] = new Students(0, "Mary", "White",67);
        id[4] = new Students(3, "Isaak", "Clarke", 98);

        System.out.println(Arrays.toString(id));
        sorting(id);
        System.out.println(Arrays.toString(id));
    }
}
