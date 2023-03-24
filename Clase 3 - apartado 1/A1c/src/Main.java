public class Main {
    public static void main(String[] args) {
        //1-c
        int[] arreglo = new int[]{8, 6, -1, 2, 0, 3, -4, 3};
        int X = -2;
        int Sumador = 0;
        for (int i = 0; i <= 7; i++) {
            if (arreglo[i] > X) {
                Sumador = Sumador + arreglo[i];
            }
        }
        System.out.println(Sumador);
    }
}
