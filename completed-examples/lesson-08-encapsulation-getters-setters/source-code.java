class Personaje {
    private String nombre;
    private int vida;
    private int energia;

    Personaje(String nombre, int vida, int energia) {
        this.nombre = nombre;
        this.vida = vida;
        this.energia = energia;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int nuevaEnergia) {
        if (nuevaEnergia >= 0) {
            energia = nuevaEnergia;
        } else {
            System.out.println("La energia no puede ser negativa.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Luis", 100, 30);

        personaje1.mostrarEstado();

        System.out.println();

        personaje1.setEnergia(50);
        personaje1.mostrarEstado();

        System.out.println();

        personaje1.setEnergia(-10);
        personaje1.mostrarEstado();
    }
}