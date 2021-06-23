package examen.caso.pkg2;


public class ConcurrentCondition implements Observer {
    private double  temperature,pressure,humidity;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
     String show(){
        return "Temperature: "+temperature+"\n"+
               "Humidity: "+humidity+"\n"+
               "Barometic Pressure: "+pressure;
    }
}
