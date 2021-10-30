package patterns.templateMethod.b_barista;

import patterns.templateMethod.b_barista.simple.Coffee;
import patterns.templateMethod.b_barista.simple.Tea;
import patterns.templateMethod.b_barista.with_hook.CoffeeWithHook;
import patterns.templateMethod.b_barista.with_hook.TeaWithHook;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
