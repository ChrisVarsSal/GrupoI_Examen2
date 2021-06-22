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
public class subscriptorDe_100_pantallas extends IObserver {

    @Override
    public void update(Cliente cli) {
       if(cli.getNumPantallas()>6 && cli.getNumPantallas()<=49 ){
            System.out.println("Subscriptor 100 o mas pantallas"+"\n");
           System.out.println("Costo Final " + 0.05*cli.getNumPantallas() +"Dolares"+"\n");
           cli.setMontoAPagar(0.05*cli.getNumPantallas());
       }
       
    }
    
}
