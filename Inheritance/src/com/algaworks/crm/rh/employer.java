package com.algaworks.crm.rh;

import java.util.Objects;

public class employer implements Comparable<employer> {

    private String name;
    private double hourValue;

    employer(){

    }
    employer(String name, double hourValue){
        this.name = name;
        this.hourValue = hourValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        if(hourValue < 0){
            throw new IllegalArgumentException("The hour value must be greater than 0");
        }
        this.hourValue = hourValue;
    }
    protected double calculateSalary(int hoursWorked){
        return hoursWorked * this.hourValue;
    }

    public Payslip getPayslip(int hoursWorked, String monthYear){
        double salaryValue = calculateSalary(hoursWorked);
        return new Payslip(getName(),monthYear,salaryValue);
    }

    @Override
    public String toString() {
        return "employer{" +
                "name='" + name + '\'' +
                ", hourValue=" + hourValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employer that = (employer) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(employer o) {
        return getName().compareTo(o.getName());
    }
}
