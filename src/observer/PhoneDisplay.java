package observer;

import javax.swing.*;


public class PhoneDisplay extends JFrame implements Observer {

    private WeatherStation weatherStation;
    private JLabel lblTemperature = new JLabel();

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);

        setTitle("Your Phone");
        setLocation(100, 100);
        getContentPane().add(lblTemperature);
        setVisible(true);
    }

    @Override
    public void update() {
        double newTemp = weatherStation.getTemperature();
        lblTemperature.setText(Double.toString(newTemp));
    }
}
