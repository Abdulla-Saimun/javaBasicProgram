package test.manage;

public class Account {
    int acc_no;
    String name;
    float amount;
    public Account(int acc_no, String name, float amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }
    void deposit(float amt) {
        amount = amount+amt;
        System.out.println(amount);
    }

    void withdraw(float amt) {
        if(amount > amt) {
            amount = amount - amt;
            System.out.println(amt+" withdrawn");
        }
        else {
            System.out.println("Insufficent balance");
        }
    }

    void checkBalance() {
        System.out.println("balance is "+amount);
    }

    void displayInformation() {
        System.out.println("account: "+acc_no+", name: "+name+", amount "+amount );
    }

    public static void main(String[] args) {
        Account a1 = new Account(434, "salman", 1200.4f);
        a1.checkBalance();
        a1.displayInformation();
        a1.deposit(2342);
        a1.withdraw(342);
        a1.checkBalance();

    }
}
