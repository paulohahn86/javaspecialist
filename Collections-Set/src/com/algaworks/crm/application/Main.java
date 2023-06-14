package com.algaworks.crm.application;

import com.algaworks.crm.model.Contact;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // HashSet does not keep the order of the elements in the set and does not accept duplicate data.
        //LinkedHashSet keeps the insertion order of the elements in the set
        //TreeSet keeps the natural order by comparable or comparator interface (with criteria)
        Set<Contact> contacts = new HashSet<>();
       contacts.add(new Contact("Maria","maria@alga", 40));
       contacts.add(new Contact("Ana","ana@alga", 30));
       contacts.add(new Contact("José","jose@alga", 25));
       contacts.add(new Contact("Rosa","rosa@alga", 50));
       contacts.add(new Contact("João","joao@alga", 70));


        for (Contact contact: contacts) {
            System.out.println(contact);
        }



    }
}
