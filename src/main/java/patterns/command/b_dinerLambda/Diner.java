package patterns.command.b_dinerLambda;

import patterns.command.b_dinerLambda.client.Customer;
import patterns.command.b_dinerLambda.invoker.Waitress;
import patterns.command.b_dinerLambda.receiver.Cook;

public class Diner {
	public static void main(String[] args) {
		Cook cook = new Cook();
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress, cook);
		customer.createOrder();
		customer.hungry();
	}
}