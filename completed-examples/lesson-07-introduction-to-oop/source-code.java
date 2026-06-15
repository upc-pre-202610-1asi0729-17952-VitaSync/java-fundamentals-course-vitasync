class Personaje {
    String nombre;
    int nivel;
    int vida;
    int energia;
    String habilidad;

    Personaje(String nombre, int nivel, int vida, int energia, String habilidad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.energia = energia;
        this.habilidad = habilidad;
    }

    void presentarse() {
        System.out.println("Soy " + nombre + ", nivel " + nivel + ".");
        System.out.println("Mi habilidad es " + habilidad + ".");
    }

    void mostrarEstado() {
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
    }

    void atacar() {
        if (energia >= 10) {
            System.out.println(nombre + " usa " + habilidad + ".");
            energia = energia - 10;
        } else {
            System.out.println(nombre + " no tiene suficiente energia para atacar.");
        }
    }

    void descansar() {
        energia = energia + 15;
        System.out.println(nombre + " descanso y recupero energia.");
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Luna", 5, 100, 30, "Rayo veloz");
        Personaje personaje2 = new Personaje("Max", 3, 80, 5, "Golpe fuerte");

        personaje1.presentarse();
        personaje1.mostrarEstado();
        personaje1.atacar();
        personaje1.mostrarEstado();

        System.out.println();

        personaje2.presentarse();
        personaje2.mostrarEstado();
        personaje2.atacar();
        personaje2.descansar();
        personaje2.mostrarEstado();
    }
}