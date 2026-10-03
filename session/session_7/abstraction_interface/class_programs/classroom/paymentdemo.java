
interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(500);
    }
}