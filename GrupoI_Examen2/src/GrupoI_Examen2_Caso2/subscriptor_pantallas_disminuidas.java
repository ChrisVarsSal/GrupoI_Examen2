package GrupoI_Examen2_Caso2;

public class subscriptor_pantallas_disminuidas extends IObserver {

    private int pantallas = 0;

    public subscriptor_pantallas_disminuidas(int pantallas) {
        this.pantallas = pantallas;
    }

    @Override
    public void update(Cliente cli) {
        double calcularAumento = 0;
        calcularAumento = cli.getMontoAPagar() * 0.05;
        if (cli.getNumPantallas() < pantallas) {
            System.out.println(" Subscriptor ha disminuido numero de pantallas " + "\n");
            System.out.println(" Aplicar Penalizacion" + "\n");
            System.out.println("  Costo Final " + (cli.getMontoAPagar() + calcularAumento) + " Dolares " + "\n");
            cli.setMontoAPagar(cli.getMontoAPagar() + calcularAumento);
        }
    }
}
