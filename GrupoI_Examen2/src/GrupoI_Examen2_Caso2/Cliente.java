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
public class Cliente {
    private int numPantallas;
    private double montoAPagar;

    public Cliente(int numPantallas) {
        this.numPantallas = numPantallas;
    }

    public int getNumPantallas() {
        return numPantallas;
    }

    public void setNumPantallas(int numPantallas) {
        this.numPantallas = numPantallas;
    }

    public double getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(double montoAPagar) {
        this.montoAPagar = montoAPagar;
    }
    void imprimirDatos(){
    System.out.println("Datos del cliente a facturar"+"\n");
     System.out.println(" Numero de pantallas "+ this.numPantallas+ "\n");
      System.out.println(" Monto a Facturar :"+ this.montoAPagar + "\n");
    
    }
}
