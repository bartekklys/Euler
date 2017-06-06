package designPatterns.structural.decorator;

/**
 * Decorator pattern allows a user to add new functionality
 * to an existing object without altering its structure.
 * This type of design pattern comes under structural pattern
 * as this pattern acts as a wrapper to existing class.
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Car ferrari = new Ferrari();
        ferrari.drive();

        Car audi = new Audi();
        audi.drive();

        Car turboFerrari = new TurboCarDecorator(new Ferrari());
        turboFerrari.drive();
    }
}
