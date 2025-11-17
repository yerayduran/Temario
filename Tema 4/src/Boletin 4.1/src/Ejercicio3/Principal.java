package Ejercicio3;

import java.util.Scanner;

public class Principal {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maquina m = new Maquina();
        int opcion;


        System.out.println("Introduce una cantidad para tu cafe: ");
        double saldoInicial = sc.nextDouble();

        while (saldoInicial < 0) {
            System.out.println("Bro, ¿cómo va a ser tu cuenta en números rojos?");
            saldoInicial = sc.nextDouble();
        }

        m.setSaldo(saldoInicial);

        do {
            System.out.println("\n--- Menú de operaciones ---");
            System.out.println("Pulsa 1 para hacer un cafe");
            System.out.println("Pulsa 2 para servir leche");
            System.out.println("Pulsa 3 para servir cafe con leche");
            System.out.println("Pulsa 4 para consultar estado de la maquina");
            System.out.println("Pulsa 5 para apagar maquina");
            System.out.println("");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    m.setCafe(saldoInicial);
                    break;
                case 2:
                    m.setLeche(saldoInicial);
                    break;
                case 3:
                    m.setCafeConLeche(saldoInicial);
                    break;
                case 4:
                    m.consultarOperaciones();
                    break;
                case 5:
                    m.finalizar();
                    break;
                default:
                    System.out.println("No ha seleccionado una opción válida.");
                    break;

            }
        } while (opcion != 5);
        sc.close();
    }
}


