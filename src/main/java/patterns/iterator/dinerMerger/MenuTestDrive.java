package patterns.iterator.dinerMerger;

import patterns.iterator.dinerMerger.menu.DinerMenu;
import patterns.iterator.dinerMerger.menu.Menu;
import patterns.iterator.dinerMerger.menu.PancakeHouseMenu;

import java.util.Arrays;
import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // With iterators
        waitress.printMenu();

        printMenus();
    }

    /*
     * Without the Waitress, we need the code below...
     */
    public static void printMenus() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        // print as Iterable
        printMenu(breakfastItems);
        printMenu(Arrays.asList(lunchItems));

        // print with forEach
        System.out.println("=== forEach ===");
        breakfastItems.forEach(System.out::println);
        Arrays.asList(lunchItems).forEach(System.out::println);
        System.out.println("=== forEach ===");

        // Using enhanced for loop
        System.out.println("USING ENHANCED FOR");
        for (MenuItem menuItem : breakfastItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        for (MenuItem menuItem : lunchItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

        // Exposing implementation
        System.out.println("USING FOR LOOPS");
		for (MenuItem breakfastItem : breakfastItems) {
			System.out.print(breakfastItem.getName());
			System.out.println("\t\t" + breakfastItem.getPrice());
			System.out.println("\t" + breakfastItem.getDescription());
		}

		for (MenuItem menuItem : lunchItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
    }

    public static void printMenu(Iterable<MenuItem> a) {
        for (MenuItem menuItem : a) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}
