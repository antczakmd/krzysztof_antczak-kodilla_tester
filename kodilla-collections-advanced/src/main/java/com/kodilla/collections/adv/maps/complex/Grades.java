package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades (double ... grades) {
        this.grades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Grades{" +
                "grades=" + grades +
                '}';
    }

    public double getAverage() {
            double sum = 0.0;
            for (double grade : grades)
                sum += grade;
            return sum / grades.size();
    }
}
