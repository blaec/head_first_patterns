package patterns.command.a_diner.command;

import patterns.command.a_diner.receiver.Cook;

public class BurgerAndFriesOrder implements Order {
	Cook cook;

	public BurgerAndFriesOrder(Cook cook) {
		this.cook = cook;
	}

	@Override
	public void orderUp() {
		cook.makeBurger();
		cook.makeFries();
	}
}
