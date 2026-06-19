# Guion — Lección 3: Operadores y Expresiones

**Duración estimada:** 5 minutos

---

## Introducción (0:00 – 0:40)

En la lección anterior aprendiste a guardar información dentro de tu programa usando variables. En esta parte, vamos a ver los **operadores y expresiones en Java**.

Así como en matemáticas usamos sumas y restas, en programación usamos **operadores aritméticos**, como el `+`, `-`, el asterisco `*` para la multiplicación y la diagonal `/` para la división, para modificar nuestros datos.

Además, veremos los **operadores lógicos**, que nos ayudan a combinar condiciones.

Imagina que estás haciendo un juego y necesitas calcular el puntaje final de un jugador. ¡Eso es exactamente lo que haremos hoy!

---

## Operadores Aritméticos: Modificando Variables (0:40 – 2:30)

Para empezar, crearemos una clase llamada `juego` y una variable `puntaje` inicializada en `0`.

A medida que ocurren eventos en el juego, usaremos operadores aritméticos para cambiar este valor.

---

### Suma `+=`

Imaginemos que nuestro personaje toma una moneda y eso le da **10 puntos**.

```java
puntaje += 10;
```

Al puntaje actual se le suma `10`. Si comprobamos con `System.out.println()`, veremos el número `10`.

---

### Resta `-=`

¿Qué pasa si el personaje pierde puntos? Usamos el operador de resta.

```java
puntaje -= 5;
```

Al `10` anterior se le resta `5`, dejándonos con `5 puntos`.

---

### Multiplicación `*=`

Ahora nuestro personaje recibe un bonificador que multiplica su puntaje por `3`.

El símbolo de multiplicación se representa con un asterisco `*`.

```java
puntaje *= 3;
```

El `5` multiplicado por `3` nos da `15`.

---

### División `/=`

Imagina que un enemigo lanza un ataque especial que divide la puntuación entre `5`.

```java
puntaje /= 5;
```

El resultado de dividir `15` entre `5` sería `3`.

---

## Operadores Lógicos: Combinando Condiciones (2:30 – 4:00)

Los operadores lógicos nos permiten combinar varias reglas.

Por ejemplo, podríamos usarlos para saber si el personaje puede o no pasar de nivel usando una variable `boolean` llamada `pasaNivel`.

Digamos que le damos a nuestro personaje una variable de vidas con un valor de `3`.

Para pasar de nivel, se deben cumplir dos condiciones:

1. El puntaje debe ser mayor a `10`.
2. Las vidas deben ser mayores a `0`.

Para esto usamos el operador lógico **AND**, que en Java se representa con dos ampersands:

```java
&&
```

Esto significa que se tienen que cumplir ambas condiciones para que el resultado sea verdadero, es decir, `true`.

---

## Juntando todo en el programa (4:00 – 4:40)

Vamos a unir nuestra lógica del juego.

Nota: para que el personaje logre pasar de nivel, es decir, que tenga una puntuación mayor a `10`, quitaremos la división del ataque enemigo para que el puntaje se mantenga en `15`.

```java
public class juego {
    public static void main(String[] args) {
        int puntaje = 0;

        // Operadores aritmeticos
        puntaje += 10; // Toma una moneda
        puntaje -= 5;  // Pierde puntos
        puntaje *= 3;  // Bonificador x3
        // puntaje /= 5; // Ataque enemigo, lo quitamos para poder ganar

        System.out.println("Puntaje final: " + puntaje);

        // Operadores logicos
        int vidas = 3;
        boolean pasaNivel = (puntaje > 10 && vidas > 0);

        System.out.println("Puede pasar de nivel? " + pasaNivel);
    }
}
```

Si ejecutamos el programa con el puntaje en `15` y `3` vidas, como ambas condiciones se cumplen, la consola imprimirá `true` y el personaje podrá pasar de nivel.

---

## Cierre (4:40 – 5:00)

En esta lección aprendiste a usar los operadores aritméticos `+`, `-`, `*` y `/` para modificar el valor de tus variables numéricas.

También aprendiste a usar el operador lógico **AND** `&&` para evaluar múltiples condiciones al mismo tiempo y obtener un resultado verdadero o falso.

Eso sería todo por este capítulo. ¡Muchas gracias y hasta la próxima!
