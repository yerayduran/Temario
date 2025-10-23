public class Ejercicio16 {

    public static int[][] contarParesAdyacentes(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];

        int[] dirrx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dirry = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int contador = 0;

                for (int k = 0; k < 8; k++) {
                    int ni = i + dirrx[k];
                    int nj = j + dirry[k];

                    if (ni >= 0 && ni < matriz.length && nj >= 0 && nj < matriz[0].length) {
                        if (matriz[ni][nj] % 2 == 0) {
                            contador++;
                        }
                    }
                }

                resultado[i][j] = contador;
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] x : matriz) {
            for (int valor : x) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {2, 3, 4},
                {5, 7, 6},
                {8, 1, 0}
        };

        int[][] resultado = contarParesAdyacentes(matriz);
        imprimirMatriz(resultado);
    }
}