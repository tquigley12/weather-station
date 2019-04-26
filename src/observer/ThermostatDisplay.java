package observer;

import javax.swing.*;


public class ThermostatDisplay extends JFrame implements Observer {

    private WeatherStation weatherStation;
    private JLabel lblTemperature = new JLabel();

    public ThermostatDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);

        setTitle("Your Thermostat");
        setLocation(400, 100);
        getContentPane().add(lblTemperature);
        setVisible(true);
    }

    @Override
    public void update() {
        double newTemp = weatherStation.getTemperature();
        lblTemperature.setText(Double.toString(newTemp));
    }
}
