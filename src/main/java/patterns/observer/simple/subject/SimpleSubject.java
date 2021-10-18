package patterns.observer.simple.subject;

import patterns.observer.simple.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {
	private final List<Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}