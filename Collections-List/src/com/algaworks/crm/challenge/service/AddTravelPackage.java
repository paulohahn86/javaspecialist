package com.algaworks.crm.challenge.service;

import com.algaworks.crm.challenge.exception.ContainsTravelPackageExpection;
import com.algaworks.crm.challenge.model.TravelPackage;
import com.algaworks.crm.challenge.exception.WithoutPackageException;

import java.util.*;

public class AddTravelPackage {

    private List<TravelPackage> travelPackages = new ArrayList<>();

    public void add(String description, double dailyPrice) {
        TravelPackage travelPackage = new TravelPackage(description,dailyPrice);

        if(travelPackages.contains(travelPackage)){
            throw new ContainsTravelPackageExpection("Travel package already registered!");
        }
        travelPackages.add(travelPackage);
    }

    public List<TravelPackage> findAll() {
        return travelPackages;
    }

    public void sort() {
        Collections.sort(travelPackages);
    }

    public void sortByPrice() {
        travelPackages.sort(new SortByDescComparator());
    }

    public void deleteByDescription(String descricao) {
        Iterator<TravelPackage> iterator = travelPackages.iterator();
        Boolean removed = false;
        while(iterator.hasNext()){
            TravelPackage travelPackage = iterator.next();
            if(travelPackage.getDescription().equals(descricao)){
                iterator.remove();
                removed = true;
            }
        }

        if(!removed){
            throw new WithoutPackageException("No packages were removed");
        }
    }

    public TravelPackage searchByDescription(String description) {
        for(TravelPackage travelPackage : travelPackages){
            if(travelPackage.getDescription().equals(description)){
                return travelPackage;
            }
        }
        throw new WithoutPackageException("Package not found!");
    }

}
