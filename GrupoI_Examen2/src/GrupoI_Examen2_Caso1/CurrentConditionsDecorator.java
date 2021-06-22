/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoschua_villegas_carballo_enunciado.pkg1;

/**
 *
 * @author user
 */
public class CurrentConditionsDecorator extends DecoradorVisualizador{

    public CurrentConditionsDecorator(IVisualizadorClima visualizador) {
        super(visualizador);
    }
    @Override
    public void mostrarPronostico() {
        super.mostrarPronostico();
        System.out.print(" mostrando Informacion adicional al pronostico( On curtrent Conditions) "+"\n");
        currentConditions();
      
    }
    void currentConditions() {
        if (super.temperatura >= 35) {
            System.out.println(" El clima esta soleado "+"\n");
        } else {
            System.out.println(" El clima esta congelado "+"\n");
        }
    }
    
}
