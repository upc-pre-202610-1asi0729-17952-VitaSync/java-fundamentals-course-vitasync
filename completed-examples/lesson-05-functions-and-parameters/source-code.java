public class Main {

    public static void main(String[] args) {
        double areaRectangulo = calcularAreaRectangulo(5, 3);
        mostrarResultado("Area del rectangulo", areaRectangulo);

        double volumenCaja = calcularVolumenCaja(4, 2, 3);
        mostrarResultado("Volumen de la caja", volumenCaja);

        String mensaje1 = crearMensajeBienvenida("Tu nombre");
        mostrarMensaje(mensaje1);

        String mensaje2 = crearMensajeBienvenida("Tu nombre", "Java");
        mostrarMensaje(mensaje2);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularVolumenCaja(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    public static String crearMensajeBienvenida(String nombre) {
        return "Hola, " + nombre + ". Bienvenido al curso.";
    }

    public static String crearMensajeBienvenida(String nombre, String curso) {
        return "Hola, " + nombre + ". Bienvenido al curso de " + curso + ".";
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
