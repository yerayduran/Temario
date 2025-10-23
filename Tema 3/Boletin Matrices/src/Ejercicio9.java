public class Ejercicio9 {
    public static boolean matrizEsSimetricaAlEjeX(int[][] matriz) {
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != matriz[matriz.length - 1 - i][j]) {
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("¿Matriz 1 es Simetrico?: " + matrizEsSimetricaAlEjeX(matriz1));
        System.out.println("¿Matriz 2 es Simetrico?: " + matrizEsSimetricaAlEjeX(matriz2));
    }
}

