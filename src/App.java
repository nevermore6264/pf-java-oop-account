import java.util.Date;

public class App {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        account.setAnnualInterestRate(4.5);

        account.setDateCreated(new Date());

        account.withDraw(2500);

        account.depositMoney(3000);

        double balance = account.getBalance();
        System.out.println("Balance is: " + balance);
        double monthlyInterest = account.getMonthlyInterest();
        System.out.println("Monthly Interest is: " + monthlyInterest);
        String dateCreated = account.getDateCreated().toString();
        System.out.println("Date Created is: " + dateCreated);
    }
}
