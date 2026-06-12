import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = entrada.nextLine();

        System.out.println("Que edad tienes?");
        int edad = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Cual es tu curso favorito?");
        String cursoFavorito = entrada.nextLine();

        mostrarResumen(nombre, edad, cursoFavorito);

        entrada.close();
    }

    public static void mostrarResumen(String nombre, int edad, String cursoFavorito) {
        System.out.println("Resumen del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso favorito: " + cursoFavorito);
    }
  
}
