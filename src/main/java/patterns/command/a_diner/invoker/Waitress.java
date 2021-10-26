package patterns.command.a_diner.invoker;

import patterns.command.a_diner.command.Order;

public class Waitress {
	Order order;
	public Waitress() {}
	public void takeOrder(Order order) {
		this.order = order; 
		order.orderUp();
	}
}