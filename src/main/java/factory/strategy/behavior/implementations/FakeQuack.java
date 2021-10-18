package factory.strategy.behavior.implementations;

import factory.strategy.behavior.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
