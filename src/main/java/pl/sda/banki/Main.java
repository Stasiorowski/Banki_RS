
package pl.sda.banki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // write your code here
        User user1 = new User("Jan", "Kowalski", 44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobroń", 33);
        User user4 = new User("Ola", "Lewandowska", 33);

        BankAccount bank1 = new BankAccount(1, "BankDlaBogatych", 55555, 6555);
        BankAccount bank2 = new BankAccount(2, "BankNowoczesny", 4444, 6532455);
        BankAccount bank3 = new BankAccount(3, "Bank", 3333, 234234);
        BankAccount bank4 = new BankAccount(4, "BigBank", 2222.44, 2342);


        user1.setBankAccount(bank1);
        user2.setBankAccount(bank2);
        user3.setBankAccount(bank3);
        user4.setBankAccount(bank4);


        System.out.println(user1.getBankAccount().getBalance());
        System.out.println(user2.getBankAccount().getBalance());
        System.out.println(user3.getBankAccount().getBalance());
        System.out.println(user4.getBankAccount().getBalance());

        ObjectMapper objectMapper = new ObjectMapper();

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        try {
            objectMapper.writeValue(new File("Zestawienie.json"), userList);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            User[] users = objectMapper.readValue(new File("Zestawienie.json"), User[].class);
//            for (User stu : users) {
//                System.out.print(stu.getName() + "  " + stu.getLastname() + " Wiek: " + stu.getAge() + "  Bank Account No: " + stu.getBankAccount());
//                System.out.println(" ");
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }


    }
}