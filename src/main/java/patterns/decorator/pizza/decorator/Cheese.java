package patterns.decorator.pizza.decorator;

import patterns.decorator.pizza.component.Pizza;

public class Cheese extends ToppingDecorator {
	
 
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}

	@Override
	public double cost() {
		return pizza.cost(); // cheese is free
	}
}
