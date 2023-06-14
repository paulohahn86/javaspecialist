public class PayRoll {

    Payslip calculateWages(int normalHourly, int extraHourly, EmploymentContract employmentContract){

        Payslip payslip = new Payslip();
        payslip.employee = employmentContract.employee;
        payslip.valueTotalNormalHours = normalHourly * employmentContract.normalHourlyRate;
        payslip.valueTotalExtraHours = extraHourly * employmentContract.extraHourlyRate;

        double subtotal = payslip.valueTotalNormalHours + payslip.valueTotalExtraHours;

        if(employmentContract.addChild()){
            payslip.additionalChild = subtotal * 0.10;
        }
        return payslip;
    }
}
