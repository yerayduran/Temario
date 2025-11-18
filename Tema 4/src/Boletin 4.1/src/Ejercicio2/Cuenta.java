package Ejercicio2;

import Ejercicio2.Excepcion.CuentaException;

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

    public void setSaldo(long saldo) throws CuentaException{
        if(saldo < 0){
            throw new CuentaException("Tu saldo debe de ser positivo");
        }
        this.saldo = saldo;
    }

    public long getReintegro() {
        return reintegro;
    }

    public void setReintegro(long dineroRetirado) throws CuentaException {
        if (getSaldo() <= 0){
            throw new CuentaException("No introducir más numeros negativos: ");
        }
        this.reintegro = dineroRetirado;
        this.saldo -= dineroRetirado;
        this.contadorRetiradas++;
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long dineroIngresa) throws CuentaException {
        if (dineroIngresa <= 0) {
            throw new CuentaException("Como vas a ingresar un numero negativo melón");
        }
        this.ingreso = dineroIngresa;
        this.saldo += dineroIngresa;
        this.contadorIngresos++;
    }

    public long getSaldo() {
        return saldo;
    }

    public void consultarOperaciones() {
        System.out.println("El saldo es de " + getSaldo() + " $");
        System.out.println("Se han realizado " + this.contadorRetiradas + " reintegros");
        System.out.println("Se han realizado " + this.contadorIngresos + " ingresos");
    }

    public void finalizar() {
        System.out.println("Has salido, te has quedado con un saldo de " + this.saldo + " $");
    }
}