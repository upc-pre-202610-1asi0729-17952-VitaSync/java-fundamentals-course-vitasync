# Script Video 7: Introduccion a la Programacion Orientada a Objetos

## Inicio

En esta leccion vamos a aprender una de las ideas mas importantes de Java: la **Programacion Orientada a Objetos**, tambien conocida como **POO**.

Al inicio puede sonar como un tema complicado, pero lo vamos a explicar con una idea sencilla: personajes.

Imaginemos que queremos crear personajes para un juego. Cada personaje puede ser diferente, pero todos tienen algo en comun.

Por ejemplo, un personaje puede tener:

- Un nombre
- Un nivel
- Vida
- Energia
- Una habilidad

Tambien puede realizar acciones, como:

- Presentarse
- Mostrar su estado
- Atacar
- Descansar

---

## Clase, objetos, atributos y metodos

En programacion, cuando varios elementos tienen una misma idea general, podemos crear una **clase**.

En este caso, nuestra clase se llamara `Personaje`.

Una clase funciona como un molde o una plantilla.

Desde ese molde podemos crear varios objetos.

Por ejemplo, podemos crear un personaje llamado Luna y otro personaje llamado Max.

Los dos vienen de la misma clase `Personaje`, pero cada uno puede tener datos diferentes.

A esos datos los llamamos **atributos**.

Por ejemplo:

- `nombre`
- `nivel`
- `vida`
- `energia`
- `habilidad`

Y a las acciones que puede realizar el objeto las llamamos **metodos**.

Por ejemplo:

- `presentarse()`
- `mostrarEstado()`
- `atacar()`
- `descansar()`

Entonces, de forma sencilla:

- La clase es el molde.
- El objeto es algo creado desde ese molde.
- Los atributos son los datos.
- Los metodos son las acciones.

---

## Paso a Programiz

Ahora vamos a pasar a Programiz para convertir esta idea en codigo Java.

Primero creamos la clase `Personaje`.

```java
class Personaje {
```

Dentro de la clase agregamos los atributos.

```java
String nombre;
int nivel;
int vida;
int energia;
String habilidad;
```

Estos atributos representan las caracteristicas de cada personaje.

`String` se usa para guardar texto, como el nombre o la habilidad.

`int` se usa para guardar numeros enteros, como el nivel, la vida y la energia.

---

## Constructor

Ahora creamos el constructor.

```java
Personaje(String nombre, int nivel, int vida, int energia, String habilidad) {
    this.nombre = nombre;
    this.nivel = nivel;
    this.vida = vida;
    this.energia = energia;
    this.habilidad = habilidad;
}
```

El constructor sirve para crear un objeto con datos iniciales.

Por ejemplo, cuando escribimos:

```java
new Personaje("Luna", 5, 100, 30, "Rayo veloz")
```

Estamos creando un personaje llamado Luna, con nivel 5, vida 100, energia 30 y habilidad Rayo veloz.

La palabra `this` se usa para indicar que estamos guardando esos valores dentro del objeto actual.

---

## Metodos

Ahora vamos a crear los metodos.

Un metodo representa una accion que puede realizar el objeto.

Primero creamos el metodo `presentarse`.

```java
void presentarse() {
    System.out.println("Soy " + nombre + ", nivel " + nivel + ".");
    System.out.println("Mi habilidad es " + habilidad + ".");
}
```

Este metodo muestra el nombre, el nivel y la habilidad del personaje.

Luego creamos el metodo `mostrarEstado`.

```java
void mostrarEstado() {
    System.out.println("Vida: " + vida);
    System.out.println("Energia: " + energia);
}
```

Este metodo muestra la vida y la energia actual del personaje.

Despues creamos el metodo `atacar`.

```java
void atacar() {
    if (energia >= 10) {
        System.out.println(nombre + " usa " + habilidad + ".");
        energia = energia - 10;
    } else {
        System.out.println(nombre + " no tiene suficiente energia para atacar.");
    }
}
```

Aqui usamos una condicion.

Si el personaje tiene 10 o mas de energia, puede atacar.

Cuando ataca, su energia baja en 10.

Pero si tiene menos de 10 de energia, el programa muestra un mensaje indicando que no tiene suficiente energia para atacar.

Luego creamos el metodo `descansar`.

```java
void descansar() {
    energia = energia + 15;
    System.out.println(nombre + " descanso y recupero energia.");
}
```

Este metodo aumenta la energia del personaje en 15 puntos.

---

## Creacion de objetos

Ahora vamos a crear objetos dentro del metodo `main`.

```java
public class Main {
    public static void main(String[] args) {
```

Aqui empieza la ejecucion del programa.

Creamos dos personajes.

```java
Personaje personaje1 = new Personaje("Luna", 5, 100, 30, "Rayo veloz");
Personaje personaje2 = new Personaje("Max", 3, 80, 5, "Golpe fuerte");
```

Los dos objetos vienen de la misma clase `Personaje`, pero tienen datos diferentes.

Luna tiene 30 de energia, por eso si puede atacar.

Max tiene solo 5 de energia, por eso al inicio no podra atacar.

---

## Llamada de metodos

Ahora llamamos los metodos del primer personaje.

```java
personaje1.presentarse();
personaje1.mostrarEstado();
personaje1.atacar();
personaje1.mostrarEstado();
```

Primero Luna se presenta.

Luego muestra su estado.

Despues ataca.

Finalmente, vuelve a mostrar su estado para ver como cambio su energia.

Ahora hacemos algo parecido con Max.

```java
personaje2.presentarse();
personaje2.mostrarEstado();
personaje2.atacar();
personaje2.descansar();
personaje2.mostrarEstado();
```

Max se presenta y muestra su estado.

Luego intenta atacar, pero como tiene poca energia, no puede hacerlo.

Despues descansa y recupera energia.

Finalmente, vuelve a mostrar su estado.

---

## Codigo completo

```java
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
```

---

## Cierre

En esta leccion aprendimos que una clase es como un molde.

Tambien vimos que un objeto es algo creado a partir de ese molde.

Los atributos son los datos del objeto, como nombre, nivel, vida, energia y habilidad.

Los metodos son las acciones que puede realizar el objeto, como presentarse, atacar o descansar.

Finalmente, usamos un constructor para crear personajes con datos iniciales.

En la siguiente leccion veremos como proteger mejor los datos de nuestros objetos usando encapsulacion, `private`, getters y setters.
