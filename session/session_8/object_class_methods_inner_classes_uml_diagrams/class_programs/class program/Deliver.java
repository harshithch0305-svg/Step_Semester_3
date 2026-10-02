
class Delivery {
    double distance;

    Delivery(double distance) {
        this.distance = distance;
    }

    double calculateFee() {
        return distance * 10;
    }
}

class ExpressDelivery extends Delivery {
    ExpressDelivery(double distance) {
        super(distance);
    }

    double calculateFee() {
        return (distance * 10) + 50;
    }
}

public class DeliverySystem {
    public static void main(String[] args) {
        Delivery normal = new Delivery(5);
        ExpressDelivery express = new ExpressDelivery(5);

        System.out.println("Normal Delivery Fee: Rs. "
                + normal.calculateFee());

        System.out.println("Express Delivery Fee: Rs. "
                + express.calculateFee());
    }
}