package myobserver;

public class AppMain {

    public static void main(String[] args) {

        var temperature = "24";
        var humidity = "76%";

        final WeatherStation myWeatherStation = new WeatherStation();
        final WeatherDisplay weatherDisplay = new WeatherDisplay();
        final WeatherLogger weatherLogger = new WeatherLogger();

        System.out.println(weatherDisplay);
        System.out.println(weatherLogger);

        myWeatherStation.add(weatherDisplay);
        myWeatherStation.add(weatherLogger);

        myWeatherStation.setWeatherData(temperature, humidity);

        System.out.println(weatherDisplay);
        System.out.println(weatherLogger);

        myWeatherStation.remove(weatherLogger);

        myWeatherStation.setWeatherData("12", "87");

        System.out.println(weatherDisplay);
//        System.out.println(weatherLogger);
    }
}
