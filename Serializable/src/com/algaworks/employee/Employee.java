package com.algaworks.employee;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee implements Serializable {


    // Version Control of the class serialization
    @Serial
    private static final long serialVersionUID = 5863892090027576601L;

    //add the word "transient" in the declaration of the variable for not serializable or deserializable
    private String name;
    private LocalDate birthday;
    private BigDecimal salary;
    //private transient BigDecimal salary;

    public Employee(String name, LocalDate birthday, BigDecimal salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
