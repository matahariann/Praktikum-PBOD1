public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        System.err.println("===========Deposit===========");
        account.deposit(400.0);
        System.err.println("");


        System.err.println("===========Withdraw==========");
        try {
            account.withdraw(200.0);
            account.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
  