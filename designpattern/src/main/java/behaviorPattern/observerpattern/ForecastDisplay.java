package behaviorPattern.observerpattern;

import java.util.List;

/**
 * Created by Miller on 2017/8/9 0009.
 * 未来几天天气显示
 */
public class ForecastDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    private List<Float> forecastTemperatures;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update(){
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        display();
    }

    public void display(){
        System.out.println("未来几天的天气");

        for (int i = 0; i < forecastTemperatures.size(); i++) {
            System.out.printf("第" + i + "天" + forecastTemperatures.get(i) + "℃" + "\n");
        }
    }
}
