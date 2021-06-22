/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoschua_villegas_carballo_enunciado.pkg2;

/*
*            ----ISubject---- 
*/
public interface ISubject {
    void addSusbcriber(IObserver observer);
    void removeSubscriber(IObserver observer);
    void notifySubscriber(Cliente cli);
}
