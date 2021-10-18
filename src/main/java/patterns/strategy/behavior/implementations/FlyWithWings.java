package patterns.strategy.behavior.implementations;

import patterns.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
