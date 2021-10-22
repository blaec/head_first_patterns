package patterns.factory.abstractFactory.factory;

import patterns.factory.abstractFactory.ingredients.cheese.Cheese;
import patterns.factory.abstractFactory.ingredients.clams.Clams;
import patterns.factory.abstractFactory.ingredients.dough.Dough;
import patterns.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import patterns.factory.abstractFactory.ingredients.souce.Sauce;
import patterns.factory.abstractFactory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}
