package Ejercicio2;

public class Ordenador {

    private Placabase placaBase;
    private Microprocesador microprocesador;
    private DiscoDuro discoDuro;
    private TarjetaGrafica tarjetaGrafica;

    public Ordenador(Placabase placaBase, Microprocesador microprocesador, DiscoDuro discoDuro, TarjetaGrafica tarjetaGrafica) {

        this.placaBase = placaBase;
        this.microprocesador = microprocesador;
        this.discoDuro = discoDuro;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "placaBase=" + placaBase + ", microprocesador=" + microprocesador + ", discoDuro=" + discoDuro + ", tarjetaGrafica=" + tarjetaGrafica + '}';
    }

    public TarjetaGrafica getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public Microprocesador getMicroprocesador() {
        return microprocesador;
    }
}
