package patterns.strategy.behavior.implementations;

import patterns.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
