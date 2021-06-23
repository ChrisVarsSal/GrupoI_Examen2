package GrupoI_Examen2_Caso1;

public class GrupoI_Examen2_Caso1 {

    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        
        //Original Device
        Device originalDevice = new Device(weatherData);
        weatherData.notifyUpdate(27, 856, 72);
        
        System.out.print("-----Original Device-----\n\n");
        System.out.println("Concurrent Condition");
        System.out.println(originalDevice.show(1));
        System.out.println("\nForecast");
        System.out.println(originalDevice.show(2));
        System.out.println("\nWeather Stats");
        System.out.println(originalDevice.show(3));
        
        
        //Hybrid 1
        Hybrid1 hybrid1 = new Hybrid1(weatherData);
        weatherData.notifyUpdate(34, 887, 82);
        
        System.out.print("\n\n-----Hybrid 1-----\n\n");
        System.out.println("Concurrent Condition");
        System.out.println(hybrid1.show(1));
        System.out.println("\nSky Condition");
        System.out.println(hybrid1.show(2));
        
        
        //Hybrid 2
        Hybrid2 hybrid2 = new Hybrid2(weatherData);
        weatherData.notifyUpdate(28, 850, 62);
        
        System.out.print("\n\n-----Hybrid 2-----\n\n");
        System.out.println("Forecast");
        System.out.println(hybrid2.show(1));
        System.out.println("\nLocky Condition");
        System.out.println(hybrid2.show(2));
        
    }
    
}
