package GrupoI_Examen2_Caso2;

import java.util.ArrayList;
import java.util.List;

public class Screens implements ISubject {

    private List<IObserver> subscriptores;

    @Override

    public void addSusbcriber(IObserver subs) {
        this.subscriptores.add(subs);
    }

    public Screens(List<IObserver> subscriptores) {
        this.subscriptores = subscriptores;
    }

    public Screens() {
        this.subscriptores = new ArrayList();
    }

    @Override
    public void removeSubscriber(IObserver subscriber) {
        this.subscriptores.remove(subscriber);
    }

    @Override
    public void notifySubscriber(Client cli) {
        for (IObserver o : subscriptores) {
            o.update(cli);
        }
    }
}
