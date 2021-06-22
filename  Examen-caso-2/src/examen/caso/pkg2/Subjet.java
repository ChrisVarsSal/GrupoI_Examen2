package examen.caso.pkg2;


public interface Subjet {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Data d);
}
