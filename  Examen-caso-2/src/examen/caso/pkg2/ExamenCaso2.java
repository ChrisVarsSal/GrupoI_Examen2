package examen.caso.pkg2;


public class ExamenCaso2 {

    public static void main(String[] args) {
        
        DataPublisher temperature = new DataPublisher();
        DataPublisher barometicPressure = new DataPublisher();
        DataPublisher humidity = new DataPublisher();
        
        Forecast forecast = new Forecast();
        temperature.attach(forecast);
        
        CurrentCondition currentCondition = new CurrentCondition();
        temperature.attach(currentCondition);
        
        WeatherStats weatherStats = new WeatherStats();   
        temperature.attach(weatherStats);
        barometicPressure.attach(weatherStats);
        humidity.attach(weatherStats);
        
        temperature.notifyUpdate(new Data("Temperature",50));
        barometicPressure.notifyUpdate(new Data("BarometicPressure",2));
        humidity.notifyUpdate(new Data("Humidity",0.52));
        
        
        WeatherData weatherData = new WeatherData(weatherStats,forecast,currentCondition);
        System.out.println(weatherData.show(1));
        System.out.println(weatherData.show(2));
        System.out.println(weatherData.show(3));
        
        
        
        
    }
    
}
