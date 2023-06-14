public class UtilNumber {

    static int highestNumber(int a, int b){
        return (a > b) ? a : b;
    }

    static int highestNumber(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > c){
            return b;
        }else{
            return c;
        }
    }

    static double highestNumber(double a, double b){
        return (a > b) ? a : b;
    }

    static double highestNumber(double a, double b, double c){
        if(a > b && a > c){
            return a;
        }else if(b > c){
            return b;
        }else{
            return c;
        }
    }

}
