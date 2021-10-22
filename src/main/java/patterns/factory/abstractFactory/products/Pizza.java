package patterns.factory.abstractFactory.products;

import patterns.factory.abstractFactory.ingredients.cheese.Cheese;
import patterns.factory.abstractFactory.ingredients.clams.Clams;
import patterns.factory.abstractFactory.ingredients.dough.Dough;
import patterns.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import patterns.factory.abstractFactory.ingredients.souce.Sauce;
import patterns.factory.abstractFactory.ingredients.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----").append("\n");
        if (dough != null) {
            result.append(dough).append("\n");
        }
        if (sauce != null) {
            result.append(sauce).append("\n");
        }
        if (cheese != null) {
            result.append(cheese).append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam).append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni).append("\n");
        }
        return result.toString();
    }
}
