package myobserver;

import lombok.Data;

@Data
public class WeatherLogger implements Observer {

    private String temperature;
    private String humidity;

    @Override
    public void update(WeatherData weatherData) {
        setTemperature(weatherData.getTemperature());
        setHumidity(weatherData.getHumidity());
    }
}
