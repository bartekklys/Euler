package designPatterns.structural.decorator;

/**
 * Created by bartek on 06.06.17.
 */
public class TurboCarDecorator extends CarDecorator {

    public TurboCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void drive() {
        super.drive();
        activateTurbo();
    }

    private void activateTurbo() {
        System.out.println("Turbo activated!");
    }
}
