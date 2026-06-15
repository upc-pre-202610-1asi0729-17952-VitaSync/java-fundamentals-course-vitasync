# Script Video 8: Encapsulacion, Getters y Setters

## Inicio

En la leccion anterior aprendimos a crear una clase llamada `Personaje`.

Tambien vimos que un personaje puede tener atributos, como nombre, vida y energia.

Pero ahora aparece una pregunta importante:

¿Deberiamos dejar que cualquier parte del programa cambie esos datos directamente?

Por ejemplo, si alguien cambia la energia de un personaje y le coloca un valor negativo, eso no tendria mucho sentido.

Para evitar ese tipo de problemas usamos un principio basico de la Programacion Orientada a Objetos llamado **encapsulacion**.

---

## Que es encapsulacion

La encapsulacion consiste en proteger los datos de una clase.

Podemos imaginarlo como guardar los atributos dentro de una caja con seguro.

No dejamos que los datos se modifiquen directamente desde cualquier parte del programa.

En lugar de eso, usamos metodos especiales para leer o cambiar esos datos de forma controlada.

Para proteger los atributos usamos la palabra `private`.

Cuando un atributo es `private`, no se puede modificar directamente desde fuera de la clase.

---

## Getters y setters

Para trabajar con atributos privados usamos dos tipos de metodos:

- **Getters**
- **Setters**

Un getter sirve para obtener o leer un valor.

Un setter sirve para cambiar un valor.

La ventaja de usar setters es que podemos validar los datos antes de guardarlos.

Por ejemplo, podemos evitar que la energia sea negativa.

---

## Paso a Programiz

Ahora pasamos a Programiz.

Vamos a crear nuevamente la clase `Personaje`, pero esta vez usando encapsulacion.

Primero creamos la clase.

```java
class Personaje {
```

Luego agregamos los atributos, pero ahora con `private`.

```java
private String nombre;
private int vida;
private int energia;
```

Esto significa que estos datos estan protegidos.

No se deben cambiar directamente desde el `main`.

---

## Constructor

Ahora creamos el constructor.

```java
Personaje(String nombre, int vida, int energia) {
    this.nombre = nombre;
    this.vida = vida;
    this.energia = energia;
}
```

El constructor sirve para crear el personaje con datos iniciales.

En este caso recibe el nombre, la vida y la energia.

---

## Metodo para mostrar estado

Ahora creamos un metodo para mostrar el estado del personaje.

```java
public void mostrarEstado() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Vida: " + vida);
    System.out.println("Energia: " + energia);
}
```

Este metodo imprime los datos del personaje.

Aunque los atributos sean privados, la propia clase si puede usarlos.

---

## Getters

Ahora creamos getters.

```java
public String getNombre() {
    return nombre;
}
```

Este metodo permite obtener el nombre del personaje.

Tambien podemos crear getters para la vida y la energia.

```java
public int getVida() {
    return vida;
}

public int getEnergia() {
    return energia;
}
```

Los getters devuelven el valor de un atributo.

Por eso usan `return`.

---

## Setters

Ahora creamos setters.

```java
public void setEnergia(int nuevaEnergia) {
    if (nuevaEnergia >= 0) {
        energia = nuevaEnergia;
    } else {
        System.out.println("La energia no puede ser negativa.");
    }
}
```

Este metodo permite cambiar la energia, pero antes revisa si el nuevo valor es correcto.

Si la nueva energia es mayor o igual a cero, se guarda.

Pero si es negativa, el programa muestra un mensaje y no cambia el valor.

Este es el beneficio de usar encapsulacion: podemos controlar como se modifican los datos.

---

## Instanciacion simple

Ahora vamos al metodo `main`.

Creamos un objeto de la clase `Personaje`.

```java
Personaje personaje1 = new Personaje("Luis", 100, 30);
```

Esto se llama instanciar un objeto.

Instanciar significa crear un objeto a partir de una clase.

Aqui estamos creando un personaje llamado Luis, con 100 de vida y 30 de energia.

Luego mostramos su estado.

```java
personaje1.mostrarEstado();
```

Despues podemos cambiar su energia usando el setter.

```java
personaje1.setEnergia(50);
```

Y volvemos a mostrar el estado.

```java
personaje1.mostrarEstado();
```

Ahora probamos un valor incorrecto.

```java
personaje1.setEnergia(-10);
```

Como la energia no puede ser negativa, el programa no deberia aceptar ese valor.

---

## Codigo completo

```java
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
```

---

## Resultado esperado

```text
Nombre: Luis
Vida: 100
Energia: 30

Nombre: Luis
Vida: 100
Energia: 50

La energia no puede ser negativa.
Nombre: Luis
Vida: 100
Energia: 50
```

---

## Cierre

En esta leccion aprendimos que la encapsulacion sirve para proteger los datos de una clase.

Para eso usamos `private`.

Tambien aprendimos que los getters permiten leer valores y que los setters permiten cambiar valores de forma controlada.

Finalmente, vimos que instanciar significa crear un objeto a partir de una clase.

Con esto, nuestros objetos quedan mejor organizados y sus datos estan mas protegidos.
