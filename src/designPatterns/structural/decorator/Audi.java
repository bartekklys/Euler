package designPatterns.structural.decorator;

/**
 * Created by bartek on 06.06.17.
 */
public class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("Audi is driving!");
    }
}
