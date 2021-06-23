package GrupoI_Examen2_Caso2;

public class SubIncreasedScreens extends IObserver {

    private int pantallas = 0;

    public SubIncreasedScreens(int pantallas) {
        this.pantallas = pantallas;
    }

    @Override
    public void update(Client cli) {
        double calcularAumento = 0;
        calcularAumento = cli.getMontoAPagar() * 0.25;
        if (cli.getNumPantallas() > pantallas) {
            System.out.println("Subscriptor ha aumentado pantallas " + "\n");
            System.out.println("Aplicar Descuento" + "\n");
            System.out.println("Costo Final " + (cli.getMontoAPagar() - calcularAumento) + " Dolares " + "\n");
            cli.setMontoAPagar(cli.getMontoAPagar() + calcularAumento);
        }
    }
}
