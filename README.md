# El despertar del héroe ( PROYECTO-PR-LM-ED )

Juego de aventura en terminal desarrollado en **Java**. El jugador le da nombre a su héroe y este recibe armas y pociones de Aleister (narrador), y se enfrenta por turnos a tres enemigos para rescatar a su hija. Al terminar la partida se guarda la puntuación en un ranking que permanece guardado (`XML/ranking.xml`).

Proyecto de 1.º de DAM (Programación, Entornos de Desarrollo y Lenguajes de Marcas).

## Descripción

- Menú principal: **Nueva partida**, **Ranking**, **Ayuda** y **Salir**.
- Tres combates por turnos contra **Tralalero Tralala**, **Ballerina Capuccina** y **Gamranma** (batalla final).
- En cada turno puedes: revisar el inventario (no gasta turno), atacar con un arma o con los puños, curarte con una poción o abandonar la partida. Se atacará obligatoriamente con los puños si el usuario intenta usar un arma rota o introduce unas coordenadas incorrectas.
- Los enemigos se enfurecen cuando les queda poca vida pero no varían sus estadísticas.
- Por el camino puedes encontrar armas (bate, katana, bate de pinchos) o pociones extra al azar.
- Puntuación: **+100 por cada enemigo derrotado**, más un **bonus sacado de la cantidad de vida** con la que termines la partida.
- Si pierdes o abandonas, la partida se registra en el ranking y vuelves al menú principal.
- El ranking guarda las **10 mejores puntuaciones**, ordenadas de mayor a menor, en el archivo `XML/ranking.xml` (validado con su DTD `XML/ranking.dtd`).

## Requisitos

- **Java JDK 17 o superior** (desarrollado con JDK 26; solo se usa la librería estándar, no hace falta ninguna dependencia externa).
- Una terminal (PowerShell, Bash) o un IDE (Visual Studio Code con extensiones de Java y XML/XSLT).

Para comprobar tu versión de Java:

```bash
java -version
```

## Estructura del proyecto

```text
├── JAVA/                  # Código fuente del juego en Java
│   ├── Historia.java      # Clase principal: menú, historia, combates y ranking
│   ├── Personajes.java    # Clase base de todos los personajes
│   ├── TripleT.java       # El héroe (implementa IAcciones)
│   ├── IAcciones.java     # Interfaz con las acciones del héroe
│   ├── Tralalero.java     # Enemigo 1 (hereda de Personajes)
│   ├── BallerinaC.java    # Enemigo 2 (hereda de Personajes)
│   ├── Gamranma.java      # Jefe final (hereda de Personajes)
│   ├── IEnemigos.java     # Interfaz con las acciones de los enemigos
│   ├── Armas.java         # Clase base de las armas
│   ├── Bate.java          # Subclase de arma (Bate)
│   ├── Espada.java        # Subclase de arma (Espada / Katana)
│   ├── Pocion.java        # Pociones de curación
│   └── Inventario.java    # Mochila con arrays fijos de armas y pociones
├── XML/                   # Persistencia, validación y publicación web
│   ├── ranking.xml        # Datos del ranking guardados
│   ├── ranking.dtd        # DTD externa que valida ranking.xml
│   ├── ranking.xsl        # Hoja de estilos XSLT para generar la tabla HTML
│   ├── ranking_table.html # Tabla HTML generada mediante XSLT
│   ├── ranking_CSS.css    # Hoja de estilos CSS externa
│   ├── consultas_xpath.md # Las 5 consultas XPath documentadas
│   └── errores_dtd/       # Copias de prueba con errores estructurales
└── Photos/                # Imágenes de los personajes para el README
```

## Cómo compilar y ejecutar (Java)

1. Clona o descarga el repositorio y descomprímelo.
2. Abre una terminal en la **carpeta raíz del proyecto** (donde están las carpetas `JAVA` y `XML` al mismo nivel).
3. Compila todos los archivos `.java`:

   ```bash
   javac JAVA/*.java
   ```

4. Ejecuta el programa indicando el classpath `-cp JAVA`:

   ```bash
   java -cp JAVA Historia
   ```

También puedes abrir la carpeta raíz en Visual Studio Code y pulsar **Run** sobre `JAVA/Historia.java`.

> **Importante:** El programa lee y guarda los datos en la ruta relativa `XML/ranking.xml`. Por ello, es necesario ejecutarlo desde la **carpeta raíz** del proyecto para que encuentre la carpeta `XML/`. Para restablecer una copia de prueba vacía o inicial, basta con editar o sustituir `XML/ranking.xml` manteniendo la etiqueta raíz `<ranking></ranking>`.

## Validación XML, XPath y Transformación XSLT

Para trabajar con los archivos de la carpeta `XML/` desde Visual Studio Code (con la extensión *XML* de Red Hat y *XSLT/XPath for Visual Studio Code*):

1. **Validación con DTD (`XML/ranking.dtd`):**
   - Abre `XML/ranking.xml` en VS Code. La declaración `<!DOCTYPE ranking SYSTEM "ranking.dtd">` vincula automáticamente la DTD externa y valida la estructura en tiempo real.
   - En `XML/errores_dtd/` se incluyen dos ejemplos con errores estructurales aislados para comprobar la detección de fallos.

2. **Consultas XPath (`XML/consultas_xpath.md`):**
   - Abre `XML/ranking.xml`, abre la paleta de comandos (`Ctrl + Shift + P` o `F1`), selecciona **XPath: Evaluate XPath** e introduce cualquiera de las expresiones recogidas en `XML/consultas_xpath.md`.

3. **Generación de tabla HTML y CSS (`XML/ranking.xsl`):**
   - Abre `XML/ranking.xml`, pulsa `F1` y selecciona **XSLT: Quick run XSLT on this xml file**.
   - Elige `XML/ranking.xsl` como hoja de transformación y guarda la salida como `XML/ranking_table.html`.
   - Abre `XML/ranking_table.html` en cualquier navegador para ver la tabla con los estilos aplicados desde `XML/ranking_CSS.css`.

## Personajes

| Triplet (héroe) | Tralalero | Ballerina | Gamranma |
|:---:|:---:|:---:|:---:|
| <img src="Photos/triplet.jpg" alt="Triplet" width="200"> | <img src="Photos/tralalero.png" alt="Tralalero" width="200"> | <img src="Photos/ballerina.jpg" alt="Ballerina" width="200"> | <img src="Photos/gamranma.jpg" alt="Gamranma" width="200"> |

## Autor

**Andy Malacatus Sanchez**, 1.º DAM.