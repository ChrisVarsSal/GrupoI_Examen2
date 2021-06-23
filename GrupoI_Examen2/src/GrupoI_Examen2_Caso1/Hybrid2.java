package GrupoI_Examen2_Caso1;


public class Hybrid2 {
     private Subject dataPublisher;
    private Forecast fc;
    private LockyCondition lc;
    
    Hybrid2(Subject s){
        fc = new Forecast();
        lc = new LockyCondition();
        
        dataPublisher = s;
        dataPublisher.attach(fc);
        dataPublisher.attach(lc);
    }

    public void setDataPublisher(Subject dataPublisher) {
        dataPublisher.detach(fc);
        dataPublisher.detach(lc);
        
        this.dataPublisher = dataPublisher;
        dataPublisher.attach(fc);
        dataPublisher.attach(lc);
    }
    
    public String show(int i){
        String s;
        
        switch(i){
            case 1: s = fc.show();  break;
            case 2: s = lc.show();  break;
            default:s = "Error"; 
        }
    
        return s;
    }
}
