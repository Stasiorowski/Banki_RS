package pl.sda.banki;

public class BankAccount {
   private int id;
   private String name;
   private  double balance;



    public BankAccount(int id, String name) {
        this.id = id;
        this.name = name;
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
