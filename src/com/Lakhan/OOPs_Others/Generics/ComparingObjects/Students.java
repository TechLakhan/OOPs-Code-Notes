package com.Lakhan.OOPs_Others.Generics.ComparingObjects;

public class Students implements Comparable<Students> {
    int rollNo;
    float marks;

    public Students(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(Students other) {
        int difference = (int) (this.marks - other.marks);

        // here if diff === 0 then, both scored equal marks.
        // if difference is negative then student1 scored less marks than student2
        // else student1 has more marks.
        return difference;
    }
}
