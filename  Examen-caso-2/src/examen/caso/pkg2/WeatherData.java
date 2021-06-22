package examen.caso.pkg2;


public class WeatherData {
    private WeatherStats ws;
    private Forecast fc;
    private CurrentCondition cc;

    public WeatherData(WeatherStats ws, Forecast fc, CurrentCondition cc) {
        this.ws = ws;
        this.fc = fc;
        this.cc = cc;
    }
    
    String show(int i){
        String s;
        
        switch(i){
            case 1: s = cc.show();  break;
            case 2: s = fc.show();  break;
            case 3: s = ws.show();  break;
            default:s = "Error"; 
        }
    
        return s;
    }
}
