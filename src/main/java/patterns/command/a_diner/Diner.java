package patterns.command.a_diner;

import patterns.command.a_diner.client.Customer;
import patterns.command.a_diner.command.BurgerAndFriesOrder;
import patterns.command.a_diner.receiver.Cook;
import patterns.command.a_diner.invoker.Waitress;

public class Diner {
	public static void main(String[] args) {
		Cook cook = new Cook();
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress);
		customer.createOrder(new BurgerAndFriesOrder(cook));
		customer.hungry();
	}
}