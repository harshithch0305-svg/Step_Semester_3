
class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void showPayment() {
        System.out.println("Payment Amount: Rs. " + amount);
    }
}

class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    void calculateFee() {
        double fee = amount * 0.02;
        System.out.println("Payment Fee: Rs. " + fee);
        System.out.println("Total Amount: Rs. " + (amount + fee));
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        CardPayment payment = new CardPayment(1000);

        payment.showPayment();
        payment.calculateFee();
    }
}