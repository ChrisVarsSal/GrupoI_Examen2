package GrupoI_Examen2_Caso2;

public interface ISubject {
    void addSusbcriber(IObserver observer);
    void removeSubscriber(IObserver observer);
    void notifySubscriber(Cliente cli);
}
