# Fundamentos de Java

## Resumen del Curso

Este curso de aproximadamente 70 minutos introduce a estudiantes de secundaria a la programación con Java y a los conceptos básicos de la Programación Orientada a Objetos (POO). **¡No requiere descargas ni instalaciones!** Solo necesitas abrir tu navegador web.

**Duración total**: ~70 minutos  
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: Solo tu navegador web (Chrome, Firefox, Safari o Edge)  
**Editor en línea**: [Programiz Java Online](https://www.programiz.com/java-programming/online-compiler/) — no requiere registro  
**Repositorio de código fuente**: [https://github.com/upc-pre-202610-1asi0729-17952-VitaSync/java-fundamentals-course-vitasync](https://github.com/upc-pre-202610-1asi0729-17952-VitaSync/java-fundamentals-course-vitasync)

---

## Secuencia de la Lección

### Lección 1: Introducción a la programación y Java (5 minutos)

- **Descripción**: Descubre qué es la programación y por qué Java está en todos lados: videojuegos, aplicaciones móviles y más. Conoce el editor en línea y escribe tu primer programa, el clásico "¡Hola, Mundo!".
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - Programar es darle instrucciones paso a paso a una computadora
  - Java está en videojuegos (Minecraft), apps Android y sistemas empresariales
  - Todo programa Java empieza con un método `main`
  - `System.out.println()` muestra texto en la consola
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-01_ Introduction to programming and Java/HolaMundo_started.java`

---

### Lección 2: Variables y Tipos de Datos (5 minutos)

- **Descripción**: Aprende cómo Java "recuerda" información usando variables. Usaremos la analogía de cajas con etiqueta para entender los tipos de datos más comunes: números, texto, decimales y verdadero/falso.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - Una variable es como una caja con nombre donde guardas un dato
  - `int` guarda números enteros (15, 100, -3)
  - `String` guarda texto ("Hola", "Java")
  - `double` guarda números con decimales (1.65, 3.14)
  - `boolean` solo puede ser `true` o `false`
  - Se declara así: `int edad = 15;`
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-02_ Variables, Data Types/Variables_started.java`

---

### Lección 3: Operadores y Expresiones (5 minutos)

- **Descripción**: Aprende a usar operadores aritméticos y lógicos para combinar datos y resolver problemas sencillos. Verás cómo Java realiza cálculos y toma decisiones simples con expresiones.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - Operadores aritméticos: `+`, `-`, `*`, `/`, `%`
  - Operadores de comparación: `==`, `!=`, `>`, `<`, `>=`, `<=`
  - Operadores lógicos: `&&` (y), `||` (o), `!` (no)
  - Una expresión combina variables y operadores para producir un resultado
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-03/`

---

### Lección 4: Estructuras de Control — if-else y Bucles (6 minutos)

- **Descripción**: Enseña a tu programa a tomar decisiones con `if-else` y a repetir acciones automáticamente con los bucles `for` y `while`. Ejemplo práctico: un programa que detecta si un número es par o impar y lo repite 5 veces.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - `if` ejecuta código solo si una condición es verdadera
  - `else` es el camino alternativo cuando la condición es falsa
  - El bucle `for` repite un bloque un número fijo de veces
  - El bucle `while` repite mientras una condición siga siendo verdadera
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-04/`

---

### Lección 5: Métodos y Parámetros (8 minutos)

- **Descripción**: Aprende qué son los métodos (funciones en Java), cómo pasarles información mediante parámetros y cómo devolver resultados. Los métodos son la clave para organizar el código y evitar repetirlo.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - Un método es un bloque de código con nombre que realiza una tarea
  - Los parámetros son los datos que le pasamos al método
  - `return` devuelve un resultado al código que llamó al método
  - `void` indica que el método no devuelve ningún valor
  - Los métodos evitan duplicar código (principio DRY)
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-05-functions-and-parameters/source-code.java`

---

### Lección 6: Entrada y Salida Básica con Scanner (8 minutos)

- **Descripción**: Haz que tus programas interactúen con el usuario: aprende a leer datos ingresados por teclado usando `Scanner` y a mostrar respuestas personalizadas en pantalla.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - `Scanner` es la clase de Java para leer entrada del usuario
  - `nextLine()` lee una línea de texto completa
  - `nextInt()` lee un número entero
  - `System.out.println()` muestra el resultado en consola
  - Siempre cerrar el Scanner con `entrada.close()`
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-06-input-output/source-code.java`

---

### Lección 7: Introducción a la POO — Clases y Objetos (8 minutos)

- **Descripción**: Da el gran salto a la Programación Orientada a Objetos. Aprende qué son las clases y los objetos, cómo definir atributos y comportamientos, y cómo crear tus propios tipos de datos.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - Una clase es el molde; un objeto es el resultado creado a partir de ese molde
  - Los atributos describen las características del objeto (nombre, edad, etc.)
  - Los métodos describen los comportamientos del objeto
  - El constructor inicializa el objeto cuando se crea con `new`
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-07/`

---

### Lección 8: Principios de POO — Encapsulación (8 minutos)

- **Descripción**: Aprende uno de los pilares de la POO: la encapsulación. Descubre cómo proteger los datos de una clase usando `private` y cómo acceder a ellos de forma controlada con getters y setters.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - `private` oculta los atributos para que no se modifiquen desde fuera
  - Un **getter** es un método que devuelve el valor de un atributo
  - Un **setter** es un método que asigna un nuevo valor con validación
  - La encapsulación protege la integridad de los datos del objeto
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-08/`

---

### Lección 9: Estructuras de Datos Simples — Arrays (7 minutos)

- **Descripción**: Aprende a almacenar y manipular colecciones de datos usando arrays. Verás cómo integrar arrays con objetos para representar conjuntos de información del mundo real.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - Un array guarda varios valores del mismo tipo en una sola variable
  - Se declara así: `int[] numeros = new int[5];`
  - Se accede por índice: `numeros[0]` es el primer elemento
  - `array.length` devuelve la cantidad de elementos
  - Se puede recorrer con un bucle `for`
- **Práctica**: [Abrir ejercicio en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-09/`

---

### Lección 10: Proyecto Final y Mejores Prácticas (12 minutos)

- **Descripción**: Junta todo lo aprendido para construir un programa completo basado en POO: un registro de estudiantes o un juego de adivinanzas con clases. Además, repasamos los errores más comunes y las buenas prácticas que todo programador principiante debe conocer.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE_PENDIENTE)
- **Conclusiones clave**:
  - Integrar clases, objetos, arrays y Scanner en un solo programa
  - Nombrar variables y métodos de forma clara y descriptiva
  - Errores comunes: NullPointerException, ArrayIndexOutOfBoundsException
  - Indentación y legibilidad del código
  - Próximos pasos: herencia, polimorfismo, interfaces
- **Proyecto Final**: [Abrir en Programiz](https://www.programiz.com/java-programming/online-compiler/)
  - Código de inicio: `starter-files/lesson-10/`

---

## Recursos Adicionales

**Código fuente completo**: [Repositorio de GitHub](https://github.com/upc-pre-202610-1asi0729-17952-VitaSync/java-fundamentals-course-vitasync)

**Todas las actividades prácticas**:

| Lección | Tema | Duración | Código de inicio | Ejemplo completo | Editor en línea |
|---------|------|----------|------------------|------------------|-----------------|
| 1 | Introducción a la programación y Java | 5 min | `starter-files/lesson-01/HolaMundo_started.java` | `completed-examples/lesson-01/HolaMundo.java` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 2 | Variables y Tipos de Datos | 5 min | `starter-files/lesson-02/Variables_started.java` | `completed-examples/lesson-02/Variables.java` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 3 | Operadores y Expresiones | 5 min | `starter-files/lesson-03/` | `completed-examples/lesson-03/` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 4 | Estructuras de Control — if-else y Bucles | 6 min | `starter-files/lesson-04/` | `completed-examples/lesson-04/` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 5 | Métodos y Parámetros | 8 min | `starter-files/lesson-05/source-code.java` | `completed-examples/lesson-05/source-code.java` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 6 | Entrada y Salida Básica con Scanner | 8 min | `starter-files/lesson-06/source-code.java` | `completed-examples/lesson-06/source-code.java` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 7 | Introducción a la POO — Clases y Objetos | 8 min | `starter-files/lesson-07/` | `completed-examples/lesson-07/` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 8 | Principios de POO — Encapsulación | 8 min | `starter-files/lesson-08/` | `completed-examples/lesson-08/` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 9 | Estructuras de Datos Simples — Arrays | 7 min | `starter-files/lesson-09/` | `completed-examples/lesson-09/` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |
| 10 | Proyecto Final y Mejores Prácticas | 12 min | `starter-files/lesson-10/` | `completed-examples/lesson-10/` | [Programiz](https://www.programiz.com/java-programming/online-compiler/) |

**Recursos de consulta**:
- [Programiz Java Online Compiler](https://www.programiz.com/java-programming/online-compiler/) — editor en línea gratuito, sin registro
- [Documentación oficial de Java (en inglés)](https://docs.oracle.com/en/java/) — referencia completa del lenguaje
- [W3Schools Java Tutorial](https://www.w3schools.com/java/) — tutoriales interactivos en inglés

**¡Gracias por completar el curso!**

---

## Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202610  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 17952

**Nombre del equipo**: VitaSync  
**Líder del equipo**: León Morales, Johan Yonel  
**Integrantes del equipo**:
- Güere Calero, Fernando Julio (u2024113169)
- Montes Zamora, Edgar Alexander Mauricio (u20241e126)
- Garcia Villanueva, Leonardo Rafael (u20231h059)
- León Morales, Johan Yonel (u20231h055)
- Lozano Leon, Richard Enrique (u20241d990)

**Fecha de entrega**: Semana 12
