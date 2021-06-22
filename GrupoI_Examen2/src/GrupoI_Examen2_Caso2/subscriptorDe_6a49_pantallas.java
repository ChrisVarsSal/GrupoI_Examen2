package GrupoI_Examen2_Caso2;

public class subscriptorDe_6a49_pantallas extends IObserver {

    @Override
    public void update(Cliente cli) {
        if (cli.getNumPantallas() > 6 && cli.getNumPantallas() <= 49) {
            System.out.println("Subscriptor 6 a 49 pantallas " + "\n");
            System.out.println("Costo Final " + 0.10 * cli.getNumPantallas() + "Dolares" + "\n");
            cli.setMontoAPagar(0.10 * cli.getNumPantallas());
        }
    }
}
