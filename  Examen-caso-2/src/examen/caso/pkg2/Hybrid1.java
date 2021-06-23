package examen.caso.pkg2;


public class Hybrid1 {
    private Subject dataPublisher;
    private ConcurrentCondition cc;
    private SkyCondition sc;
    
    Hybrid1(Subject s){
        cc = new ConcurrentCondition();
        sc = new SkyCondition();
        
        dataPublisher = s;
        dataPublisher.attach(cc);
        dataPublisher.attach(sc);
    }

    public void setDataPublisher(Subject dataPublisher) {
        dataPublisher.detach(cc);
        dataPublisher.detach(sc);
        
        this.dataPublisher = dataPublisher;
        dataPublisher.attach(cc);
        dataPublisher.attach(sc);
    }
    
    public String show(int i){
        String s;
        
        switch(i){
            case 1: s = cc.show();  break;
            case 2: s = sc.show();  break;
            default:s = "Error"; 
        }
    
        return s;
    }
    
}
