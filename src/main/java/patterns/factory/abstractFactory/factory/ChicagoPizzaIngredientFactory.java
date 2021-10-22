package patterns.factory.abstractFactory.factory;

import patterns.factory.abstractFactory.ingredients.cheese.Cheese;
import patterns.factory.abstractFactory.ingredients.cheese.MozzarellaCheese;
import patterns.factory.abstractFactory.ingredients.clams.Clams;
import patterns.factory.abstractFactory.ingredients.clams.FrozenClams;
import patterns.factory.abstractFactory.ingredients.dough.Dough;
import patterns.factory.abstractFactory.ingredients.dough.ThickCrustDough;
import patterns.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import patterns.factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import patterns.factory.abstractFactory.ingredients.souce.PlumTomatoSauce;
import patterns.factory.abstractFactory.ingredients.souce.Sauce;
import patterns.factory.abstractFactory.ingredients.veggies.BlackOlives;
import patterns.factory.abstractFactory.ingredients.veggies.Eggplant;
import patterns.factory.abstractFactory.ingredients.veggies.Spinach;
import patterns.factory.abstractFactory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]
                {
                    new BlackOlives(),
                    new Spinach(),
                    new Eggplant()
                };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
