package patterns.command.b_dinerLambda.invoker;

import patterns.command.b_dinerLambda.command.Order;

public class Waitress {
	Order order;
	public Waitress() {}
	public void takeOrder(Order order) {
		this.order = order; 
		order.orderUp();
	}
}