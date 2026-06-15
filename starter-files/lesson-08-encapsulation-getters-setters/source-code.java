class Personaje {
    private String nombre;
    private int vida;
    private int energia;

    Personaje(String nombre, int vida, int energia) {
        // TODO 1: Guarda los valores iniciales usando this
    }

    public void mostrarEstado() {
        // TODO 2: Muestra el nombre, vida y energia del personaje
    }

    public String getNombre() {
        // TODO 3: Retorna el nombre
        return "";
    }

    public int getVida() {
        // TODO 4: Retorna la vida
        return 0;
    }

    public int getEnergia() {
        // TODO 5: Retorna la energia
        return 0;
    }

    public void setEnergia(int nuevaEnergia) {
        // TODO 6: Valida que la energia no sea negativa antes de guardarla
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO 7: Crea un objeto de la clase Personaje

        // TODO 8: Muestra su estado inicial

        // TODO 9: Cambia su energia usando setEnergia

        // TODO 10: Intenta colocar una energia negativa
    }
}