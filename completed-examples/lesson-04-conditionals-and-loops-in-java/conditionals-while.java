public class Main {
    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 5) {

            if (contador % 2 == 0) {
                System.out.println(contador);
                System.out.println("Es par!");
            } else {
                System.out.println(contador);
                System.out.println("No es par!");
            }

            contador += 1;
        }
    }
}