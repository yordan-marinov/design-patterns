package myobserver;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WeatherDisplay implements Observer {

    private String temperature;
    private String humidity;

    private WeatherDisplay(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void update(WeatherData weatherData) {
        setTemperature(weatherData.getTemperature());
        setHumidity(weatherData.getHumidity());
    }

    public WeatherDisplay from(WeatherData weatherData) {
        return new WeatherDisplay(weatherData.getTemperature(), weatherData.getHumidity());
    }
}
