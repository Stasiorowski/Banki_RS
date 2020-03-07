
package pl.sda.banki;

public class Main {


    public static void main(String[] args) {
        // write your code here
        User user1 = new User ("Jan", "Kowalski", 44);
        User user2 = new User ("Marcin", "Nowak", 66);
        User user3 = new User ("Katarzyna", "Dobroń", 33);
        User user4 = new User ("Ola", "Lewandowska", 33);

        BankAccount bank1 = new BankAccount (1, "BankDlaBogatych", 55555, 6555);
        BankAccount bank2 = new BankAccount (2, "BankNowoczesny", 4444, 6532455);
        BankAccount bank3 = new BankAccount (3, "Bank", 3333, 234234);
        BankAccount bank4 = new BankAccount (4, "BigBank", 2222, 2342);


        user1.setBankAccount (bank1);
        user2.setBankAccount (bank2);
        user3.setBankAccount (bank3);
        user4.setBankAccount (bank4);

        System.out.println (user1.getBankAccount ().getBalance () );
        System.out.println (user2.getBankAccount ().getBalance () );
        System.out.println (user3.getBankAccount ().getBalance () );
        System.out.println (user4.getBankAccount ().getBalance () );

    }
}
