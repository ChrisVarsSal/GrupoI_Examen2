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
public class Forecast extends IVisualizadorClima {

    public Forecast(int temp) {
        super.setTemperatura(temp);
    }

    @Override
    public void mostrarPronostico() {
        System.out.println(" Dispositivo Simple de pronostico del clima (Forecast)"+"\n");
         System.out.println(" Pronostico "+"\n");
         mostrarPronosticoSimple();
    }
    public void mostrarPronosticoSimple(){
    System.out.println(" Realizando un pronostico simple "+"\n");
     System.out.println(" Temperatura Actual "+ super.temperatura +"\n");
    }
    
}
