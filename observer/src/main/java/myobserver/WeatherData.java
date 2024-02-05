package myobserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {

    private String temperature;
    private String humidity;

    public static WeatherData from(String temperature, String humidity) {
        return new WeatherData(temperature, humidity);
    }
}
