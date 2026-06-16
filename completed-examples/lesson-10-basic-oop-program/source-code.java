import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int nota;

    Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        setNota(nota);
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    int getNota() {
        return nota;
    }

    void setNota(int nota) {
        if (nota >= 0 && nota <= 20) {
            this.nota = nota;
        } else {
            this.nota = 0;
        }
    }

    String obtenerResultado() {
        if (nota >= 13) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nota: " + getNota());
        System.out.println("Resultado: " + obtenerResultado());
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titulo = "registro de estudiantes";
        System.out.println(titulo.toUpperCase());

        Estudiante[] estudiantes = new Estudiante[3];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ":");
            int nota = scanner.nextInt();
            scanner.nextLine();

            estudiantes[i] = new Estudiante(nombre, nota);
        }

        System.out.println();
        System.out.println("LISTA FINAL DE ESTUDIANTES");

        int sumaNotas = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].mostrarDatos();
            sumaNotas = sumaNotas + estudiantes[i].getNota();
        }

        double promedio = sumaNotas / 3.0;

        System.out.println("Promedio general: " + promedio);

        scanner.close();
    }
}
