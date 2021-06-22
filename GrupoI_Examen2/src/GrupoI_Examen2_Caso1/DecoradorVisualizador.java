package GrupoI_Examen2_Caso1;

public class DecoradorVisualizador extends IVisualizadorClima {

    private final IVisualizadorClima visualizador;

    public DecoradorVisualizador(IVisualizadorClima visualizador) {
        this.visualizador = visualizador;
    }

    @Override
    void mostrarPronostico() {
        this.visualizador.mostrarPronostico();
    }
}
