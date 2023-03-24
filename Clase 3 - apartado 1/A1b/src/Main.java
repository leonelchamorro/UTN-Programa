public class Main {
    public static void main(String[] args) {
        //1-b //MetodoOrdenamientoPorInsercion->se considera q la primera componente del arreglo ya esta ordenada
        int x = 2002; //luego se considera la 2da comp para determinar donde insentarla en la parte ordenada del
        int y = 60;  //arreglo, por ej: 2002, 60, 1989 -> 2002 | 60, 1989 -> 60, 2002 | 1989 -> 60, 1989, 2002.
        int z = 1989;
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
    }
}
