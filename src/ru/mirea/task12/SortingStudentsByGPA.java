package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return Double.compare(o2.getMarks(), o1.getMarks());
    }
}
