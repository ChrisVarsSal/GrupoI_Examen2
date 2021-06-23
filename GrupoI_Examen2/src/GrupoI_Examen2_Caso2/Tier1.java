//Free sub
package GrupoI_Examen2_Caso2;

public class Tier1 extends IObserver {

    @Override
    public void update(Client cli) {
        if (cli.getNumPantallas() <= 5) {
            System.out.println("Subscriptor costo Gratuito" + "\n");
            System.out.println("Costo Final " + "Gratuito " + "\n");
        }

    }

}
