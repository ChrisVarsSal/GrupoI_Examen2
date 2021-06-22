package examen.caso.pkg2;


public class CurrentCondition implements Observer{
    private double temperature;
    
    @Override
    public void update(Data d) {
        temperature = d.getData();
    }
    
    String show(){
        if(temperature<30) return "Hoy esta haciendo frio";
        else if(temperature<30 && temperature >35) return "Hoy el clima es templado";
        else return "Hoy esta haciendo calor";
    }
    
}
