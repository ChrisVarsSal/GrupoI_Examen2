package GrupoI_Examen2_Caso1;

public class Forecast extends IVisualizadorClima {

    public Forecast(int temp) {
        super.setTemperatura(temp);
    }

    @Override
    public void mostrarPronostico() {
        System.out.println(" Dispositivo Simple de pronostico del clima (Forecast)" + "\n");
        System.out.println(" Pronostico " + "\n");
        mostrarPronosticoSimple();
    }

    public void mostrarPronosticoSimple() {
        System.out.println(" Realizando un pronostico simple " + "\n");
        System.out.println(" Temperatura Actual " + super.temperatura + "\n");
    }
}
