public class Main {
    public static void main(String[] args) {
                int x = 2002;
                int y = 60;
                int z = 1989;
                int[] numeros = new int[]{x, y, z};
                String Orden = "A";
        }
            }
            public static void AoD(int x, int y, int z, int[] numeros, String Orden){
                if (Orden.equals("A")) {
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
                }else {
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