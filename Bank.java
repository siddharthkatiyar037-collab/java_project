import java.util.HashMap;

public class Bank {
    HashMap<String, Account> accounts = new HashMap<>();

    void createAccount(String number, String name, double initial) {
        if (accounts.containsKey(number)) {
            System.out.println("Account already exists!");
            return;
        }
        accounts.put(number, new Account(number, name, initial));
        System.out.println("Account created successfully for " + name);
    }

    Account find(String number) {
        Account acc = accounts.get(number);
        if (acc == null) System.out.println("Account not found!");
        return acc;
    }
}