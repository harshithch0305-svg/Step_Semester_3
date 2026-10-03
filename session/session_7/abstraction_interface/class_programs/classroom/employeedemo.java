
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println(name + "'s salary is Rs. 50000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul");
        m.calculateSalary();
    }
}