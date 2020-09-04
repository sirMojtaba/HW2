package bank;

public class Customer {
    private String name;
    Account account;
    CreditCard creditCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public double calCustomerBalance(){
        return account.getBalance() + creditCard.getCredit();
    }

    public Customer(String name, Account account, CreditCard creditCard) {
        this.name = name;
        this.account = account;
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", creditCard=" + creditCard +
                '}';
    }
}
