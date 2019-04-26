package observer;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation station = new WeatherStation();
        station.adjustTemperature(76);

        PhoneDisplay phone = new PhoneDisplay(station);
        ThermostatDisplay thermostat = new ThermostatDisplay(station);

        Random weatherGenerator = new Random();

        while (true) {
            double adjustment = weatherGenerator.nextDouble() * 2 - 1;
            station.adjustTemperature(adjustment);

            Thread.sleep(1500);
        }

    }
}
