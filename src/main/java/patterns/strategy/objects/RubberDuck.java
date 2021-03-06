package patterns.strategy.objects;

import patterns.strategy.behavior.FlyBehavior;
import patterns.strategy.behavior.QuackBehavior;
import patterns.strategy.behavior.implementations.FlyNoWay;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		//quackBehavior = new Squeak();
		quackBehavior = () -> System.out.println("Squeak");
	}
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
