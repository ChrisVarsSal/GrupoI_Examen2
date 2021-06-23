package GrupoI_Examen2_Caso1;

public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(double t,double h,double bp);
}
