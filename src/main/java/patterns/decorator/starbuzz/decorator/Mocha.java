package patterns.decorator.starbuzz.decorator;

import patterns.decorator.starbuzz.component.Beverage;
import patterns.decorator.starbuzz.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
