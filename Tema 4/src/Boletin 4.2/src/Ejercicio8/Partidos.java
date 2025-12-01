package Ejercicio8;


import Ejercicio8.Exception.FutbolException;

public class Partidos {

    // Atributos
    private int jornada;
    private String quiniela;
    private String estadio;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    // Comprobar si el partido se ha jugado
    private boolean jugado;

    // Le pasaremos por parámetros el nombre del estadio y el número de la jornada
    public Partidos(int jornada, String estadio, Equipo equipoLocal, Equipo equipoVisitante) throws FutbolException {
        setJornada(jornada);
        this.estadio = estadio;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.jugado = false;
    }

    // Hacemos los get para devolver los valores de los atributos
    public int getJornada() {
        return jornada;
    }

    public String getQuiniela() {
        return quiniela;
    }

    public String getEstadio() {
        return estadio;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    // Hacemos los sets para modificar los atributos
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setJornada(int jornada) throws FutbolException {
        if (jornada < 1 || jornada > 38) {
            throw new FutbolException("Este número no es válido para una jornada");
        }
        this.jornada = jornada;
    }


    public void ponerResultado(String resultado) {
        // Si se ha jugado el partido pasará a true
        jugado = true;

        String[] resultados = resultado.split("-");
        int golesEquipoLocal = Integer.parseInt(resultados[0]);
        int golesEquipoVisitante = Integer.parseInt(resultados[1]);

        // Actualizamos los goles
        this.equipoLocal.setGoles(golesEquipoLocal);
        this.equipoVisitante.setGoles(golesEquipoVisitante);

        // Comprobamos qué equipo gana y actualizamos quiniela
        if (golesEquipoLocal > golesEquipoVisitante) {
            this.quiniela = "1";
            this.equipoLocal.sumarPartidoGanado();
        } else if (golesEquipoLocal < golesEquipoVisitante) {
            this.quiniela = "2";
            this.equipoVisitante.sumarPartidoGanado();
        } else {
            this.quiniela = "X";
        }
    }

    // Hacemos un toString
    @Override
    public String toString() {

        if (jugado) {
            return "Partido: {" + "Jornada = " + jornada + " , Quiniela = '" + quiniela + '\'' + " , Estadio = '" + estadio + '\'' + " , Equipo Local = " + equipoLocal + " , Equipo Visitante = " + equipoVisitante + "}";
        } else {
            return "Partido: {" + "Jornada = " + jornada + " , Equipo Local = " + equipoLocal.getNombre() + " , Equipo Visitante = " + equipoVisitante.getNombre() + "}" + " Aún no se ha jugado";
        }
    }
}
