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
public abstract class IVisualizadorClima {
    public int temperatura = 0;

    
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    abstract void mostrarPronostico();
}
