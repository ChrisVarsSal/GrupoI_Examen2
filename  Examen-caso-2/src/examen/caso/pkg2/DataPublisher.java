package examen.caso.pkg2;

import java.util.ArrayList;
import java.util.List;


public class DataPublisher implements Subjet {
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
    public void notifyUpdate(Data d) {
        for(Observer o: observers) {
            o.update(d);
        }
    }
    
}
