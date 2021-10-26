package patterns.command.a_diner.client;

import patterns.command.a_diner.command.Order;
import patterns.command.a_diner.invoker.Waitress;

public class Customer {
	Waitress waitress;
	Order order;
	public Customer(Waitress waitress) {
		this.waitress = waitress;
	}
	public void createOrder(Order order) {
		this.order = order;
	}
	public void hungry() {
		waitress.takeOrder(order);
	}
}