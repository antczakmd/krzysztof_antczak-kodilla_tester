package com.kodilla.abstracts.homework.secondpart;

import java.sql.SQLOutput;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities(){
        return responsibilities;

    }

    public abstract void showJob();


    public abstract void yourName();
    public abstract void yourAge();


}