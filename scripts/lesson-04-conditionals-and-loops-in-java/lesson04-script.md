# Guion — Lección 4: Estructuras de Control: Lógica e Iteración

**Duración estimada:** 5 minutos

---

## Introducción (0:00 – 0:45)

Bienvenidos a un nuevo video. Hoy veremos las **estructuras de control**.

Imagina que tu programa es como un tren. Las sentencias `if` y `else` son como cambios de vía que le dicen al tren por qué camino ir dependiendo de una condición.

Por otro lado, los bucles `for` y `while` son los que le dicen al tren que dé varias vueltas en un circuito cerrado.

Hoy haremos un programa que detecte si un número es par o impar, y haremos que lo repita cinco veces automáticamente.

---

## Condicionales: `if` y `else` (0:45 – 2:15)

El `if` funciona indicando que, si se cumple una condición, se ejecutará el código que está dentro de sus llaves.

Si esa primera condición no se cumple, entra el `else`, que funciona como una segunda opción de respaldo.

Para saber si un número es par o impar, utilizaremos el operador de módulo `%`, el cual representa el residuo de una división.

Si dividimos un número entre `2` y su residuo es `0`, entonces el número es par.

```java
int numero = 4;

if (numero % 2 == 0) {
    System.out.println("es par");
} else {
    System.out.println("no es par");
}
```

Si probamos con `4`, la condición se cumple porque no deja residuo, y el sistema imprime que es par.

Si cambiamos el número a `5`, al dejar un residuo, la primera condición falla. Entonces ocurre la segunda opción del `else` y el programa nos dirá que no es par.

---

## Bucles: `for` y `while` (2:15 – 4:00)

Para evitar evaluar los números manualmente uno por uno, usamos bucles para automatizar el proceso.

---

### El bucle `for`

En el `for`, iniciamos una variable, por ejemplo `i = 1`, establecemos una condición de límite, como `i <= 5`, y le decimos que aumente.

Este aumento no se da de inmediato. Primero, el programa termina el recorrido dentro de las llaves y recién ahí la variable aumenta.

```java
for (int i = 1; i <= 5; i++) {
    // Codigo a repetir
}
```

---

### El bucle `while`

El `while` funciona como la palabra “mientras” en español.

Es decir, mientras se cumpla una condición, se ejecutará el código que está dentro de sus llaves.

A diferencia del `for`, este necesita una variable externa que funcione como contador.

Es muy importante recordar que debemos hacer que el contador aumente usando `+= 1` al finalizar cada vuelta. Si no hacemos eso, el bucle se repetirá infinitamente.

---

## Juntando todo: Evaluaciones automáticas (4:00 – 4:40)

Ahora unimos nuestra condición de par o impar dentro de un bucle `while`, en una clase que nombraremos `ParImpar`.

Imprimiremos el valor del contador en cada vuelta para ver cómo avanza.

```java
public class ParImpar {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);

            if (contador % 2 == 0) {
                System.out.println("es par");
            } else {
                System.out.println("no es par");
            }

            contador += 1;
        }
    }
}
```

Al ejecutar el programa, veremos que el contador empieza con `1`, y nos dice que no es par.

Después, el contador aumenta y pasa a ser `2`, que sí es par. Luego sigue con `3`, `4` y `5`, evaluando cada número automáticamente.

---

## Cierre (4:40 – 5:00)

Pudimos notar que nuestras cinco evaluaciones se realizaron de manera completamente automática.

Con esto, nuestros programas no solo toman decisiones, sino que también pueden procesar varias acciones sin que tengamos que repetir el código manualmente.

Eso sería todo por esta lección. ¡Muchas gracias!
