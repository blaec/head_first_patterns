package patterns.composite.menu.client;

import patterns.composite.menu.component.MenuComponent;

public class Waitress {
	private final MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
