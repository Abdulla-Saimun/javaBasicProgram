package Encapsulation;

class Account {
    private long acc_no;
    private float amount;
    private String name, email;

    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public float getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public void setAcc_no(long acc_no) {
       this.acc_no = acc_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_no(3424242335235L);
        acc.setAmount(4545245);
        acc.setName("Jashim");
        acc.setEmail("jashim@gmail.com");

        System.out.println(acc.getAcc_no()+", "+ acc.getAmount()+", "+acc.getName());
    }
}