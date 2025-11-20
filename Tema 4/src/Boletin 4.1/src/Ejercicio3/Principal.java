package Ejercicio3;

import Ejercicio3.Maquina;

import Ejercicio3.Exception.MaquinaException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Maquina c = null;
        while (c == null) {
            try {
                double saldoIntroducido = MiEntradaSalida.solicitarEnteroPositivo("Introduce el saldo inicial");
                c = new Maquina(saldoIntroducido);
            } catch (MaquinaException e) {
                System.out.println(e.getMessage());
            }
        }

        int opcion;

        do {
            mostarMenu();

            opcion = MiEntradaSalida.solicitarEnteroEnRango("Escribe una opción: ", 0, 3);

            switch (opcion) {
                case 4:
                    c.consultarOperaciones();
                    break;
                case 3:
                    double servirLeche = MiEntradaSalida.solicitarEnteroPositivo("¿Cuánto dinero desea ingresar");
                    try {
                        c.ingreso(servirLeche);
                        System.out.printf("Su saldo actual es de %.2f%n", c.getSaldo());
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    double servirCafe = MiEntradaSalida.solicitarEnteroPositivo("¿Cuánto dinero desea retirar");
                    try {
                        c.reintegro(servirCafe);
                        System.out.printf("Su saldo actual es de %.2f%n", c.getSaldo());
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 1:
                    System.out.println("Gracias por utilizar este cajero. Adiós.");
                    break;

            }
        } while (opcion != 1);
    }

    public static void mostarMenu() {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Salir");
        System.out.println("2. Servir café solo");
        System.out.println("3. Servir leche");
        System.out.println("4. Servir café con leche");
        System.out.println("5. Consultar movimientos en la cuenta");
    }
}