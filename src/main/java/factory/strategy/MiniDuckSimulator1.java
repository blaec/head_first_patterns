package factory.strategy;

import factory.strategy.behavior.implementations.FlyRocketPowered;
import factory.strategy.objects.Duck;
import factory.strategy.objects.MallardDuck;
import factory.strategy.objects.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
