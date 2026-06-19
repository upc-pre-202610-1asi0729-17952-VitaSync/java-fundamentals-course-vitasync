public class Main {
    public static void main(String[] args) {

        int puntaje = 0;
        System.out.println(puntaje);

        puntaje += 10;
        System.out.println(puntaje);

        puntaje -= 5;
        System.out.println(puntaje);

        puntaje *= 3;
        System.out.println(puntaje);

        int vidas = 3;

        boolean pasaNivel = (puntaje > 10) && (vidas > 0);
        System.out.println(pasaNivel);
    }
}