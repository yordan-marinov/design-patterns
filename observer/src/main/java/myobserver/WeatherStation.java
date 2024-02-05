package myobserver;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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
        observers.remove(observer);
    }

    @Override
    public void updateAll() {
        observers.forEach(o -> o.update(this.weatherData));
    }

    public void setWeatherData(String temperature, String humidity) {
        this.weatherData = WeatherData.from(temperature, humidity);
        updateAll();
    }
}
