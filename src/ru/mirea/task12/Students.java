package ru.mirea.task12;

public class Students implements Comparable<Students> {
    private int studentID;
    private String name;
    private String surname;
    private int marks;
    public Students(int studentID, String name, String surname, int marks){
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "\n"+studentID + " - " + name + " "+ surname;
    }

    @Override
    public int compareTo(Students students) {
        return Integer.compare(this.studentID, students.studentID);
    }

    public int getMarks() {
        return marks;
    }
}
