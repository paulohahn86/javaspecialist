package com.algaworks.crm.challenge.service;

import com.algaworks.crm.challenge.model.TravelPackage;

import java.util.Comparator;

public class SortByDescComparator implements Comparator<TravelPackage> {
    @Override
    public int compare(TravelPackage o1, TravelPackage o2) {
        return Double.compare(o1.getClientPrice(),o2.getClientPrice());
    }
}
