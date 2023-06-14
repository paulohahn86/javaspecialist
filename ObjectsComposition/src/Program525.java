public class Program525 {

    public static void main(String[] args) {


        PayRoll payRoll = new PayRoll();

        Employee employee = new Employee();
        employee.name = "Paulo";
        employee.children = 3;

        EmploymentContract employmentContract = new EmploymentContract();
        employmentContract.employee = employee;
        employmentContract.normalHourlyRate = 13.05;
        employmentContract.extraHourlyRate = 18.10;

        Payslip payslip = payRoll.calculateWages(40, 10, employmentContract);
        payslip.printPayslip();





    }
}
