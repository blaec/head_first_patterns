package patterns.factory.abstractFactory.factory;

import patterns.factory.abstractFactory.ingredients.cheese.Cheese;
import patterns.factory.abstractFactory.ingredients.cheese.ReggianoCheese;
import patterns.factory.abstractFactory.ingredients.clams.Clams;
import patterns.factory.abstractFactory.ingredients.clams.FreshClams;
import patterns.factory.abstractFactory.ingredients.dough.Dough;
import patterns.factory.abstractFactory.ingredients.dough.ThinCrustDough;
import patterns.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import patterns.factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import patterns.factory.abstractFactory.ingredients.souce.MarinaraSauce;
import patterns.factory.abstractFactory.ingredients.souce.Sauce;
import patterns.factory.abstractFactory.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]
                {
                    new Garlic(),
                    new Onion(),
                    new Mushroom(),
                    new RedPepper()
                };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
