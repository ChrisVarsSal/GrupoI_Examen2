//subs from 100 screens
package GrupoI_Examen2_Caso2;

public class Tier4 extends IObserver {

    @Override
    public void update(Client cli) {
        if (cli.getNumPantallas() > 6 && cli.getNumPantallas() <= 49) {
            System.out.println("Subscriptor 100 o mas pantallas" + "\n");
            System.out.println("Costo Final " + 0.05 * cli.getNumPantallas() + "Dolares" + "\n");
            cli.setMontoAPagar(0.05 * cli.getNumPantallas());
        }
    }
}
