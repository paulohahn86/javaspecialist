package com.algaworks.crm.accountspayable.application;

import com.algaworks.crm.accountspayable.model.*;
import com.algaworks.crm.accountspayable.service.AccountPayableService;

public class Main1 {

    public static void main(String[] args) {

        Beneficiary beneficiario1 = new Beneficiary("Paulo", "059128184124", "992102");
        Beneficiary beneficiario2 = new Beneficiary("Maria", "034290347234", "238422");

        Payslip holerite = new Payslip(beneficiario1, 13.5,40);
        ServiceOrder ordemServico = new ServiceOrder(1000,beneficiario2);

        Pix pix = new Pix();
        Transfer transferencia = new Transfer();

        AccountPayableService servicoContaPagar1 = new AccountPayableService(pix);
        servicoContaPagar1.pagar(holerite);

        AccountPayableService servicoContaPagar2 = new AccountPayableService(transferencia);
        servicoContaPagar2.pagar(ordemServico);



    }
}
