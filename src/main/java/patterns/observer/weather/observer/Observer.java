package patterns.observer.weather.observer;

public interface Observer {
	void update(float temp, float humidity, float pressure);
}
