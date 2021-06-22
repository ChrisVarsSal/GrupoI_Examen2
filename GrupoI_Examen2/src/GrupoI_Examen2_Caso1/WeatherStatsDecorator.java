package GrupoI_Examen2_Caso1;

public class WeatherStatsDecorator extends DecoradorVisualizador {

    public WeatherStatsDecorator(IVisualizadorClima visualizador) {
        super(visualizador);
    }

    @Override
    public void mostrarPronostico() {
        super.mostrarPronostico();
        System.out.print(" mostrando Informacion adicional al pronostico (Weather Stats Decorator)" + "\n");
        humedadActual();
        presionBarometrica();
    }

    void humedadActual() {
        System.out.print(" Humedad Actual " + "56" + "\n");
    }

    void presionBarometrica() {
        System.out.print(" Presion Barometrica " + "760mmhg" + "\n");
    }
}
