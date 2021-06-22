package GrupoI_Examen2_Caso1;
/*
*Patron escogido : Decorador
motivo: En la carta se dice que se requiere  une aplicación que inicialmente proporcione tres elementos de visualización de modo que
posteriormente  otros desarrolladores puedan escribir sus propias pantallas meteorológicas y conectarlas directamente
el patron decorador es el indicado en este caso ya que permite extender la funcionalidad 
de un visualizador del clima basico sin afectar su estructura base ya definida, permitiendo agregar 
funcionalidad adicional nueva por medio de decoradores que realizan calculos adicionales.
Segun el enunciado del problema se requiere que la aplicacion sea extendible con lo que la implementacion 
de un patron decorador calza perfectamente ya que se pueden agregar n decoradores nuevos creados por el usuario sin afectar la estructura base del problema
observese que en primera instancia los tres dispositivos son dispositivos no estan relacionados  y cuentan con funcionalidad distinta, sin embargo a la hora de mezclar
los objetos decorados con mas decoradores podemos obtener la funcionalidad de varios dispositivos en uno que 
es la parte final de los requerimientos.
Como extra se podria implementar el patron observer para notificar a los dispositivos de que hubo un cambio en las 
mediciones, sin embargo como para los requisitos propuestos no se establece la utilidad real de las mediciones 
y estas se dejan a modo ilustrativo, se deja la implementacion de este patron para una posible Version actualizada de la app
con los nuevos requerimientos recordemos el principio (KISS)...

*
*
*/
public class GrupoI_Examen2_Caso1 {

    /**
     * @param args the command line arguments
     */
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
        IVisualizadorClima hibrido1= new WeatherStatsDecorator(new CurrentConditionsDecorator(new Forecast(35)));
        hibrido1.mostrarPronostico();
        System.out.println("\n---------");
        
        System.out.println("\n----Mostrando segundo hibrido -----");
        IVisualizadorClima hibrido2= new CurrentConditionsDecorator(new WeatherStatsDecorator(new Forecast(25)));
        hibrido2.mostrarPronostico();
        System.out.println("\n---------");
        
        
    }
    
}
