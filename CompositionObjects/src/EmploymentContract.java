public class EmploymentContract {

    Employee employee;
    double normalHourlyRate;
    double extraHourlyRate;

    boolean addChild(){
        return employee.isChild();
    }

}
