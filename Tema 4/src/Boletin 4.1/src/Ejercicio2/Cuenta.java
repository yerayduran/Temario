package Ejercicio2;

import Ejercicio2.Exception.CuentaException;

public class Cuenta {
    private long saldo;
    private long contadorRetiradas;
    private long contadorIngresos;
    private long reintegro;
    private long ingreso;

    public Cuenta() {
        this.saldo = 1;
        this.contadorRetiradas = 0;
        this.contadorIngresos = 0;
    }

    public void setSaldo(long saldo) {
        if(saldo <= 0){
        }this.saldo = saldo;
    }

    public long getReintegro() {
        return reintegro;
    }

    public void setReintegro(long dineroRetirado) throws CuentaException {
        if (getSaldo() <= 0){
            throw new CuentaException("No introducir mas numeros negativos: ");
        }
            this.reintegro = dineroRetirado;
            this.saldo -= dineroRetirado;
            this.contadorRetiradas++;
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long dineroIngresa) {
        if (dineroIngresa <= 0) {

        }
        this.ingreso = dineroIngresa;
        this.saldo += dineroIngresa;
        this.contadorIngresos++;
    }

    public long getSaldo() {
        return saldo;
    }

    public void consultarOperaciones() {
        System.out.println("El saldo es de " + getSaldo());
        System.out.println("Se han realizado " + this.contadorRetiradas + " reintegros");
        System.out.println("Se han realizado " + this.contadorIngresos + " ingresos");
    }

    public void finalizar() {
        System.out.println("Has salido, te has quedado con un saldo de " + this.saldo);
    }
}