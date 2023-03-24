public class Main {
    public static void main(String[] args) {
        //2-d
        int Ingresos = 300000;
        int Veh = 2;
        int EdadVeh = 3;
        int Inmuebles = 2;
        boolean EcoPlena = false;
        if (Ingresos >= 489083 || Veh >= 3 && EdadVeh < 5 || Inmuebles >= 3 || EcoPlena == true) {
            System.out.println("Este hogar pertenece al segmento de Ingresos Altos debido a que cumple con una de las condiciones necesarias");
        } else {
            System.out.println("Este hogar no pertenece al segmento de Ingresos Altos debido a que sus condiciones no son suficientes para alcanzar ésta categoria");
        }
    }
}