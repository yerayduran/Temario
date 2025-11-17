package Ejercicio2;

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
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo.");
        } else {
            this.saldo = saldo;
        }
    }

    public long getReintegro() {
        return reintegro;
    }

    public void setReintegro(long dineroRetirado) {
        if (dineroRetirado <= 0 || dineroRetirado > saldo) {
            System.out.println("El saldo es insuficiente o el monto es inválido.");
        } else {
            this.reintegro = dineroRetirado;
            this.saldo -= dineroRetirado;
            this.contadorRetiradas++;
        }
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long dineroIngresa) {
        if (dineroIngresa <= 0) {
            System.out.println("El ingreso debe ser positivo.");
        } else {
            this.ingreso = dineroIngresa;
            this.saldo += dineroIngresa;
            this.contadorIngresos++;
        }
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
