package com.algaworks.crm.financial.service;

import com.algaworks.crm.financial.model.BonusPerson;

public class ServiceExtraPayment {


    public void paid(BonusPerson person, double percentageGoalAchieved){
        double extraValue = person.calculateExtra(percentageGoalAchieved);

        System.out.printf("DEBUG: Bonus paid in the amount of %.2f", extraValue);
    }

}
