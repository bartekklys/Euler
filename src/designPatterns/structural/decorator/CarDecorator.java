package designPatterns.structural.decorator;

/**
 * Created by bartek on 06.06.17.
 */
public abstract class CarDecorator implements Car {

    Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    public void drive() {
        decoratedCar.drive();
    }
}
