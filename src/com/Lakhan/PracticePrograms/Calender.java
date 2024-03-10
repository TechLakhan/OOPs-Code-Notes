package com.Lakhan.PracticePrograms;

import java.util.Arrays;

public class Calender {
    public static void main(String[] args) {
        Year jan = new Year(31, "January");
        Year feb = new Year(29, "February");
        Year mar = new Year(31, "March");
        Year Apr = new Year(30, "April");
        Year may = new Year(31, "May");
        Year june = new Year(30, "June");
        Year july = new Year(31, "July");
        Year aug = new Year(31, "August");
        Year sept = new Year(30, "September");
        Year oct = new Year(31, "October");
        Year nov = new Year(30, "November");
        Year dec = new Year(31, "December");

        Year[] yearArr = new Year[]{jan, feb, mar, Apr, may, june, july, aug, sept, oct, nov, dec};

        System.out.println(Arrays.toString(yearArr));



    }
}
