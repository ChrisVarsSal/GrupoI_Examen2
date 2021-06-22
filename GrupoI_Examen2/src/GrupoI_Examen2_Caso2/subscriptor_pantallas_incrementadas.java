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
public class subscriptor_pantallas_incrementadas extends IObserver {
    private int pantallas = 0;
    

    public subscriptor_pantallas_incrementadas(int pantallas) {
        this.pantallas = pantallas;
    }
    
    @Override
    public void update(Cliente cli) {
        double calcularAumento=0;
       calcularAumento=cli.getMontoAPagar()*0.25;
       if(cli.getNumPantallas() > pantallas ){
            System.out.println("Subscriptor ha aumentado pantallas "+"\n");
            System.out.println("Aplicar Descuento"+"\n");
           System.out.println("Costo Final " + (cli.getMontoAPagar()-calcularAumento) +" Dolares "+"\n");
           cli.setMontoAPagar(cli.getMontoAPagar()+calcularAumento);
       }
       
    }
   
}
