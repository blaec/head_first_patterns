package patterns.decorator.pizza.decorator;

import patterns.decorator.pizza.component.Pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
