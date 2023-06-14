package com.algaworks.crm.financial.application;

import com.algaworks.crm.financial.model.Farm;
import com.algaworks.crm.financial.model.Employer;
import com.algaworks.crm.financial.model.Industry;

import com.algaworks.crm.financial.service.ServiceFinancial;

public class Main {

    public static void main(String[] args) {
        ServiceFinancial sf = new ServiceFinancial();


        Farm farm = new Farm("Fazenda Eucalipto", 5000000,5);
        Industry industry = new Industry("Alimentos da vovo", 900000, true);
        Employer employer = new Employer("Paulo", 5000);

        sf.applyFinancial(industry, 500000);
        sf.applyFinancial(farm, 500000);
        sf.applyFinancial(employer, 25000);


    }
}
