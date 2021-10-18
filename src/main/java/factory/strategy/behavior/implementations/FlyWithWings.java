package factory.strategy.behavior.implementations;

import factory.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
