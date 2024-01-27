import java.math.BigInteger;

/**
 * atm
 */
public class atm {

    String name;
    float balance;
    BigInteger acc_num;

    void insert (String nam, float amount, BigInteger acc) {
        name = nam;
        balance = amount;
        acc_num = acc;
    }

    void deposit (float amount) {
        balance = balance + amount;
    }

    void withdraw (float amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
        }
    }

    void checkBalance () {
        System.out.println("Your account balance is: " + balance);
    }

    void accountDetails () {
        System.out.println("Account Name: " + name + ". Account Balance: " + balance + ". Account Number: " + acc_num);
    }
    
}

class Testatm {
    public static void main(String[] args) {
        atm firstatm = new atm();
        firstatm.insert("Samuel", 579, new BigInteger("201839060030"));
        firstatm.accountDetails();
        firstatm.checkBalance();
        firstatm.deposit(1);
        firstatm.checkBalance();
        firstatm.withdraw(580);
        firstatm.checkBalance();
    }
}