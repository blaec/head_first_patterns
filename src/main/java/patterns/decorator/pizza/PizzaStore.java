package patterns.decorator.pizza;

import patterns.decorator.pizza.component.Pizza;
import patterns.decorator.pizza.component.ThincrustPizza;
import patterns.decorator.pizza.decorator.Cheese;
import patterns.decorator.pizza.decorator.Olives;

public class PizzaStore {
 
	public static void main(String[] args) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.printf("%s $%.2f%n", greekPizza.getDescription(), greekPizza.cost());
	}
}
