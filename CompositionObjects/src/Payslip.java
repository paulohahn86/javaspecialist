public class Payslip {

    Employee employee;
    double valueTotalNormalHours;
    double valueTotalExtraHours;
    double additionalChild;

    double calculateTotalValue(){
        return valueTotalNormalHours + valueTotalExtraHours + additionalChild;
    }

    void printPayslip(){

        System.out.println(" PAYSLIP - " + employee.name);
        System.out.printf("Normal hours value: R$ %.2f %n", valueTotalNormalHours);
        System.out.printf("Overtime value: R$ %.2f %n", valueTotalExtraHours);
        System.out.printf("Additional for children: R$ %.2f %n", additionalChild);
        System.out.println("-------------------------------");
        System.out.printf("Total salary of R$ %.2f", calculateTotalValue());
    }

}
