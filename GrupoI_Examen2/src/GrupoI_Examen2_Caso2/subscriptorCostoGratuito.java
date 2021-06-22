package GrupoI_Examen2_Caso2;

public class subscriptorCostoGratuito extends IObserver {

    @Override
    public void update(Cliente cli) {
        if (cli.getNumPantallas() <= 5) {
            System.out.println("Subscriptor costo Gratuito" + "\n");
            System.out.println("Costo Final " + "Gratuito " + "\n");
        }

    }

}
