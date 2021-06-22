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
public class WeatherStatsDecorator extends DecoradorVisualizador{

    public WeatherStatsDecorator(IVisualizadorClima visualizador) {
        super(visualizador);
    }

    @Override
    public void mostrarPronostico() {
        super.mostrarPronostico();
        System.out.print(" mostrando Informacion adicional al pronostico (Weather Stats Decorator)"+"\n");
        humedadActual();
        presionBarometrica();
      
    }
    
    void humedadActual(){
         System.out.print (" Humedad Actual " + "56" +"\n");
    }
     void presionBarometrica(){
         System.out.print (" Presion Barometrica " + "760mmhg"+ "\n");
    }
}
