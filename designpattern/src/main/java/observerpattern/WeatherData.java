package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miller on 2017/8/9 0009.
 * 天气数据类
 */
public class WeatherData implements Subject{

    private List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    private List<Float> forecastTemperatures;

    public WeatherData(){
        this.observers = new ArrayList<Observer>();
    }


    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyobservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void measurementsChange(){
        notifyobservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure, List<Float> forecastTemperatures){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.forecastTemperatures = forecastTemperatures;
        measurementsChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }

}
