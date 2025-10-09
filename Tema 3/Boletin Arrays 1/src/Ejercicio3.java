import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca las posiciones que tendrá el array: ");
        while (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Introduzca un entero positivo.");
            sc.next();
            System.out.print("Introduzca las posiciones que tendrá el array: ");
            }
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("El array debe tener al menos una posición.");
            return;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada no válida. Introduzca un entero.");
                sc.next();
                System.out.print("Introduzca el número " + (i + 1) + ": ");
            }
            a[i] = sc.nextInt();
        }

        int mayor = a[0];
        int menor = a[0];
        long suma = 0;
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            if (x > mayor) mayor = x;
            if (x < menor) menor = x;
            suma += x;
        }

        int repeticionesMayor = 0;
        int repeticionesMenor = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == mayor) repeticionesMayor++;
            if (a[i] == menor) repeticionesMenor++;
        }

        double media = (double) suma / n;

        if (repeticionesMayor > 1 && repeticionesMenor > 1) {
            System.out.printf("El mayor número introducido es %d (se repite %d veces)%n", mayor, repeticionesMayor);
            System.out.printf("El menor número introducido es %d (se repite %d veces)%n", menor, repeticionesMenor);
        } else if (repeticionesMayor > 1) {
            System.out.printf("El mayor número introducido es %d (se repite %d veces)%n", mayor, repeticionesMayor);
            System.out.printf("El menor número introducido es %d%n", menor);
        } else if (repeticionesMenor > 1) {
            System.out.printf("El mayor número introducido es %d%n", mayor);
            System.out.printf("El menor número introducido es %d (se repite %d veces)%n", menor, repeticionesMenor);
        } else {
            System.out.printf("El mayor número introducido es %d%n", mayor);
            System.out.printf("El menor número introducido es %d%n", menor);
        }

        System.out.println("La media de los números introducidos es: " + media);

    }
}