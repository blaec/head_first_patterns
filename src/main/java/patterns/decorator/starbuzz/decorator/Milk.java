package patterns.decorator.starbuzz.decorator;

import patterns.decorator.starbuzz.component.Beverage;
import patterns.decorator.starbuzz.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
