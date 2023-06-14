public class Employee {

    String name;
    int children;

    boolean isChild(){
        if(children >= 1){
            return true;
        }
        return false;
    }

}
