package examen.caso.pkg2;


public class Forecast implements Observer {
   private double temperature;

    @Override
    public void update(Data d) {
        temperature = d.getData();
    }
   
    String show(){
        return "Temperatura: "+temperature;
    }
}
