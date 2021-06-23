package GrupoI_Examen2_Caso1;

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
        return "The maximum temperature reached has been: "+temperature+"\n"+
                "The maximum Humidity achieved has been: "+humidity+"\n"+
                "The maximum Barometric Pressure has been: "+pressure+"\n";
    }
}
