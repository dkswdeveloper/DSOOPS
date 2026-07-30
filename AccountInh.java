class Account {
    private static int nextAcno = 1101;
    private int acno;
    private double balance;
    // Getter and Setter methods
    public int getAcno() {        return acno;    }
    public void setAcno(int acno) {        this.acno = acno;    }
    public double getBalance() {        return balance;    }
    public void setBalance(double balance) {        this.balance = balance;    }
    public Account() {
        this.acno = nextAcno;
        nextAcno++;
        this.balance = 0;
        System.out.println("Account constructor called");
    }
    public void deposit(double amt) {
        System.out.println(amt + " deposited to ac no " + acno);
        balance = balance + amt;
    }
    public void withdraw(double amt) {
        if (this.balance < amt) {
            System.out.println("Not enough balance");
            return;
        }
        System.out.println(amt + " withdrawn from ac no " + acno);
        balance = balance - amt;
    }
    public void show() {
        System.out.println("Ac no  " + acno + " with balance " + balance);
    }
}
class SavingAc extends Account {
    private String debitCard;
    public SavingAc(String debitCard) {
        super(); // default constructor automatically called
        // super must be 1st stmt in subclass constructor
        this.debitCard = debitCard;
        System.out.println("SavingAccount constructor called");
    }

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }

    public void show() {
        System.out.println("Saving Ac with acno " + getAcno() + "  balance "
                + getBalance() + " debit Card " + debitCard);
    }
}

public class AccountInh {
    public static void main(String[] args) {
        Account account1 = new Account();
        SavingAc savingAc1 = new SavingAc("656587872121");

        account1.show();
        account1.deposit(10000);
        account1.show();
        account1.withdraw(20000);
        account1.show();
        account1.withdraw(2000);
        account1.show();
        savingAc1.getBalance();

    }
}
