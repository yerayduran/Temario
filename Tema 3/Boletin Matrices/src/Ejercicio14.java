public class Ejercicio14 {
public static boolean transformarFilasPorColumnasYViceversa(int[][] matriz) {
    int filas = matriz.length;
    int columnas = matriz[0].length;

    if (filas != columnas) {
        return false;
    }

    for (int i = 0; i < filas; i++) {
        for (int j = i + 1; j < columnas; j++) {
            int temp = matriz[i][j];
            matriz[i][j] = matriz[j][i];
            matriz[j][i] = temp;
        }
    }
    return true;
}
public static void main(String[] args) {
    int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("Matriz original:");
    for (int[] fila : matriz) {
        for (int elemento : fila) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    if (transformarFilasPorColumnasYViceversa(matriz)) {
        System.out.println("Matriz transpuesta:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    } else {
        System.out.println("La matriz no es cuadrada, no se puede transponer.");
    }
}
}

