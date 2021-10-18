package patterns.observer.simple.observer;

import patterns.observer.simple.subject.Subject;

public class SimpleObserver implements Observer {
	private int value;

	public SimpleObserver(Subject simpleSubject) {
		simpleSubject.registerObserver(this);
	}

	@Override
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}
}
