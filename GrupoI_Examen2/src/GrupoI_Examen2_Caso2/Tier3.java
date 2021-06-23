//subs from 50 to 99 screens
package GrupoI_Examen2_Caso2;

public class Tier3 extends IObserver {

    @Override
    public void update(Client cli) {
        if (cli.getNumPantallas() > 50 && cli.getNumPantallas() <= 99) {
            System.out.println("Subscriptor 50 a 99 pantallas " + "\n");
            System.out.println("Costo Final " + 0.07 * cli.getNumPantallas() + "Dolares" + "\n");
            cli.setMontoAPagar(0.07 * cli.getNumPantallas());
        }
    }
}
