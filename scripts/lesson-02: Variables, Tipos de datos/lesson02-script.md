# Guión — Lección 2: Variables y Tipos de Datos

**Duración estimada**: 5 minutos

---

## Introducción (0:00 – 0:25)

En la lección anterior escribiste tu primer programa y aprendiste a mostrar texto en pantalla. Ahora vamos a dar el siguiente paso: aprender a **guardar información** dentro del programa usando variables.

---

## ¿Qué es una variable? (0:25 – 1:20)

Imagina una caja con una etiqueta pegada. Dentro puedes guardar algo —por ejemplo el número 15— y en la etiqueta escribes "edad". Cada vez que necesitas ese número, solo buscas la caja por su nombre.

Eso es una **variable** en Java: un espacio en la memoria de la computadora donde guardas un dato y le pones un nombre para usarlo después.

Una variable tiene tres partes:
- El **tipo** de dato que va a guardar.
- El **nombre** de la variable.
- El **valor** que le asignamos.

---

## Tipos de datos (1:20 – 3:00)

En Java hay distintos tipos de variables según el dato que queremos guardar. Estos son los cuatro más importantes para empezar:

### int — números enteros

```java
int edad = 15;
```

`int` guarda números sin punto decimal. Nota que la línea termina con punto y coma — eso es obligatorio en Java.

### String — texto

```java
String nombre = "Ana";
```

`String` guarda texto. El contenido siempre va entre comillas dobles.

### double — números decimales

```java
double altura = 1.65;
```

`double` guarda números con punto decimal. En Java se usa punto, no coma.

### boolean — verdadero o falso

```java
boolean meGustaJava = true;
```

`boolean` solo puede tener dos valores: `true` o `false`. Es como un interruptor: encendido o apagado.

---

## Mostrando variables en pantalla (3:00 – 4:20)

Ahora juntamos todo en un programa. Para mostrar el valor de una variable usamos `System.out.println()` y unimos texto con variables usando el símbolo `+`:

```java
public class Variables {
    public static void main(String[] args) {
        int edad = 15;
        String nombre = "Ana";
        double altura = 1.65;
        boolean meGustaJava = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("¿Me gusta Java? " + meGustaJava);
    }
}
```

Al presionar **Run** verás todos los valores impresos en pantalla exactamente como los definimos.

---

## Cierre (4:20 – 5:00)

En esta lección aprendiste los cuatro tipos de datos más usados en Java: `int`, `String`, `double` y `boolean`. Y cómo combinarlos con texto para mostrarlos en pantalla con `System.out.println()`.

En la próxima lección aprenderás a hacer operaciones matemáticas con **operadores y expresiones**.

¡Hasta la lección 3!
