package com.algaworks.challenge.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Employer {

    private final String name;
    private final BigDecimal salary;
    private Status status = Status.ACTIVE;

    public enum Status{
        ACTIVE, INACTIVE;
    }

    public Employer(String nome, BigDecimal salario, Status status) {
        this.name = nome;
        this.salary = salario;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer that = (Employer) o;
        return Objects.equals(name, that.name) && Objects.equals(salary, that.salary) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, status);
    }


    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }
}
