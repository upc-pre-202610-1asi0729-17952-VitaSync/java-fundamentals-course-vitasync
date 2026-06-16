# Script — Leccion 10: Desarrollo de un programa basico con POO

**Duracion objetivo**: 12 minutos  
**Editor a mostrar en pantalla**: Programiz Java Online  
**Formato**: Diapositivas + practica guiada en Programiz  
**Programa**: Registro de estudiantes interactivo

---

## Estructura general

- 0:00 - 2:35 -> Diapositivas 1 a 4
- 2:35 - 10:45 -> Programiz
- 10:45 - 12:00 -> Diapositivas 5 y 6 + cierre

---

## [0:00 - 0:30] Diapositiva 1 - Portada

**Accion:** Muestra la diapositiva 1.

**Que decir:**

Hola, bienvenidos a la leccion 10.

En esta leccion vamos a desarrollar un programa basico en Java usando programacion orientada a objetos.

El programa sera un registro de estudiantes. Es decir, vamos a permitir que el usuario ingrese nombres y notas, y luego el programa mostrara si cada estudiante esta aprobado o desaprobado.

Lo importante de esta leccion es que no vamos a usar los conceptos por separado, sino que vamos a unir varias ideas que ya vimos antes para construir un programa mas completo.

---

## [0:30 - 1:10] Diapositiva 2 - Lo que ya aprendimos

**Accion:** Cambia a la diapositiva 2.

**Que decir:**

Antes de pasar al codigo, recordemos las herramientas que ya conocemos.

Durante el curso vimos variables, tipos de datos, operadores, condiciones, bucles, metodos, entrada y salida por consola, clases, objetos, encapsulacion, arrays y cadenas.

En esta leccion vamos a juntar varias de esas piezas.

Por ejemplo, usaremos String para guardar nombres, int para guardar notas, Scanner para leer datos, if para tomar decisiones, for para repetir acciones, y clases y objetos para organizar mejor nuestro programa.

---

## [1:10 - 1:55] Diapositiva 3 - De un estudiante a varios estudiantes

**Accion:** Cambia a la diapositiva 3.

**Que decir:**

Pensemos primero en un solo estudiante.

Un estudiante puede tener un nombre y una nota.

En programacion orientada a objetos, podemos representar ese estudiante como un objeto.

Pero si queremos registrar varios estudiantes, no seria ordenado crear todo por separado.

Para eso usaremos un array de objetos.

Cada posicion del array guardara un estudiante diferente.

Entonces, la idea principal sera esta: un estudiante sera un objeto, y varios estudiantes estaran guardados dentro de un array.

---

## [1:55 - 2:35] Diapositiva 4 - Nuestro programa de hoy

**Accion:** Cambia a la diapositiva 4.

**Que decir:**

El programa que construiremos sera un registro de estudiantes.

Cada estudiante tendra nombre, nota y resultado.

El resultado no lo escribiremos manualmente. El programa lo calculara usando una condicion.

Si la nota es mayor o igual a 13, el estudiante estara aprobado.

Si la nota es menor que 13, estara desaprobado.

Ademas, calcularemos el promedio general de las notas.

Asi tendremos un programa sencillo, pero bastante completo para practicar programacion orientada a objetos.

---

## [2:35 - 2:50] Transicion a Programiz

**Accion:** Cambia de las diapositivas a Programiz.

**Que decir:**

Ahora pasemos a Programiz para construir el programa.

Vamos a hacerlo por partes.

No se trata de memorizar todo el codigo, sino de entender que funcion cumple cada parte dentro del programa.

---

## [2:50 - 3:15] Importar Scanner

**Accion:** Escribe o pega al inicio del archivo:

```java
import java.util.Scanner;
```

**Que decir:**

Primero escribimos la importacion de Scanner.

Scanner nos permite leer datos que el usuario escriba por teclado.

En nuestro caso, lo usaremos para pedir el nombre y la nota de cada estudiante.

Esta parte corresponde a entrada de datos, porque el programa recibira informacion desde la consola.

Mientras escribimos esto, recordemos que Scanner no viene activado automaticamente. Por eso necesitamos importarlo al inicio.

---

## [3:15 - 3:45] Crear la clase Estudiante

**Accion:** Debajo del import, escribe o pega:

```java
class Estudiante {

}
```

**Que decir:**

Ahora creamos la clase Estudiante.

Esta es una de las partes mas importantes de la leccion, porque aqui empieza la programacion orientada a objetos.

La clase Estudiante sera como el molde.

Ese molde nos dira que datos y que acciones puede tener un estudiante.

A partir de esta clase, luego podremos crear objetos reales, como un estudiante llamado Ana, Carlos o Elena.

---

## [3:45 - 4:25] Atributos privados

**Accion:** Dentro de `class Estudiante`, escribe o pega:

```java
private String nombre;
private int nota;
```

**Que decir:**

Dentro de la clase colocamos los atributos.

Cada estudiante tendra un nombre y una nota.

El nombre sera de tipo String, porque es texto.

