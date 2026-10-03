
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();

        Animal b = new Cat();
        b.makeSound();
    }
}