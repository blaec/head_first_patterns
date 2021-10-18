package patterns.strategy.behavior.implementations;

import patterns.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
