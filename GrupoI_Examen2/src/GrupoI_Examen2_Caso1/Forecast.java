package GrupoI_Examen2_Caso1;


public class Forecast implements Observer{
    private double  temperature;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
    }
    
    String show(){
        String s;
        if(temperature<20)
            s="It's cold today";
        else if(temperature>20 && temperature<30)
                s="Today the weather is mild";
        else
            s="It is hot today";
        
        return s;
    }
}
