public class Main {
    public static void main(String[] args) {
      
        double area = CalcularAreaRectangulo(5, 3);
        System.out.println("El area del rectángulo es: " + area);

        // TODO: Calcula el area de una caja con las dimensiones de largo ancho y alto con los valores 4, 2 y 3

        String mensaje = CrearMensajeBienvenida("tu nombre");
        System.out.println(mensaje);

        // TODO: Crea un mensaje de bienvenida con un curso en especifico
    }

    public static double CalcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double CalcularVolumenCubo(double largo, double ancho, double alto) {
        // TODO: Retornar el volumen calculado
        return 0;
    }

    public static String CrearMensajeBienvenida(String nombre) {
        return "Hola, " + nombre + ". Bienvenido al curso.";
    }

    public static String CrearMensajeBienvenida(String nombre, String curso) {
        // TODO: Retornar un mensaje de bienvenida usando el nombre y el curso
    }
  
}
