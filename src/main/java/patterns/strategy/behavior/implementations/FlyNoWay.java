package patterns.strategy.behavior.implementations;

import patterns.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
