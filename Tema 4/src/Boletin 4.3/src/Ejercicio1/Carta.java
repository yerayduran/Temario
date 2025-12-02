package Ejercicio1;


public class Carta {

    private String palo;
    private final String[] número = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Carta(){

    }


    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta { " + "palo='" + palo + '\'' + ", número=" + número + '}';
    }
}
