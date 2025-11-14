package Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cuenta c = new Cuenta();
        int opcion;

        System.out.println("¿Cuánto dinero tienes actualmente?");
        System.out.println("Es solo para saber cómo administrarte tu cuenta: ");
        long saldoInicial = sc.nextLong();

        while (saldoInicial <= 0) {
            System.out.println("Bro, ¿cómo va a ser tu cuenta en números rojos?");
            saldoInicial = sc.nextLong();
        }

        c.setSaldo(saldoInicial);

        do {
            System.out.println("\n--- Menú de operaciones ---");
            System.out.println("Pulsa 1 para hacer una retirada de dinero");
            System.out.println("Pulsa 2 para ingresar dinero");
            System.out.println("Pulsa 3 para mostrar las operaciones realizadas");
            System.out.println("Pulsa 4 para finalizar");
            System.out.println("");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuánto quieres retirar?: ");
                    long dineroRetirado = sc.nextLong();
                    c.setReintegro(dineroRetirado);
                    break;
                case 2:
                    System.out.println("¿Cuánto dinero quieres ingresar?: ");
                    long dineroIngresa = sc.nextLong();
                    c.setIngreso(dineroIngresa);
                    break;
                case 3:
                    c.consultarOperaciones();
                    break;
                case 4:
                    c.finalizar();
                    break;
                default:
                    System.out.println("No ha seleccionado una opción válida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}