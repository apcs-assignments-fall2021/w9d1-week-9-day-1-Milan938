import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What is your preferred name?");
//        String name = scan.nextLine();
//        // Create a bank account with a balance of 0, the account number 101134, and the given name
//        BankAccount account = new BankAccount(0, 101134, name);
        BankAccount account = new BankAccount(10000, 4749, "Silias");
        account.deposit(700);
        System.out.println(account.getBalance());
        System.out.println(account.getPreferredName());
        account.setPreferredName("Rochell");
        System.out.println(account.getPreferredName());
        account.toString();
    }
}
