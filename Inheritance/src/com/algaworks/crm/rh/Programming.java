package com.algaworks.crm.rh;

import java.util.Objects;

public class Programming extends employer {

    private double extraValue;

    Programming(){
    }

    Programming(String name, double hourValue){
         super(name, hourValue);
    }

    public double getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(double extraValue) {
        if(extraValue < 0){
            throw new IllegalArgumentException("Bonus amount must be greater than 0");
        }
        this.extraValue = extraValue;
    }

    protected final double calculateSalary(int hoursWorked){
        return super.calculateSalary(hoursWorked) + this.extraValue;
    }

    @Override
    public String toString() {
        return "Programming{" +
                "extraValue=" + extraValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programming that = (Programming) o;
        return Double.compare(that.extraValue, extraValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), extraValue);
    }
}
