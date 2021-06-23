package examen.caso.pkg2;


public class Device {
    private Subject dataPublisher;
    private ConcurrentCondition cc;
    private Forecast fc;
    private WeatherStats ws;

    public Device(Subject s) {
        cc = new ConcurrentCondition();
        fc = new Forecast();
        ws = new WeatherStats();
        
        this.dataPublisher = s;
        dataPublisher.attach(cc);
        dataPublisher.attach(fc);
        dataPublisher.attach(ws);
    }

    public void setDataPublisher(Subject DataPublisher) {
        dataPublisher.detach(cc);
        dataPublisher.detach(fc);
        dataPublisher.detach(ws);
        
        this.dataPublisher = DataPublisher;
        dataPublisher.attach(cc);
        dataPublisher.attach(fc);
        dataPublisher.attach(ws);
    }
    
    
    public String show(int i){
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
