package patterns.observer.weather.subject;

import patterns.observer.weather.observer.Observer;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
