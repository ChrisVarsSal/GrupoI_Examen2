package GrupoI_Examen2_Caso2;

public class Client {

    private int numPantallas;
    private double montoAPagar;

    public Client(int numPantallas) {
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

    void imprimirDatos() {
        System.out.println("Datos del cliente a facturar" + "\n");
        System.out.println(" Numero de pantallas " + this.numPantallas + "\n");
        System.out.println(" Monto a Facturar :" + this.montoAPagar + "\n");

    }
}
