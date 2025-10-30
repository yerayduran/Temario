/*El jardín floreciente:
Tenemos un tablero de 15x15 que representa un jardín. En él, se siembran flores, representadas por un
1. Pero estas flores necesitan ciertas condiciones para florecer.
    ● Una flor necesita obligatoriamente estar colindante a una casilla con agua (incluso en diagonal)
    para poder florecer. El agua se representa con un 2.

    ● Además, una flor necesita que exista una abeja polinizadora (representada por un 5) en un radio
    de 3 casillas.

    ● Una flor no puede crecer si tiene una mala hierba (representada por un 3) colindante, excepto si
    además la flor (no la mala hierba) es colindante a un gusano come-hierbas (representado por un
    4), en cuyo caso sí podrá florecer.

    ● El resto de casillas, que serán de tierra, se representarán con un 0.
    Se pide que, dado el siguiente array, indiques qué flores florecerán, indicando sus posiciones en el array.

 Para que sirva de referencia, al pasar el array adjunto, la salida debe de salir asi:
La flor de la posición 0,0 florecerá
La flor de la posición 1,12 florecerá
La flor de la posición 3,14 florecerá
La flor de la posición 4,8 florecerá
La flor de la posición 6,0 florecerá
La flor de la posición 7,10 florecerá
La flor de la posición 7,14 florecerá
La flor de la posición 8,7 florecerá
La flor de la posición 10,12 florecerá
La flor de la posición 12,6 florecerá
La flor de la posición 12,12 florecerá
La flor de la posición 13,1 florecerá
La flor de la posición 13,3 florecerá
La flor de la posición 13,14 florecerá
La flor de la posición 14,8 florecerá */

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] jardin = {
                {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
                {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
                {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
                {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
                {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
                {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
                {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
                {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
                {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
                {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
                {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2}
        };
        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[0].length; j++) {
                if (jardin[i][j] == 1) {
                    if (puedeFlorecer(jardin, i, j)) {
                        System.out.println("La flor de la posición " + i + "," + j + " florecerá");
                    }
                }
            }
        }
    }

    public static boolean puedeFlorecer(int[][] jardin, int fila, int col) {
        return !tieneAguaColindante(jardin, fila, col) &&
               tieneAbejaEnRadio(jardin, fila, col) ||
               !tieneMalaHierbaColindanteSinGusano(jardin, fila, col);
    }

    public static boolean tieneAguaColindante(int[][] jardin, int fila, int col) {
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length) {
                    if (jardin[i][j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean tieneAbejaEnRadio(int[][] jardin, int fila, int col) {
        for (int i = fila - 3; i <= fila + 3; i++) {
            for (int j = col - 3; j <= col + 3; j++) {
                if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length) {
                    if ((i - fila) + (j - col) <= 3 && jardin[i][j] == 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean tieneMalaHierbaColindanteSinGusano(int[][] jardin, int fila, int col) {
        boolean tieneGusano = false;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length) {
                    if (jardin[i][j] == 4) {
                        tieneGusano = true;
                    }
                    if (jardin[i][j] == 3 && !tieneGusano) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}