La nota sera de tipo int, porque es un numero entero.

Tambien usamos la palabra private.

Esto significa que los datos estaran protegidos dentro de la clase.

Esta idea se llama encapsulacion.

Dicho de forma sencilla, encapsular significa no dejar los datos sueltos, sino mantenerlos controlados dentro del objeto.

---

## [4:25 - 5:05] Constructor

**Accion:** Debajo de los atributos, escribe o pega:

```java
Estudiante(String nombre, int nota) {
    this.nombre = nombre;
    setNota(nota);
}
```

**Que decir:**

Ahora creamos el constructor.

El constructor sirve para crear un estudiante con datos desde el inicio.

Por ejemplo, cuando mas adelante escribamos new Estudiante y le pasemos un nombre y una nota, el constructor recibira esos valores.

La palabra this se refiere al objeto actual.

Entonces, cuando decimos this.nombre, estamos hablando del nombre de ese estudiante especifico.

En el caso de la nota, usamos setNota.

Eso es importante porque no queremos guardar cualquier numero sin revisar.

Primero pasamos por el setter, y el setter decidira si la nota es valida.

---

## [5:05 - 6:10] Getters y setters

**Accion:** Debajo del constructor, escribe o pega:

```java
String getNombre() {
    return nombre;
}

void setNombre(String nombre) {
    this.nombre = nombre;
}

int getNota() {
    return nota;
}

void setNota(int nota) {
    if (nota >= 0 && nota <= 20) {
        this.nota = nota;
    } else {
        this.nota = 0;
    }
}
```

**Que decir:**

Ahora agregamos los getters y setters.

Los getters sirven para obtener datos.

Por ejemplo, getNombre devuelve el nombre del estudiante y getNota devuelve la nota.

Los setters sirven para guardar o modificar datos.

Por ejemplo, setNombre permite cambiar el nombre, y setNota permite guardar la nota.

Pero setNota tiene algo especial.

Dentro de setNota usamos un if.

Si la nota esta entre 0 y 20, se guarda normalmente.

Si la nota esta fuera de ese rango, guardamos 0.

Esto hace que nuestro programa sea mas seguro y ordenado.

Aqui estamos usando varios conceptos juntos: encapsulacion, metodos, parametros, operadores y condicionales.

---

## [6:10 - 6:50] Metodo obtenerResultado

**Accion:** Debajo de los getters y setters, escribe o pega:

```java
String obtenerResultado() {
    if (nota >= 13) {
        return "Aprobado";
    } else {
        return "Desaprobado";
    }
}
```

**Que decir:**

Ahora creamos el metodo obtenerResultado.

Este metodo sera el encargado de decidir si el estudiante aprobo o desaprobo.

Si la nota es mayor o igual a 13, devuelve Aprobado.

Si la nota es menor que 13, devuelve Desaprobado.

Esta parte es importante porque la decision esta dentro del objeto Estudiante.

Eso hace que nuestro programa este mejor organizado.

En vez de calcular el resultado en cualquier parte, dejamos que el propio estudiante sepa cual es su resultado segun su nota.

---

## [6:50 - 7:30] Metodo mostrarDatos

**Accion:** Debajo de `obtenerResultado`, escribe o pega:

```java
void mostrarDatos() {
    System.out.println("Nombre: " + getNombre());
    System.out.println("Nota: " + getNota());
    System.out.println("Resultado: " + obtenerResultado());
    System.out.println("--------------------");
}
```

**Que decir:**

Ahora creamos el metodo mostrarDatos.

Este metodo se encargara de imprimir en consola la informacion del estudiante.

Mostrara el nombre, la nota y el resultado.

Notemos algo importante: aqui usamos getNombre y getNota.

Eso mantiene la idea de encapsulacion, porque accedemos a los datos mediante metodos.

Tambien usamos obtenerResultado para mostrar el resultado calculado.

Entonces, este metodo junta varias acciones y las deja ordenadas en un solo lugar.

---

## [7:30 - 8:00] Crear clase Main y Scanner

**Accion:** Despues de cerrar la clase Estudiante, escribe o pega:

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
```

**Que decir:**

Ahora creamos la clase Main y el metodo main.

El main es el punto de inicio del programa.

Cuando presionemos Run, Java empezara a ejecutar desde aqui.

Dentro del main creamos un Scanner llamado scanner.

Este Scanner nos permitira leer lo que el usuario escriba.

Aqui ya estamos preparando la parte interactiva del registro.

---

## [8:00 - 8:35] Titulo y array de estudiantes

**Accion:** Dentro del main, debajo de `Scanner scanner = new Scanner(System.in);`, escribe o pega:

```java
String titulo = "registro de estudiantes";
System.out.println(titulo.toUpperCase());

