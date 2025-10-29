public class Ejercicio16 {

    public static int[][] contarParesAdyacentes(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int contador = 0;

                // Verificar arriba
                if (i > 0 && matriz[i - 1][j] % 2 == 0) {
                    contador++;
                }
                // Verificar abajo
                if (i < matriz.length - 1 && matriz[i + 1][j] % 2 == 0) {
                    contador++;
                }
                // Verificar izquierda
                if (j > 0 && matriz[i][j - 1] % 2 == 0) {
                    contador++;
                }
                // Verificar derecha
                if (j < matriz[0].length - 1 && matriz[i][j + 1] % 2 == 0) {
                    contador++;
                }

                resultado[i][j] = contador;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultado = contarParesAdyacentes(matriz);

        System.out.println("Matriz original:");
        for (int[] x : matriz) {
            for (int valor : x) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz de conteo de pares adyacentes:");
        for (int[] x : resultado) {
            for (int valor : x) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }


}