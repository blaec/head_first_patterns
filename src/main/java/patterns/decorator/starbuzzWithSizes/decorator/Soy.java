package patterns.decorator.starbuzzWithSizes.decorator;

import patterns.decorator.starbuzzWithSizes.component.Beverage;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
		double cost = beverage.cost();
		switch (beverage.getSize()) {
			case TALL:
				cost += .10;
				break;
			case GRANDE:
				cost += .15;
				break;
			case VENTI:
				cost += .20;
				break;
			default:
				throw new NotImplementedException();
		}
		return cost;
	}
}
