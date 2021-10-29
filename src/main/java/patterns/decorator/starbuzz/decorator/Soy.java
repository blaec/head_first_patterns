package patterns.decorator.starbuzz.decorator;

import patterns.decorator.starbuzz.component.Beverage;
import patterns.decorator.starbuzz.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
}
