package GrupoI_Examen2_Caso1;

public abstract class IVisualizadorClima {

    public int temperatura = 0;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    abstract void mostrarPronostico();
}
