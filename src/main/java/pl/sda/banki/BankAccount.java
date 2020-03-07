package pl.sda.banki;

public class BankAccount {
   private int id;
   private String name;
   private  double balance;
   private int accountNo;


    public BankAccount(int id, String name, double balance, int accountNo) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
