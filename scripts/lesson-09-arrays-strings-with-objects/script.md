# Script — Leccion 9: Arrays y cadenas con objetos

**Duracion objetivo**: 7 minutos  
**Editor a mostrar en pantalla**: Programiz Java Online  
**Formato**: Diapositivas + practica guiada en Programiz

---

## Estructura general

- 0:00 - 1:35 -> Diapositivas
- 1:35 - 6:45 -> Programiz
- 6:45 - 7:00 -> Ejecucion y cierre

---

## [0:00 - 0:20] Diapositiva 1 - Portada

**Accion:** Muestra la diapositiva de bienvenida.

**Que decir:**

Hola, bienvenidos a la leccion 9.

En esta leccion aprenderemos una idea muy importante en Java: como organizar varios datos usando arrays y cadenas, y como combinar eso con objetos.

Lo haremos de forma sencilla, con un ejemplo de estudiantes, para que se entienda paso a paso.

---

## [0:20 - 0:45] Diapositiva 2 - ¿Por que guardar varios datos?

**Accion:** Cambia a la diapositiva 2.

**Que decir:**

Imaginemos que queremos guardar informacion de varios estudiantes.

Si solo tuvieramos un estudiante, podriamos usar una variable. Pero si tenemos varios estudiantes, crear una variable para cada uno seria desordenado.

Por eso necesitamos una forma de guardar datos relacionados en un solo lugar.

Esa forma se llama array.

---

## [0:45 - 1:05] Diapositiva 3 - ¿Que es un array?

**Accion:** Cambia a la diapositiva 3.

**Que decir:**

Un array es como una lista.

La diferencia es que cada espacio de esa lista tiene una posicion.

Algo importante en Java es que las posiciones empiezan desde cero.

Entonces, si tenemos cuatro espacios, sus posiciones serian 0, 1, 2 y 3.

---

## [1:05 - 1:20] Diapositiva 4 - ¿Que es un String?

**Accion:** Cambia a la diapositiva 4.

**Que decir:**

Tambien usaremos String.

Un String sirve para guardar texto.

Por ejemplo, nombres, mensajes o titulos.

Si escribimos "Estudiante", eso es un texto, y en Java lo guardamos usando String.

---

## [1:20 - 1:35] Diapositiva 5 - Arrays + objetos

**Accion:** Cambia a la diapositiva 5.

**Que decir:**

Ahora vamos a juntar las ideas.

Un objeto puede representar algo mas completo, como un estudiante con nombre y nota.

Y un array puede guardar varios estudiantes en una sola lista.

Ahora pasemos a Programiz para verlo funcionando con codigo.

---

## [1:35 - 1:50] Transicion a Programiz

**Accion:** Abre Programiz.

**Que decir:**

Ya estamos en Programiz.

Vamos a construir un ejemplo pequeno.

La idea sera crear una clase llamada Estudiante, luego crear varios estudiantes y guardarlos dentro de un array.

No se preocupen si al inicio parece mucho codigo. Lo vamos a separar en partes.

---

## [1:50 - 2:20] Crear la clase Estudiante

**Accion:** Escribe o pega este bloque.

```java
class Estudiante {

}
```

**Que decir:**

Con esta linea estamos creando la clase Estudiante.

Una clase es como un molde.

Por ejemplo, si queremos crear varios estudiantes, primero necesitamos decirle a Java que datos tendra cada estudiante.

Por ahora, esta clase esta vacia, pero la vamos a completar.

---

## [2:20 - 2:55] Agregar atributos

**Accion:** Dentro de `class Estudiante`, escribe o pega:

```java
String nombre;
int nota;
```

**Que decir:**

Aqui estamos diciendo que cada estudiante tendra dos datos.

El primero es nombre, y usamos String porque el nombre es texto.

El segundo es nota, y usamos int porque la nota sera un numero entero.

Entonces, cada estudiante tendra un nombre y una nota.

---

## [2:55 - 3:40] Crear el constructor

**Accion:** Debajo de los atributos, escribe o pega:

