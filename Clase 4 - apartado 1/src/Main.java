import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        String Orden;
        System.out.println("Por favor ingrese tres numeros y luego escoja si prefiere verlos ordenados de manera ascendente, introduciendo la letra A, o de manera descendente, introduciendo la letra D");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        Orden = scanner.next();
        while (!(Orden.equals("A") || Orden.equals("D") || Orden.equals("a") || Orden.equals("d"))) {
            System.out.println("Por favor, repita su opcion: A para ascendente, D para descendente");
            Orden = scanner.next();
        }
        if (Orden.equals("A")) {
            int[] numeros = new int[]{x, y, z};
            for (int i = 1; i <= 2; i++) {
                int X = numeros[i];
                int J = i - 1;
                boolean cond = true;
                while (cond && J >= 0) {
                    if (X < numeros[J]) {
                        numeros[J + 1] = numeros[J];
                        J = J - 1;
                    } else {
                        cond = false;
                    }
                }
                numeros[J + 1] = X;
            }
            for (int i = 0; i <= 2; i++) {
                System.out.println(numeros[i]);
            }
        } else {
            int[] numeros = new int[]{x, y, z};
            for (int i = 1; i <= 2; i++) {
                int X = numeros[i]; //considero a numeros[J] como el mayor
                int J = i - 1;
                boolean cond = true;
                while (cond && J >= 0) {
                    if (X > numeros[J]) {
                        numeros[J + 1] = numeros[J];
                        J = J - 1;
                    } else {
                        cond = false;
                    }
                }
                numeros[J + 1] = X;
            }
            for (int i = 0; i <= 2; i++) {
                System.out.println(numeros[i]);

            }
        }
    }
}