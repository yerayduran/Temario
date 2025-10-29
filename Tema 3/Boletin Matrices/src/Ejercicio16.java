public class Ejercicio16 {

    public static int[][] contarParesPegados(int[][] matriz) {

        int[][] resultado = new int[matriz.length][matriz[0].length];

        int[] dirrx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dirry = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int contadorPares = 0;

                for (int k = 0; k < 8; k++) {
                    int nuevoX = i + dirrx[k];
                    int nuevoY = j + dirry[k];

                    // Verificar si el vecino está dentro de los límites de la matriz
                    if (nuevoX >= 0 && nuevoX < matriz.length && nuevoY >= 0 && nuevoY < matriz[0].length) {
                        if (matriz[nuevoX][nuevoY] % 2 == 0) {
                            contadorPares++;
                        }
                    }
                }

                resultado[i][j] = contadorPares;
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] resultado = contarParesPegados(matriz);

        // Imprimir la matriz resultado
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}