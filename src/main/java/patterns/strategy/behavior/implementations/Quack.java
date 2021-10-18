package patterns.strategy.behavior.implementations;

import patterns.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