```java
Estudiante(String nombre, int nota) {
    this.nombre = nombre;
    this.nota = nota;
}
```

**Que decir:**

Esta parte se llama constructor.

El constructor sirve para crear un estudiante con sus datos desde el inicio.

Por ejemplo, mas adelante podremos crear un estudiante llamado Ana con nota 15.

La palabra this significa "este objeto".

Entonces, this.nombre significa: el nombre de este estudiante.

Y this.nota significa: la nota de este estudiante.

---

## [3:40 - 4:20] Crear metodo mostrarInfo

**Accion:** Debajo del constructor, escribe o pega:

```java
void mostrarInfo() {
    System.out.println("Nombre: " + nombre + " | Nota: " + nota);
}
```

**Que decir:**

Este metodo se llama mostrarInfo.

La palabra void significa que no va a devolver un resultado, solo va a realizar una accion.

En este caso, la accion es mostrar en pantalla el nombre y la nota del estudiante.

Con esto, nuestra clase Estudiante ya esta lista.

---

## [4:20 - 4:45] Crear el main

**Accion:** Despues de cerrar la clase Estudiante, escribe o pega:

```java
public class Main {
    public static void main(String[] args) {

    }
}
```

**Que decir:**

Esta es la parte donde Java empieza a ejecutar el programa.

Todo lo que coloquemos dentro del main sera lo que Java ejecutara cuando presionemos Run.

---

## [4:45 - 5:15] Usar String

**Accion:** Dentro del main, escribe o pega:

```java
String titulo = "lista de estudiantes";
System.out.println(titulo.toUpperCase());
```

**Que decir:**

Aqui estamos usando un String llamado titulo.

Este String guarda el texto "lista de estudiantes".

Luego usamos toUpperCase.

Eso convierte el texto a mayusculas.

Asi, cuando ejecutemos el programa, el titulo aparecera como "LISTA DE ESTUDIANTES".

---

## [5:15 - 5:50] Crear array de estudiantes

**Accion:** Debajo del titulo, escribe o pega:

```java
Estudiante[] estudiantes = new Estudiante[3];
```

**Que decir:**

Esta linea crea una lista para guardar tres estudiantes.

Los corchetes indican que estamos usando un array.

El numero 3 indica que tendra tres espacios.

Pero recordemos: Java empieza a contar desde cero.

Entonces esos espacios son 0, 1 y 2.

---

## [5:50 - 6:20] Llenar el array

**Accion:** Debajo del array, escribe o pega:

```java
estudiantes[0] = new Estudiante("Ana", 15);
estudiantes[1] = new Estudiante("Luis", 18);
estudiantes[2] = new Estudiante("Carlos", 12);
```

**Que decir:**

En la posicion 0 guardamos a Ana.

En la posicion 1 guardamos a Luis.

Y en la posicion 2 guardamos a Carlos.

Cada vez que usamos new Estudiante, estamos creando un nuevo objeto de la clase Estudiante.

---

## [6:20 - 6:45] Recorrer array con for

**Accion:** Debajo de los estudiantes, escribe o pega:

```java
for (int i = 0; i < estudiantes.length; i++) {
    estudiantes[i].mostrarInfo();
}
```

**Que decir:**

Este for nos ayuda a recorrer la lista sin repetir codigo.

Primero i vale 0, luego vale 1 y luego vale 2.

estudiantes[i] significa: el estudiante que esta en esa posicion.

Y mostrarInfo muestra sus datos en pantalla.

---

## [6:45 - 7:00] Ejecucion y cierre

**Accion:** Presiona Run.

**Que decir:**

Como vemos, aparece el titulo en mayusculas y luego la informacion de cada estudiante.

Para cerrar la leccion, recordemos tres ideas.

String sirve para guardar texto.

Array sirve para guardar varios datos en una lista.

Y los objetos nos permiten representar elementos mas completos, como estudiantes con nombre y nota.

Al juntar estas ideas, podemos crear programas mas ordenados y faciles de entender.
