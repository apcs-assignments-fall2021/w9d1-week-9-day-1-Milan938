public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;

    public BankAccount(int money, int accnum, String name) {
        balance = money;
        accountNumber = accnum;
        preferredName = name;
    }

    public void withdraw(int a) {
        if(balance - a >= 0) {
            balance = balance - a;
        }
        else{
            System.out.println("Nice try broke boy, no can do");
        }
    }

    public void deposit(int a) {
        balance = balance + a;
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getPreferredName(){
        return preferredName;
    }

    public void setPreferredName(String name){
        preferredName = name;
    }

    public String toString(){
        return "Hello " + preferredName + " your balance is " + balance + " , congrats!";
    }
}