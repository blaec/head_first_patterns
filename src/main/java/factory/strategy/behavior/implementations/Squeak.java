package factory.strategy.behavior.implementations;

import factory.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
