package patterns.observer.simple.subject;

import patterns.observer.simple.observer.Observer;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
