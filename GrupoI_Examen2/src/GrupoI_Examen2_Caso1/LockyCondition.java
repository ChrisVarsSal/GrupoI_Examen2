package GrupoI_Examen2_Caso1;

public class LockyCondition implements Observer {
    private double  temperature,pressure,humidity;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
     String show(){
        String s;
        if(humidity==pressure && pressure==800)
            s = "Today is your lucky day, the humidity percentage is the same as the temperature and also the pressure is 800";
        else
            s = "Today is a common and normal day, with the same luck as always";
        
        return s;
            
    }
}
