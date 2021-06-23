package GrupoI_Examen2_Caso1;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
     
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(double temperature,double humidity,double pressure) {
        for(Observer o: observers) {
            o.update(temperature,humidity,pressure);
        }
    }
}
