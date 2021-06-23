package examen.caso.pkg2;


public class Forecast implements Observer{
    private double  temperature;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
    }
    
    String show(){
        String s;
        if(temperature<20)
            s="Hoy esta haciendo frio";
        else if(temperature>20 && temperature<30)
            s="Hoy el clima es templado";
        else
            s="Hoy esta haciendo calor";
        
        return s;
    }
}
