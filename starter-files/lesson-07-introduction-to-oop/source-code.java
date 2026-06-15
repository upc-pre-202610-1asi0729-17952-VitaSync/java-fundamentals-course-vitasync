class Personaje {
    String nombre;
    int nivel;
    int vida;
    int energia;
    String habilidad;

    Personaje(String nombre, int nivel, int vida, int energia, String habilidad) {
        // TODO 1: Guarda los valores recibidos en los atributos usando this
    }

    void presentarse() {
        // TODO 2: Muestra el nombre, nivel y habilidad del personaje
    }

    void mostrarEstado() {
        // TODO 3: Muestra la vida y energia del personaje
    }

    void atacar() {
        // TODO 4: Si la energia es mayor o igual a 10, el personaje ataca
        // TODO 5: Si no tiene energia suficiente, muestra un mensaje
    }

    void descansar() {
        // TODO 6: Aumenta la energia del personaje en 15 puntos
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO 7: Crea dos objetos de la clase Personaje

        // TODO 8: Llama los metodos de cada personaje
    }
}