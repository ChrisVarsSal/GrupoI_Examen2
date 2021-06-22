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
public class DecoradorVisualizador extends IVisualizadorClima {
    private final IVisualizadorClima visualizador;

    public DecoradorVisualizador(IVisualizadorClima visualizador) {
        this.visualizador = visualizador;
    }

    

    
    
    @Override
    void mostrarPronostico() {
        this.visualizador.mostrarPronostico();
    }
    
    
}
