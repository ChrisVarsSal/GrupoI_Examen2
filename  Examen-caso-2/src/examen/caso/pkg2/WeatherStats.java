package examen.caso.pkg2;


public class WeatherStats implements Observer{
    private double temperature,barometicPressure,humidity;
   
    @Override
    public void update(Data d) {
        switch(d.getType()){
            case "Temperature": temperature = d.getData();  break;
            case "BarometicPressure": barometicPressure = d.getData();  break;
            case "Humidity": humidity = d.getData();  break;
            default:
        }
    }
    
    String show(){
        String s;
        s = "Temperature: "+temperature+
                "\nHumidity: "+humidity+
                "\nBarometric Presure: "+barometicPressure+"\n";
        
        return s;
    }
    
}
