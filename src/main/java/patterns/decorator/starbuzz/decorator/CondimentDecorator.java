package patterns.decorator.starbuzz.decorator;

import patterns.decorator.starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
