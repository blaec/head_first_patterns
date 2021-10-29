package patterns.decorator.starbuzzWithSizes;

import patterns.decorator.starbuzzWithSizes.component.Beverage;
import patterns.decorator.starbuzzWithSizes.component.DarkRoast;
import patterns.decorator.starbuzzWithSizes.component.Espresso;
import patterns.decorator.starbuzzWithSizes.component.HouseBlend;
import patterns.decorator.starbuzzWithSizes.decorator.Mocha;
import patterns.decorator.starbuzzWithSizes.decorator.Soy;
import patterns.decorator.starbuzzWithSizes.decorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf("%s $%.2f%n", beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf("%s $%.2f%n", beverage2.getDescription(), beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf("%s $%.2f%n", beverage3.getDescription(), beverage3.cost());
    }
}
