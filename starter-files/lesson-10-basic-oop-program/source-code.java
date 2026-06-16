import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int nota;

    Estudiante(String nombre, int nota) {
        // TODO 1: Guarda el nombre recibido
        // TODO 2: Guarda la nota usando setNota(nota)
    }

    String getNombre() {
        // TODO 3: Retorna el nombre
        return "";
    }

    void setNombre(String nombre) {
        // TODO 4: Guarda el nuevo nombre
    }

    int getNota() {
        // TODO 5: Retorna la nota
        return 0;
    }

    void setNota(int nota) {
        // TODO 6: Valida que la nota este entre 0 y 20
        // Si es valida, guardala. Si no, guarda 0.
    }

    String obtenerResultado() {
        // TODO 7: Si la nota es mayor o igual a 13, retorna "Aprobado"
        // Si no, retorna "Desaprobado"
        return "";
    }

    void mostrarDatos() {
        // TODO 8: Muestra nombre, nota y resultado
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titulo = "registro de estudiantes";
        System.out.println(titulo.toUpperCase());

        // TODO 9: Crea un array de Estudiante con 3 espacios

        // TODO 10: Usa un for para pedir nombre y nota de cada estudiante
        // Luego crea un objeto Estudiante y guardalo en el array

        // TODO 11: Muestra la lista final de estudiantes

        // TODO 12: Calcula y muestra el promedio general

        scanner.close();
    }
}
