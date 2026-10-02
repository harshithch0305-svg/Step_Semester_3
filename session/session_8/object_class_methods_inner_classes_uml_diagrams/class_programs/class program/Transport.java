
class Transport {
    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    double calculateFare() {
        return distance * 5;
    }
}

class Bus extends Transport {
    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 8;
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Transport transport = new Transport(10);
        Bus bus = new Bus(10);

        System.out.println("Normal Transport Fare: Rs. "
                + transport.calculateFare());

        System.out.println("Bus Fare: Rs. "
                + bus.calculateFare());
    }
}