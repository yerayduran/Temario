public class Ejercicio8 {
    public static int posicionDe(int[] arr, int valor) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {7, 8, -3, 0, 8, 99, 21};
        System.out.println(posicionDe(a, 8));   // imprime 1 (primer 8)
        System.out.println(posicionDe(a, 2));   // imprime -1 (no está)
        System.out.println(posicionDe(null, 0)); // imprime -1 (null)
    }
}