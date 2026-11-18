
# El despertar del héroe ( PROYECTO-PR-LM-ED )

Juego de aventura en terminal desarrollado en **Java**. El jugador le da nombre a su héroe y este recibe armas y pociones de Aleister (narrador) , y se enfrenta por turnos a tres enemigos para rescatar a su hija. Al terminar la partida se guarda la puntuación en un ranking que permanece guardado (`ranking.xml`).

Proyecto de 1.º de DAM (Programación, Entornos de Desarrollo y Lenguajes de Marcas).

## Descripción

- Menú principal: **Nueva partida**, **Ranking**, **Ayuda** y **Salir**.
- Tres combates por turnos contra **Tralalero Tralala**, **Ballerina Capuccina** y **Gamranma** (batalla final).
- En cada turno puedes: revisar el inventario (no gasta turno), atacar con un arma o con los puños, curarte con una poción o abandonar la partida. Se atacará obligatoriamente con los puños si el usuario intenta usar un arma rota o introduce unas coordenadas incorrectas.
- Los enemigos se enfurecen cuando les queda poca vida pero no varían sus estadísticas.
- Por el camino puedes encontrar armas (bate, katana, bate de pinchos) o pociones extra al azar.
- Puntuación: **+100 por cada enemigo derrotado**, más un **bonus sacado de la cantidad de vida** con la que termines la partida.
- Si pierdes o abandonas, la partida se registra en el ranking y vuelves al menú principal.
- El ranking guarda las **10 mejores puntuaciones**, ordenadas de mayor a menor, en el archivo `ranking.xml` (con su DTD `ranking.dtd`).

## Requisitos

- **Java JDK 17 o superior** (funciona con cualquier JDK reciente; solo se usa la librería estándar, no hace falta ninguna dependencia externa).
- Una terminal o un IDE (VS Code, IntelliJ, Eclipse...).

Para comprobar tu versión de Java:

```bash
java -version
```

## Cómo ejecutarlo

1. Clona o descarga el repositorio.
2. Abre una terminal en la carpeta donde están los archivos `.java`.
3. Compila todo:

   ```bash
   javac *.java
   ```

4. Ejecuta el programa (la clase principal es `Historia`):

   ```bash
   java Historia
   ```

También puedes abrir la carpeta en VS Code o en tu IDE y pulsar **Run** sobre `Historia.java`.

> **Importante:** `ranking.xml` se crea y se lee en la carpeta desde la que ejecutas el programa. Si usas un IDE, normalmente es la raíz del proyecto. Mantén `ranking.dtd` en esa misma carpeta.

## Estructura del proyecto

| Archivo | Qué contiene |
|---|---|
| `Historia.java` | Clase principal: menú, historia, combates (`simularCombate`) y ranking |
| `Personajes.java` | Clase base de todos los personajes |
| `TripleT.java` | El héroe (implementa `IAcciones`) |
| `IAcciones.java` | Interfaz con las acciones del héroe |
| `Tralalero.java`, `BallerinaC.java`, `Gamranma.java` | Enemigos (heredan de `Personajes`) |
| `Armas.java`, `Bate.java`, `Espada.java` | Armas del héroe |
| `Pocion.java` | Pociones de curación |
| `Inventario.java` | Mochila con armas y pociones |
| `ranking.xml` | Ranking guardado (se genera al jugar) |
| `ranking.dtd` | DTD que valida el ranking |

## Personajes basados en: 

## Personajes

| TripleT (héroe) | Tralalero | BallerinaC | Gamranma |
|----| |----| |---| |---|
| [TripleT](Photos/triplet.jpg) | [Tralalero](Photos/tralalero.png) | [BallerinaC](Photos/ballerina.jpg) | [Gamranma](Photos/gamranma.jpg)


## Autor

**Andy Malacatus Sanchez**, 1.º DAM.