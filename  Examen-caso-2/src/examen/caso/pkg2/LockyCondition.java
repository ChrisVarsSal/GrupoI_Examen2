package examen.caso.pkg2;


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
            s = "Hoy es tu dia de suerte, el porcentaje de humedad es el mismo que la temperatura y ademas la pression es de 800";
        else
            s = "Hoy es un dia comun y norma, con la misma suerte de siempre";
        
        return s;
            
    }
}
