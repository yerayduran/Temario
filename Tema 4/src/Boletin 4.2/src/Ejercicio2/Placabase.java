package Ejercicio2;


import Ejercicio2.Exception.OrdenadorException;

public class Placabase {

    private String marca;
    private String chipset;
    private String socket;

    public Placabase() {
    }

    public boolean esCompatible(Microprocesador mp) throws OrdenadorException{
        return this.socket.equals(mp.getSocket());
    }

    @Override
    public String toString(){
        return "Placa base: {" + "marca: " + marca + " chipset: " + chipset + "socket: " + socket + " }";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
