package GrupoI_Examen2_Caso1;

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
            s = "The sky is going to be partly cloudy";
        else if(humidity>70 && pressure>700)
            s = "The sky is going to be totally cloudy";
        else if(humidity>75 && pressure>850)
            s = "The sky will be with clouds full of rain";
        else
            s = "The sky will be clear";
        
        return s;
    }
}
