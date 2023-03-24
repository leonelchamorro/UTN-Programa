public class Main {
    public static void main(String[] args) {
        String Nombre = "Taylor Swift";
        char[] nombre = new char[Nombre.length()];
        for (int i = 0; i < Nombre.length(); i++) {
            if (Nombre.charAt(i) == ' ') {
                nombre[i] = 'a';
            } else {
                int f = Nombre.charAt(i) + 1;
                nombre[i] = (char) f;
            }
        }
        for (int i = 0; i < Nombre.length(); i++) {
                System.out.print(nombre[i]);


        }

    }
}
