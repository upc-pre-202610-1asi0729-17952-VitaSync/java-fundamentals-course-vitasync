class Estudiante {
    String nombre;
    int nota;

    Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Nota: " + nota);
    }
}

public class Main {
    public static void main(String[] args) {
        String titulo = "lista de estudiantes";
        System.out.println(titulo.toUpperCase());

        Estudiante[] estudiantes = new Estudiante[3];

        estudiantes[0] = new Estudiante("Ana", 15);
        estudiantes[1] = new Estudiante("Luis", 18);
        estudiantes[2] = new Estudiante("Carlos", 12);

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].mostrarInfo();
        }
    }
}
