package ru.mirea.task12;

import java.util.Arrays;

public class MergeSort {

    private static final int arraySize = 5;

    private static void mergeSort(Students[] a, int lo, int hi){
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        Students[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i]) < 0) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Students[] id1 = new Students[arraySize];

        id1[0] = new Students(8, "Mary", "Sue", 66);
        id1[1] = new Students(4, "Jack", "Black", 55);
        id1[2] = new Students(1, "Jack", "White", 73);
        id1[3] = new Students(0, "Mary", "White",67);
        id1[4] = new Students(3, "Isaak", "Clarke", 98);

        Students[] id2 = new Students[arraySize];

        id2[0] = new Students(7, "Sasha", "Petrov", 0);
        id2[1] = new Students(2, "Steve", "Rogers", 55);
        id2[2] = new Students(6, "Vincent", "Vega", 73);
        id2[3] = new Students(1, "Jules", "Winnfield",67);
        id2[4] = new Students(4, "Mia", "Travolta", 98);

        Students[] id3 = new Students[arraySize*2];

        for (int i = 0; i < id1.length; i++){
            id3[i] = id1[i];
        }
        for(int i = id1.length; i < id3.length; i++){
            id3[i] = id2[i-id1.length];
        }

        System.out.println(Arrays.toString(id3));
        mergeSort(id3,0, id3.length-1);
        System.out.println(Arrays.toString(id3));
    }
}
