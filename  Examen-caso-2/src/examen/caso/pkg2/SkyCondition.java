package examen.caso.pkg2;


public class SkyCondition implements Observer{
    private double humidity,pressure;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
    public String show(){
        String s;
        
        if(humidity>60 && humidity<70 && pressure>850)
            s = "El cielo va a estar parcialmente nublado";
        else if(humidity>70 && pressure>700)
            s = "El cielo va a estar totalmente nublado";
        else if(humidity>75 && pressure>850)
            s = "El cielo va estar con nubes llenas de lluvia";
        else
            s = "El cielo va a estar despejado";
        
        return s;
    }
}
