package myobserver;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Data
public class WeatherStation implements MyObservable {

    private WeatherData weatherData;
    private List<Observer> observers;



    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
//        isSubscribed(observer);
        observers.remove(observer);
    }

    @Override
    public void updateAll() {
        observers.forEach(o -> o.update(this.weatherData));
    }

    public void setWeatherData(String temperature, String humidity) {
        this.weatherData = WeatherData.from(temperature, humidity);
        updateAll();  // This can be use when we want to have push notification
    }


    private void isSubscribed(Observer observer) {
        if (!observers.contains(observer)) {
            throw new NoSuchElementException(String.format("The observer %s is not subscribed", observer));
        }
    }
}
