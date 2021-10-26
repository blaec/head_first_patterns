package patterns.command.b_dinerLambda.client;

import patterns.command.b_dinerLambda.command.Order;
import patterns.command.b_dinerLambda.invoker.Waitress;
import patterns.command.b_dinerLambda.receiver.Cook;

public class Customer {
    Waitress waitress;
    Cook cook;
    Order order;

    public Customer(Waitress waitress, Cook cook) {
        this.waitress = waitress;
        this.cook = cook;
    }

    public void createOrder() {
        order = () -> {
            cook.makeBurger();
            cook.makeFries();
        };
    }

    public void hungry() {
        waitress.takeOrder(order);
    }
}