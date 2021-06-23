package examen.caso.pkg2;


public class WeatherStats implements Observer {
    private double  temperature = 0;
    private double pressure = 0;
    private double humidity = 0;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        if(this.temperature < temperature)
            this.temperature = temperature;
        if(this.humidity < humidity)
            this.humidity = humidity;
        if(this.pressure < pressure)
            this.pressure = pressure;
    }
    
     String show(){
        return "La maxima Temperatura alcansada ha sido de : "+temperature+"\n"+
                "La maxima Humedad alacanzada ha sido de : "+humidity+"\n"+
                "La maxima Presion Barometrica ha sido de : "+pressure+"\n";
    }
}
