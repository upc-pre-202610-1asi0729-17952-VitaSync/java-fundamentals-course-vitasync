public class Main {
  
    public static void main(String[] args) {
        double area = calcularAreaRectangulo(5, 3);
        System.out.println("El área del rectángulo es: " + area);

        double volumen = calcularVolumenCaja(4, 2, 3);
        System.out.println("El volumen de la caja es: " + volumen);

        String mensaje1 = crearMensajeBienvenida("Ana");
        System.out.println(mensaje1);

        String mensaje2 = crearMensajeBienvenida("Luis", "Java");
        System.out.println(mensaje2);
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
  
}
