package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private double temperature;

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void adjustTemperature(double adjustment) {
        temperature += adjustment;
        notifyObservers();
    }
}