Estudiante[] estudiantes = new Estudiante[3];
```

**Que decir:**

Ahora creamos un titulo para el programa.

Usamos un String llamado titulo y luego toUpperCase para mostrarlo en mayusculas.

Esto nos permite practicar cadenas de texto.

Despues creamos un array llamado estudiantes.

Este array tendra tres espacios.

Pero no sera un array de numeros ni de textos.

Sera un array de objetos Estudiante.

Entonces, cada espacio del array podra guardar un estudiante completo, con nombre, nota y resultado.

---

## [8:35 - 9:35] Pedir datos con for

**Accion:** Debajo del array, escribe o pega:

```java
for (int i = 0; i < estudiantes.length; i++) {
    System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese la nota del estudiante " + (i + 1) + ":");
    int nota = scanner.nextInt();
    scanner.nextLine();

    estudiantes[i] = new Estudiante(nombre, nota);
}
```

**Que decir:**

Ahora usamos un for para pedir los datos de los estudiantes.

Este for se repetira una vez por cada espacio del array.

Primero pedimos el nombre del estudiante.

Luego pedimos la nota.

Despues usamos scanner.nextLine para limpiar la entrada y evitar problemas al leer el siguiente nombre.

Finalmente creamos un nuevo objeto Estudiante y lo guardamos en la posicion actual del array.

Esta parte es muy importante porque aqui se unen varias ideas.

Usamos entrada de datos con Scanner, repeticion con for, creacion de objetos con new, y almacenamiento en un array.

En pocas palabras, el usuario escribe los datos y el programa crea estudiantes automaticamente.

---

## [9:35 - 10:25] Mostrar lista y calcular promedio

**Accion:** Debajo del primer for, escribe o pega:

```java
System.out.println();
System.out.println("LISTA FINAL DE ESTUDIANTES");

int sumaNotas = 0;

for (int i = 0; i < estudiantes.length; i++) {
    estudiantes[i].mostrarDatos();
    sumaNotas = sumaNotas + estudiantes[i].getNota();
}

double promedio = sumaNotas / 3.0;

System.out.println("Promedio general: " + promedio);
```

**Que decir:**

Ahora mostramos la lista final de estudiantes.

Primero creamos la variable sumaNotas.

Esta variable servira para acumular las notas.

Luego usamos otro for para recorrer el array.

En cada vuelta, mostramos los datos del estudiante usando mostrarDatos.

Despues sumamos su nota usando getNota.

Al final calculamos el promedio.

Usamos 3.0 para que el resultado pueda salir con decimales.

Aqui estamos usando operadores, variables, metodos y arrays para obtener un resultado final.

---

## [10:25 - 10:45] Cerrar Scanner y ejecutar

**Accion:** Al final del main, antes de cerrar las llaves, escribe o pega:

```java
scanner.close();
```

**Que decir:**

Al final cerramos el Scanner.

Esto se hace cuando ya no vamos a leer mas datos.

Ahora ejecutamos el programa.

**Accion:** Presiona Run y escribe un ejemplo:

```text
Ana
18
Carlos
12
Elena
19
```

**Que decir:**

Ingresamos tres estudiantes con sus notas.

La consola nos mostrara el titulo, luego la lista final, el resultado de cada estudiante y el promedio general.

Con esto ya tenemos un programa basico basado en programacion orientada a objetos.

---

## [10:45 - 11:20] Diapositiva 5 - Buenas practicas

**Accion:** Vuelve a las diapositivas y muestra la diapositiva 5.

**Que decir:**

Antes de terminar, repasemos algunas buenas practicas.

Primero, usar nombres claros.

Por ejemplo, nombre, nota, estudiantes y promedio se entienden mejor que letras sueltas.

Segundo, mantener el codigo ordenado.

Las llaves y los espacios ayudan mucho a leer el programa.

Tercero, probar poco a poco.

No conviene escribir todo el programa y recien al final revisar si funciona.

Y cuarto, evitar repetir codigo innecesariamente.

Si algo se repite mucho, podemos usar metodos o bucles.

Programar bien no es solo hacer que el codigo funcione, tambien es hacer que otra persona pueda entenderlo.

---

## [11:20 - 11:50] Diapositiva 6 - Errores comunes

**Accion:** Cambia a la diapositiva 6.

**Que decir:**

Tambien debemos tener cuidado con algunos errores comunes.

Uno es olvidar el punto y coma al final de una instruccion.

Otro es escribir mal System.out.println.

Java distingue entre mayusculas y minusculas, asi que no es lo mismo escribir String con S mayuscula que string con s minuscula.

Tambien puede pasar que confundamos las llaves de apertura y cierre.

Y en los arrays, debemos recordar que las posiciones empiezan desde cero.

Si un array tiene tres espacios, las posiciones son 0, 1 y 2. No existe la posicion 3.

---

## [11:50 - 12:00] Cierre final

**Accion:** Muestra la diapositiva final o deja la diapositiva 6.

**Que decir:**

Con esto terminamos la leccion 10.

Hoy construimos un registro de estudiantes usando programacion orientada a objetos.

Aplicamos variables, Scanner, if, for, metodos, clases, objetos, encapsulacion, getters, setters, arrays y cadenas.

Lo importante es practicar paso a paso y entender que hace cada parte del programa.

Gracias por acompañar esta leccion.
