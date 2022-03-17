public class Account<privete> {

    private String name;
    private String surname;
    private int balance;
    private int Id;

    public void setName(String name) {
        this.name = name;
    }

    public Account(String name, String surname, int balance, int Id) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.Id = Id;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int money) {
        this.balance = balance - money;
    }

    public int setBalance() {
        return balance;
    }

    public void setMoney(int money) {
        this.balance = balance + money;
    }
}