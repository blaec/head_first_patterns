package factory.strategy.behavior.implementations;

import factory.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
