package patterns.strategy;

import patterns.strategy.behavior.implementations.FlyRocketPowered;
import patterns.strategy.objects.Duck;
import patterns.strategy.objects.MallardDuck;
import patterns.strategy.objects.ModelDuck;

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
