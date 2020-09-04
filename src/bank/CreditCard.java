package bank;

public class CreditCard {
    private String cardNumber;
    private double credit;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public CreditCard(String cardNumber, double credit) {
        this.cardNumber = cardNumber;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", credit=" + credit +
                '}';
    }
}
