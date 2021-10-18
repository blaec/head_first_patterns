package patterns.strategy.objects;

import patterns.strategy.behavior.implementations.FlyNoWay;
import patterns.strategy.behavior.implementations.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
