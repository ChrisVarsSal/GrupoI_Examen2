/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoschua_villegas_carballo_enunciado.pkg2;

/**
 *
 * @author user
 */
public class subscriptorCostoGratuito extends IObserver {

    @Override
    public void update(Cliente cli) {
       if(cli.getNumPantallas()<=5){
           System.out.println("Subscriptor costo Gratuito"+"\n");
           System.out.println("Costo Final " + "Gratuito "+"\n");
       }
       
    }
    
}
