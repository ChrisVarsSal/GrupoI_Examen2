package GrupoI_Examen2_Caso1;

public class GrupoI_Examen2_Caso1 {

    public static void main(String[] args) {
        System.out.println("\n----PRIMER SET DE PRUEBAS-----");
        IVisualizadorClima visualizador_basico = new Forecast(45);
        visualizador_basico.mostrarPronostico();
        System.out.println("\n---------");

        IVisualizadorClima currentConditions = new CurrentConditionsDecorator(new Forecast(45));
        currentConditions.mostrarPronostico();
        System.out.println("\n---------");

        IVisualizadorClima weatherStats = new WeatherStatsDecorator(new Forecast(45));
        weatherStats.mostrarPronostico();
        System.out.println("\n---------");

        System.out.println("\n----SEGUNDO SET DE PRUEBAS-----");

        System.out.println("\n----Mostrando primer hibrido -----");
        System.out.println("----Mostrando Funcionalidad Hibrida-----\n");
        IVisualizadorClima hibrido1 = new WeatherStatsDecorator(new CurrentConditionsDecorator(new Forecast(35)));
        hibrido1.mostrarPronostico();
        System.out.println("\n---------");

        System.out.println("\n----Mostrando segundo hibrido -----");
        IVisualizadorClima hibrido2 = new CurrentConditionsDecorator(new WeatherStatsDecorator(new Forecast(25)));
        hibrido2.mostrarPronostico();
        System.out.println("\n---------");
    }
}
