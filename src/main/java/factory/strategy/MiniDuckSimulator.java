package factory.strategy;

import factory.strategy.behavior.FlyBehavior;
import factory.strategy.behavior.QuackBehavior;
import factory.strategy.behavior.implementations.FlyRocketPowered;
import factory.strategy.objects.*;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
