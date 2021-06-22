/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoschua_villegas_carballo_enunciado.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PublicadorPantallas implements ISubject {
private List<IObserver> subscriptores;
    @Override
    
    public void addSusbcriber(IObserver subs) {
        this.subscriptores.add(subs);
    }

    public PublicadorPantallas(List<IObserver> subscriptores) {
        this.subscriptores = subscriptores;
    }
    public PublicadorPantallas() {
        this.subscriptores = new ArrayList();
    }
    @Override
    public void removeSubscriber(IObserver subscriber) {
         this.subscriptores.remove(subscriber);
    }

    @Override
    public void notifySubscriber(Cliente cli) {
        for(IObserver o: subscriptores){
        o.update(cli);
    }
    }

   
    
}
