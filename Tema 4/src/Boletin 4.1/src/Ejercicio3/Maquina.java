package Ejercicio3;
public class Maquina{
    public double saldo;
    public int depCafe;
    public int depLeche;
    public int depVasos;
    public final double cafe;
    public final double leche;
    public final double cafeConLeche;


    public Maquina() {
        this.saldo = 1.0;
        this.depCafe = 50;
        this.depLeche = 50;
        this.depVasos = 80;
        this.cafe = 1.0;
        this.leche = 0.80;
        this.cafeConLeche = 1.5;
    }

    public double getSaldo() {
        return saldo--;
    }

    public void setSaldo(double saldo) {
        if(saldo <= 0){
            System.out.println("Como vas a introducir un cantidad negativa animal");
        }else{
            this.saldo = saldo;
        }
    }

    public double getCafe() {
        return cafe;
    }

    public void setCafe(double cafe) {
        if(saldo < cafe || saldo <= 0){
            System.out.println("Bro, introduce más dinero o te quedas sin cafe");
        }else{
            this.saldo -= cafe;
            this.depCafe--;
            this.depVasos--;
        }
    }

    public double getLeche() {
        return leche;
    }

    public void setLeche(double leche) {
        if(saldo < leche || saldo <= 0){
            System.out.println("Bro, introduce más dinero o te quedas sin leche");
        }else{
            this.saldo = leche;
            this.depLeche--;
            this.depVasos--;
        }
    }

    public double getCafeConLeche() {
        return cafeConLeche;
    }

    public void setCafeConLeche(double cafeConLeche) {
        if(saldo < cafeConLeche || saldo <= 0){
            System.out.println("Bro, introduce más dinero o te quedas sin cafe con Leche");
        }else{
            this.saldo = cafeConLeche;
            this.depCafe--;
            this.depLeche--;
            this.depVasos--;
        }
    }

    public double getDepCafe() {
        return depCafe;
    }

    public void setDepCafe(int depCafe) {
        this.depCafe = depCafe;
    }

    public int getDepLeche() {
        return depLeche;
    }

    public void setDepLeche(int depLeche) {
        this.depLeche = depLeche;
    }

    public int getDepVasos() {
        return depVasos;
    }

    public void setDepVasos(int depVasos) {
        this.depVasos = depVasos;
    }


    public void consultarOperaciones() {
        System.out.println("El saldo es de " + getSaldo());
        System.out.println("Quedan todavia " + this.depCafe + " Depositos de Cafe");
        System.out.println("Quedan todavia " + this.depLeche + " Depositos de Leche");
        System.out.println("Quedan todavia " + this.depVasos + " Depositos de Vasos");
    }

    public void finalizar() {
        System.out.println("Has salido, te han sobrado un saldo de " + this.saldo);
    }
}
