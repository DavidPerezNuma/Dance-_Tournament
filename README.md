# Dance Tournament

El proyecto "Dance Tournament" es una aplicación en Java que calcula la puntuación final en una competencia de danza. La puntuación final se obtiene a partir de cuatro puntuaciones dadas por jueces, excluyendo la puntuación más baja y calculando el promedio de las tres puntuaciones restantes.

## Estructura del Proyecto

La estructura del proyecto es la siguiente:

```bash
dance-tournament/
│
├── bin/
│   └── (archivos .class compilados, generados automáticamente después de compilar)
│
├── lib/
│   └── (librerías adicionales necesarias para el proyecto, actualmente vacía)
│
├── src/
│   └── App.java   # Contiene el código fuente del programa.
│
├── .gitignore      # Archivo para especificar qué archivos o carpetas deben ser ignorados por Git.
└── README.md       # Este archivo, que proporciona información sobre el proyecto.
```

- **`bin/`**: Carpeta donde se almacenan los archivos `.class` compilados. Estos archivos son generados automáticamente después de compilar el código fuente. No debes modificar estos archivos directamente.

- **`lib/`**: Carpeta destinada a librerías adicionales que el proyecto podría requerir en el futuro. Actualmente, esta carpeta está vacía.

- **`src/App.java`**: Archivo principal del proyecto que contiene el código fuente del programa. Aquí es donde se encuentra la lógica del programa para calcular la puntuación final de la competencia de danza.

- **`.gitignore`**: Archivo que define qué archivos y carpetas deben ser ignorados por Git cuando se realiza el seguimiento de cambios. Generalmente, esto incluye archivos generados automáticamente, archivos temporales, y configuraciones locales.

- **`README.md`**: Archivo que proporciona una descripción del proyecto, instrucciones para su uso, y otra información relevante.

## Requisitos

- JDK 11 o superior.

## Cómo Ejecutar el Programa

### 1. Compilar el Programa

Para compilar el código fuente, abre una terminal y navega al directorio del proyecto. Luego ejecuta el siguiente comando:

```bash 
javac -d bin src/App.java
```

Este comando compilará `App.java` y colocará el archivo `.class` resultante en la carpeta `bin`.

### 2. Ejecutar el Programa

Después de compilar, puedes ejecutar el programa usando el siguiente comando:

```bash
java -cp bin App
```

El programa te pedirá que ingreses cuatro puntuaciones. 

## Ejemplos de Uso

### Ejemplo 1

**Entrada:**

```bash
Ingrese la puntuación del juez 1: 8
Ingrese la puntuación del juez 2: 9
Ingrese la puntuación del juez 3: 7
Ingrese la puntuación del juez 4: 10
```

**Salida:**

```bash
La puntuación promedio de las tres puntuaciones más altas es: 9.00
```

### Ejemplo 2

**Entrada:**

```bash
Ingrese la puntuación del juez 1: 5
Ingrese la puntuación del juez 2: 11
Ingrese la puntuación del juez 3: 7
Ingrese la puntuación del juez 4: 8
```

**Salida:**

```bash
Error: Una o más puntuaciones no son válidas.
```

### Ejemplo 3

**Entrada:**

```
Ingrese la puntuación del juez 1: 0
Ingrese la puntuación del juez 2: 0
Ingrese la puntuación del juez 3: 0
Ingrese la puntuación del juez 4: 0
```

**Salida:**

```
La puntuación promedio de las tres puntuaciones más altas es: 0.00
```

## Notas

- Asegúrate de ingresar puntuaciones en el rango de 0 a 10. El programa validará las puntuaciones y mostrará un mensaje de error si alguna puntuación no es válida.
- Si encuentras problemas al compilar o ejecutar el programa, verifica que el JDK esté correctamente instalado y que las rutas sean las adecuadas.
