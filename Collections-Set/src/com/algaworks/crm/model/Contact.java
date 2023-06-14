package com.algaworks.crm.model;

import java.util.Objects;

public class Contact implements Comparable<Contact> {

    private String name;
    private String email;
    private int age;

    public Contact(String name, String email, int age) {

        Objects.requireNonNull(name);
        Objects.requireNonNull(email);

        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contato = (Contact) o;
        return email.equals(contato.email);
    }

    // HashCode configura a tabela de espalhamento
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }


    @Override
    public int compareTo(Contact o) {
        return getEmail().compareTo(o.email);
    }
}
