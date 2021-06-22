package GrupoI_Examen2_Caso1;

public class CurrentConditionsDecorator extends DecoradorVisualizador {

    public CurrentConditionsDecorator(IVisualizadorClima visualizador) {
        super(visualizador);
    }

    @Override
    public void mostrarPronostico() {
        super.mostrarPronostico();
        System.out.print(" mostrando Informacion adicional al pronostico( On curtrent Conditions) " + "\n");
        currentConditions();
    }

    void currentConditions() {
        if (super.temperatura >= 35) {
            System.out.println(" El clima esta soleado " + "\n");
        } else {
            System.out.println(" El clima esta congelado " + "\n");
        }
    }
}
