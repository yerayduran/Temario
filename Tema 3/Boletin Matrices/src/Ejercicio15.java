import java.util.Scanner;

public class Ejercicio15 {
    public static boolean pedirNumeroYDevuelvaCoordenadas(int[][] matriz, int numero, int[] coordenadas) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matriz = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para buscar en la matriz: ");
        int numero = scanner.nextInt();
        int[] coordenadas = new int[2];

        if (pedirNumeroYDevuelvaCoordenadas(matriz, numero, coordenadas)) {
            System.out.println("El número " + numero + " se encuentra en las coordenadas: (" + coordenadas[0] + ", " + coordenadas[1] + ")");
        } else {
            System.out.println("El número " + numero + " no se encuentra en la matriz.");
        }
    }
}
