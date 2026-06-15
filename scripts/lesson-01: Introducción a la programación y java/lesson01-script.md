# Script — Lección 1: ¿Qué es Java y la Programación?

**Duración objetivo**: 5 minutos  
**Editor a mostrar en pantalla**: Programiz Java Online  
**Formato**: Narración en off + grabación de pantalla

---

## PARTE 1 — Gancho inicial [0:00 – 0:35]


> "¿Alguna vez te preguntaste cómo funciona un videojuego como Minecraft?  
> ¿O cómo funciona la aplicación de tu teléfono que usas todos los días?  
> Detrás de todo eso hay un lenguaje de programación llamado **Java**.  
> Y hoy vas a dar tus primeros pasos con él."

---

## PARTE 2 — ¿Qué es programar? [0:35 – 1:30]


> "Piensa en una receta de cocina.  
> Para hacer una torta, sigues pasos en orden: mezclar, hornear, decorar.  
> **Programar es exactamente eso**: darle instrucciones paso a paso a una computadora para que haga algo.  
> La diferencia es que la computadora sigue tus instrucciones al pie de la letra, sin adivinar nada.  
> Entonces tienes que ser muy claro y preciso."


> "A ese conjunto de instrucciones lo llamamos **programa** o **código**."

---

## PARTE 3 — ¿Qué es Java? [1:30 – 2:15]


> "Java es un lenguaje de programación creado en 1995.  
> Hoy en día se usa para:
> - Crear aplicaciones de Android.
> - Desarrollar videojuegos como Minecraft.
> - Construir sistemas bancarios y sitios web.
>
> Es uno de los lenguajes más populares del mundo y es perfecto para aprender a programar  
> porque te enseña a pensar de forma ordenada."

---

## PARTE 4 — Abrimos el editor en línea [2:15 – 2:45]


> "Lo mejor de todo: no necesitas instalar nada.  
> Vamos a usar **Programiz**, un editor de Java que funciona directamente en tu navegador.  
> Abre tu navegador —Chrome, Firefox, Edge, el que tengas— y entra a esta dirección."


> "Verás una pantalla con un área de código a la izquierda y el resultado a la derecha.  
> Aquí es donde vamos a escribir todos nuestros programas."

---

## PARTE 5 — Estructura básica de un programa Java [2:45 – 3:30]


> "Todo programa en Java sigue esta estructura base.  
> Primero escribimos el nombre de la clase —por ahora solo recuerda que debe coincidir con el nombre del archivo—.  
> Luego viene el método `main`. Esta es la puerta de entrada: cuando ejecutas el programa, Java empieza a leer desde aquí."

```java
public class HolaMundo {
    public static void main(String[] args) {
        // aquí van las instrucciones
    }
}
```


> "No te preocupes si no entiendes todo ahora. Con la práctica va a tener más sentido.  
> Lo importante hoy es que sepas dónde escribir tus instrucciones: **dentro de las llaves del `main`**."

---

## PARTE 6 — Hola Mundo [3:30 – 4:30]


> "Vamos a escribir nuestra primera instrucción.  
> Para mostrar texto en pantalla usamos:  
> `System.out.println()` — dentro de los paréntesis, ponemos el texto entre comillas."


```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
        System.out.println("¡Bienvenido a Java!");
    }
}
```


> "Ahora presionamos el botón **Run**.  
> ¡Y ahí está! El programa imprimió exactamente lo que le dijimos.  
> Acabas de escribir tu primer programa en Java. ¡Felicitaciones!"

---

## PARTE 7 — Cierre [4:30 – 5:00]


> "En esta lección aprendiste:
> - Qué es programar: dar instrucciones a una computadora.
> - Qué es Java y para qué se usa.
> - La estructura básica de un programa Java.
> - Cómo usar `System.out.println()` para mostrar texto.
>
> En la siguiente lección aprenderás a guardar información en tu programa usando **variables**.  
> ¡Nos vemos ahí!"
