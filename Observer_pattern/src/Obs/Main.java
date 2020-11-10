package Obs;

public class Main {

    public static void main(String[] args) {
	    WeatherData weatherData = new WeatherData();

	    CurrentConditionDisplay currentDisplay =
                new CurrentConditionDisplay(weatherData);

	    weatherData.setMeasurments(20, 65, 30.4f);
	    weatherData.setMeasurments(15, 80, 25.6f);
    }
}
