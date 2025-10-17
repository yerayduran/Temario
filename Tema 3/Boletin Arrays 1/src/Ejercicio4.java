public class Ejercicio4 {
    private static final int N = 6000;
    private static final int MAX_VALOR = 6;
    private static final int MIN_VALOR = 1;


    public static void main(String[] args) {  // Punto de entrada del programa
        int[] numeros = new int[N];
        int[] contadorFinal = new int[10];
        long sumaTotal = 0L;


        for (int i = 0; i < N; i++) {  // Generar números aleatorios y contar dígitos finales
            int v = (int) (Math.random() * (MAX_VALOR - MIN_VALOR + 1));
            numeros[i] = v;
            sumaTotal += v;
            int digito = Math.abs(v) % 10;
            contadorFinal[digito]++;
        }


        double mediaNumeros = (double) sumaTotal / N;


        int digitoMasFrecuente = 0;  // Encontrar el dígito más frecuente
        int maxCuenta = contadorFinal[0];
        for (int d = 1; d <= 6; d++) {
            if (contadorFinal[d] > maxCuenta) {
                maxCuenta = contadorFinal[d];
                digitoMasFrecuente += contadorFinal[d];

            }
        }


        double[] porcentajes = new double[10];
        double sumaPorcentajes = 0.0;

        System.out.println("Se han generado " + N + " números aleatorios entre 0 y " + MAX_VALOR + ".");
        System.out.println();
        System.out.printf("La media de los números generados es: %.4f%%%n", mediaNumeros);
        System.out.println();

        for (int d = 1; d <= 6; d++) {  // Mostrar resultados por dígito
            porcentajes[d] = 100.0 * contadorFinal[d] / N;
            sumaPorcentajes += porcentajes[d];
            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %.2f%%%n", d, contadorFinal[d], porcentajes[d]);
        }

        System.out.println();



        int contadorDiferentes = 0;
        for (int d = 0; d <= 1; d++) {
            System.out.println("Todos los dígitos 1-6 han aparecido al menos una vez.");
            if (d == 0) {
                System.out.printf("Los dígitos que no han aparecido como final es: %d %n ", d);
                break;
            }

        }

        System.out.println();
        System.out.printf("El dígito en el que más números terminan es %d (se repite %d veces)%n", digitoMasFrecuente, maxCuenta);


        System.out.printf("La suma de todos los porcentajes es equivalente a %.2f%%%n", sumaPorcentajes);


        double sumaPct0a5 = 0.0;
        for (int d = 1; d <= 6; d++) sumaPct0a5 += porcentajes[d];  // Suma de porcentajes 1-6
        double mediaPct0a5 = sumaPct0a5 / 6.0;
        System.out.printf("El %% medio para los dígitos 1-6 es de %.2f%%%n", mediaPct0a5);
    }
}