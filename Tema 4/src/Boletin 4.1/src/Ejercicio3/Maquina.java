package Ejercicio3;

import Ejercicio3.Exception.MaquinaException;

public class Maquina{

    private int depCafe;
    private int depLeche;
    private int depVasos;
    private double cafe;
    private double leche;
    private double cafeConLeche;
    private int contadorDepositos;
    private double monedero;

    public Maquina(double saldoIntroducido) throws MaquinaException{
        this.setMonedero(saldoIntroducido);
        this.cafe = 1.0;
        this.leche = 0.8;
        this.cafeConLeche = 1.5;
        this.depCafe = 50;
        this.depLeche = 50;
        this.depVasos = 80;
    }

    private void setMonedero(double monedero)  throws MaquinaException {
        if(monedero < 0){
            throw new MaquinaException("Tu saldo debe de ser positivo");
        }
        this.monedero = monedero;
    }

    public double getMonedero() {
        return monedero;
    }

    public void consultarOperaciones() {
        System.out.println("El saldo es de " + getMonedero() + " $");
        System.out.println("Se han realizado " + this.contadorDepositos + " ingresos");
    }

    public void finalizar() {
        System.out.println("Has salido, te has quedado con un saldo de " + this.monedero + " $");
    }

}
