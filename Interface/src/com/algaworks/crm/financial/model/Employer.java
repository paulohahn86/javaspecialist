package com.algaworks.crm.financial.model;

public class Employer implements FinancialClient, BonusPerson {

    public static final int AMOUNT_WAGES_CREDIT_LIMIT = 5;
    private String name;
    private double MonthSalary;

    public Employer(String name, double monthSalary) {
        this.name = name;
        this.MonthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthSalary() {
        return MonthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.MonthSalary = monthSalary;
    }

    public double calculateApprovedLimit() {
        return getMonthSalary() * AMOUNT_WAGES_CREDIT_LIMIT;
    }

    @Override
    public double calculateExtra(double percentageGoalAchieved) {
        return getMonthSalary() * percentageGoalAchieved / 100;
    }
}
