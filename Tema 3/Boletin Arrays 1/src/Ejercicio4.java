public class Ejercicio4 {
    private static final int N = 6000;
    private static final int MAX_VALOR = 100;

    public static void main(String[] args) {
        int[] numeros = new int[N];
        int[] contadorFinal = new int[10];
        long sumaTotal = 0L;


        for (int i = 0; i < N; i++) {
            int v = (int) (Math.random() * (MAX_VALOR + 1));
            numeros[i] = v;
            sumaTotal += v;
            int digito = Math.abs(v) % 10;
            contadorFinal[digito]++;
        }


        double mediaNumeros = (double) sumaTotal / N;


        int digitoMasFrecuente = 0;
        int maxCuenta = contadorFinal[0];
        for (int d = 1; d <= 9; d++) {
            if (contadorFinal[d] > maxCuenta) {
                maxCuenta = contadorFinal[d];
                digitoMasFrecuente = d;
            }
        }


        double[] porcentajes = new double[10];
        double sumaPorcentajes = 0.0;

        System.out.println("Se han generado " + N + " números aleatorios entre 0 y " + MAX_VALOR + ".");
        System.out.println();
        System.out.printf("La media de los números generados es: %.4f%n", mediaNumeros);
        System.out.println();

        for (int d = 0; d <= 9; d++) {
            porcentajes[d] = 100.0 * contadorFinal[d] / N;
            sumaPorcentajes += porcentajes[d];
            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %.2f%%%n",
                    d, contadorFinal[d], porcentajes[d]);
        }

        System.out.println();


        StringBuilder sinAparecer = new StringBuilder();
        for (int d = 0; d <= 9; d++) {
            if (contadorFinal[d] == 0) {
                if (sinAparecer.length() > 0) sinAparecer.append(", ");
                sinAparecer.append(d);
            }
        }
        if (sinAparecer.length() == 0) {
            System.out.println("Todos los dígitos 0..9 han aparecido al menos una vez.");
        } else {
            System.out.println("Los dígitos que no han aparecido como final son: " + sinAparecer.toString());
        }

        System.out.println();
        System.out.printf("El dígito en el que más números terminan es %d (se repite %d veces).%n",
                digitoMasFrecuente, maxCuenta);


        System.out.printf("La suma de todos los porcentajes es equivalente a %.2f%%%n", sumaPorcentajes);


        double sumaPct0a5 = 0.0;
        for (int d = 0; d <= 5; d++) sumaPct0a5 += porcentajes[d];
        double mediaPct0a5 = sumaPct0a5 / 6.0;
        System.out.printf("El %% medio para los dígitos 0..5 es de %.2f%%%n", mediaPct0a5);
    }
}