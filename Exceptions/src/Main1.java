import com.algaworks.crm.banco.CurrentAccount;

public class Main1 {

    public static void main(String[] args) {

        CurrentAccount cc1 = new CurrentAccount("PauloCC1");
        CurrentAccount cc2 = new CurrentAccount("PauloCC2");

            try {
                cc1.activate();
                cc2.activate();
                cc1.deposit(1000);
                cc1.transfer(cc2, 1500);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        System.out.println();
        System.out.printf("Balance %s is of: %.2f%n",cc1.getName(),cc1.getBalance());
        System.out.printf("Balance %s is of: %.2f%n",cc2.getName(),cc2.getBalance());




    }
}
