package patterns.factory.abstractFactory.products;

import patterns.factory.abstractFactory.*;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
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
