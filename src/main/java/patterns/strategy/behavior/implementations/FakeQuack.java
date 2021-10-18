package patterns.strategy.behavior.implementations;

import patterns.strategy.behavior.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
