package com.algaworks.crm.insurancecompany.application;

import com.algaworks.crm.insurancecompany.model.Truck;
import com.algaworks.crm.insurancecompany.model.privateCar;
import com.algaworks.crm.insurancecompany.model.ResidentialProperty;
import com.algaworks.crm.insurancecompany.service.ServiceInsuranceOffer;

public class Main {

    public static void main(String[] args) {

        ServiceInsuranceOffer sps = new ServiceInsuranceOffer();


        ResidentialProperty property = new ResidentialProperty(2300000,320);
        Truck truck = new Truck("Actros", 780000, 2021, 4);
        privateCar car = new privateCar("HR-V", 150000,2022);


        sps.print(car);
        System.out.println();
        sps.print(truck);
        System.out.println();
        sps.print(property);

    }
}
