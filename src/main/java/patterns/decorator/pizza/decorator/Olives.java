package patterns.decorator.pizza.decorator;

import patterns.decorator.pizza.component.Pizza;

public class Olives extends ToppingDecorator {
	
 
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}

	@Override
	public double cost() {
		return pizza.cost() + .30; 
	}
}
