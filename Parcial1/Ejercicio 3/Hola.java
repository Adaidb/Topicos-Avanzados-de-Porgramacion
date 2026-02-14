public class Hola {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        int a = 1;
        int b = 2;
        int cant = 10;

        for (int x = 0; x < cant; x++) {
            System.out.println(a);
            int sig = a + b;
            a = b;
            b = sig;
        }
    }
}