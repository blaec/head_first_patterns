package factory.strategy.behavior.implementations;

import factory.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
