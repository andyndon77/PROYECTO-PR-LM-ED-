import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.Scanner;
import java.util.Random;

public class Historia 
{
    static final int MAX_RANKING = 10;
    public static void main(String[] args) throws InterruptedException  //agregamos esta cosa final para que los mensajes no aparezcan todos de golpe
    {

        int max = 100;
        boolean mainMenu = true;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] nombres = new String[MAX_RANKING];
        int[] puntos = new int[MAX_RANKING];
        int total = cargarRanking(nombres, puntos);
        boolean rankingValido = true;
        if(total < 0)
        {
            rankingValido = false;
            total = 0;
        }

        while(mainMenu == true)
        {
            System.out.println("Hola buenos dias nuevo aventurero. A donde quieres ir ahora?:" + " 1.Nueva partida " + " 2.Ranking " + " 3.Ayuda" + " 4.Salir del juego ");
            int respuesta = sc.nextInt();

            boolean ranking = false;
            boolean aventura = false;
            boolean ayuda = false;
            switch(respuesta)
            {
                case 1: System.out.println("Comenzando historia...");
                        System.out.println("");
                        Thread.sleep(1000); 
                        System.out.println("Vamos a comenzar la historia. ");
                        aventura = true;
                        mainMenu = false;
                    break;
                case 2: System.out.println("Bienvenido al apartado de Ranking. Aqui veras las 5 mejores puntuaciones de tus partidas anteriores.");
                        ranking = true;
                        mainMenu = false;
                    break;
                case 3: System.out.println("Si estas aqui es porque necesitas ayuda. Aqui se te mostraran las reglas del juego junto con las acciones posibles durante la partida. ");
                        ayuda = true;
                        mainMenu = false;
                    break;
                case 4: System.out.println("Gracias por haber visitado el juego. Nos veremos en otro momento aventurero");
                        mainMenu = false;
                break;
            } 
            while(aventura == true)
            {
                mainMenu = false;
                ranking = false;

                System.out.println("Veo que has decidio comenzar una historia nueva");
                System.out.println("Una no muy sabia elección aventurero, esto puede ser algo complicado dependiendo de la suerte que tengas.");
                System.out.println("");
                Thread.sleep(2000);

                System.out.print("Dime con que nombre te quieres registrar: ");
                Thread.sleep(1000); 
                String nombre = sc.next();

                System.out.println(" ");
                System.out.println("Unknow: Bienvenido " + nombre + " . Puedes llamarme Aleister y te voy a acompañar en tu nueva aventura");
                TripleT heroe = new TripleT(nombre, 100, 10, 1, 0,true, 0);
                heroe.setNombre(nombre);

                System.out.println("Aleister: Vamos a mi casa " + nombre + ". Alli te explicaré la situación.");
                Thread.sleep(2000);
                System.out.println("De camino...");
                Thread.sleep(2000);
                int posible_Arma1 = random.nextInt(max);
                    if (posible_Arma1 > 60)
                    {
                        System.out.println("*Te tropiezas");
                        Bate bate = new Bate("Bate de Madera", 10, 5, 3);
                        System.out.println("!!Te has encontrado un bate!!");

                        System.out.println("-----------------------------------------");
                        bate.mostrarStats();
                        System.out.println("-----------------------------------------");

                        Thread.sleep(2000);
                            
                        System.out.println("-----------------------------------------");
                        bate.Descripcion();
                        System.out.println("-----------------------------------------");

                        Thread.sleep(2500);
                            
                        System.out.println("Aleister: Hey chico, este bate no es nada malo." + " Aunque parece q no te durara mucho, en caso de que se te rompa siempre puedes usar los puños.");
                        System.out.println("Aleister: JA JA JA JA JA JA");
                        heroe.añadirArma(bate);
                        Thread.sleep(2000);
                    }
                System.out.println("");
                Thread.sleep(2000);
                heroe.caminar();
                
                Thread.sleep(2000);

                System.out.println("Aleister: Esta es mi casa, entra sin miedo");
                
                Thread.sleep(1500);
                
                System.out.println("Unos seres malvados y fuertes me robaron a mi hija. Por favor, rescátala, yo no tengo la fuerza para hacerlo...");
                Thread.sleep(2000);
                System.out.println("===========================================");
                System.out.println("TU: Pero no tengo equipo ni nada. ¿Que se supone que haga?");
                System.out.println("===========================================");
                Thread.sleep(2000);

                System.out.println("Aleister: No te preocupes por eso. Tengo cosas que te servirán en tu camino.");
                
                Thread.sleep(1500);
                System.out.println("Alleister: En caso de q no tengas nada con lo que atacar te puedo dejar un cuchillo.");
                Armas cuchillo = new Armas("Cuchillo de cocina", 5, 8);
                heroe.añadirArma(cuchillo);
                Thread.sleep(2000);

                System.out.println("===========================================");
                System.out.println("Aleister: Toma 3 pociones de curacion.");
                Pocion pocionNormal = new Pocion(25, 3);
                heroe.añadirPocion(pocionNormal);
                System.out.println("===========================================");
                pocionNormal.MostrarPocion();
                System.out.println("===========================================");
                Thread.sleep(3000);

                System.out.println("Aleister: Y una superpocion");
                System.out.println("");
                Pocion pocionSuper = new Pocion(40, 1);
                heroe.añadirPocion(pocionSuper);
                System.out.println("===========================================");
                pocionSuper.MostrarPocion();
                System.out.println("===========================================");
                Thread.sleep(3000);

                System.out.println("");
                System.out.println("Aleister: Con esto ya estas listo");
                Thread.sleep(1000);
                System.out.println("Aleister: Casi se me olvida, toma una mochila para que guardes tus cosas.");
                Thread.sleep(1500);
                System.out.println("");

                System.out.println("Aleister: Venga guardatelo todo y ponte en marcha");

                Thread.sleep(2000);

                System.out.println("===========================================");
                System.out.println("Tu: Juro que traere de vuelta a tu hija Aleister.");
                System.out.println("===========================================");
                Thread.sleep(1000);

                System.out.println("Aleister: No me jures nada, yo voy a acompañarte en tu viaje. Mejor muéstramelo.");
                
                System.out.println("===========================================");
                heroe.caminar();
                System.out.println("===========================================");
                Thread.sleep(2000);
                System.out.println("===========================================");
                heroe.caminar();
                System.out.println("===========================================");

                Thread.sleep(2000);
                System.out.println("===================================================================");
                System.out.println("Aleister: ¡¡¡¡¡¡¡¡¡CUIDADO!!!!!!!!");
                System.out.println("===================================================================");
                //PRIMERA BATALLA
                Tralalero tralalero = new Tralalero("Tralalero",40, 15, 1);
                if(simularCombate(sc, heroe, tralalero) == false)
                {
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("| Volviendo al menu principal |");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    total = registrarRanking(nombres, puntos, total, heroe.getNombre(), heroe.getPuntuacion());
                    if(rankingValido == true)
                    {
                        guardarRanking(nombres, puntos, total);
                    }
                    aventura = false;
                    mainMenu = true;
                    continue;
                }
                heroe.setPuntuacion(heroe.getPuntuacion() + 100);
                Thread.sleep(1000);
                heroe.caminar();
                Thread.sleep(2500);
                int posible_Arma2 = random.nextInt(max);
                System.out.println(" ");
                Thread.sleep(700);
                if(posible_Arma2 < 50)
                {
                    System.out.println("¡¡¡¡¡¡¡TE HAS ENCONTRADO UN ARMA!!!!!!!!!");
                    Bate bate2 = new Bate("Bate de pinchos", 12, 6, 4);
                    heroe.añadirArma(bate2);
                }
                else if(posible_Arma2 >= 50 && posible_Arma2 < 90)
                {
                    System.out.println("¡¡¡¡¡¡¡TE HAS ENCONTRADO UN ARMA!!!!!!!!!");
                    Espada katana = new Espada("Katana Marrana", 10, 8);
                    heroe.añadirArma(katana);
                }
                else
                {
                    System.out.println("BUAAAA QUE BIEEEEN. TE HAS ENCONTRADO UNA SUPER POCION.");
                    pocionSuper.setCantidad(pocionSuper.getCantidad() + 1);
                }
                Thread.sleep(500);
                System.out.println("");

                //SEGUNDA BATALLA
                System.out.println("===================================================================");
                System.out.println("Aleister: ¡¡¡¡¡¡¡¡¡CUIDADO!!!!!!!!");
                BallerinaC ballerina = new BallerinaC("Ballerina", 60, 10, 1);
                System.out.println("===================================================================");
                if(simularCombate(sc, heroe, ballerina) == false)
                {
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("| Volviendo al menu principal |");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    total = registrarRanking(nombres, puntos, total, heroe.getNombre(), heroe.getPuntuacion());
                    if(rankingValido == true)
                    {
                        guardarRanking(nombres, puntos, total);
                    }
                    aventura = false;
                    mainMenu = true;
                    continue;
                }
                heroe.setPuntuacion(heroe.getPuntuacion() + 100);

                heroe.caminar();
                Thread.sleep(2000);
                System.out.print("Tu: Aleister, que te pasa.");
                Thread.sleep(1000);
                System.out.println("¿T-t-te encuentras bien?");
                System.out.println("");
                System.out.println("Aleister: AaAAHHHhhh...");
                System.out.println("Aleister: Muchacho, date prisa ahhh, coge esta poción");
                Pocion megaPocion = new Pocion(60, 1);
                int masMegaPocion = random.nextInt(max);
                Thread.sleep(1000);
                System.out.println("====================================================================");
                if (masMegaPocion < 50)
                {
                    System.out.println("Felicidades has ganado 1 pocion");
                    System.out.println("|1 MEGA POCION|"); 
                    megaPocion.setCantidad(1);
                }
                else if(masMegaPocion >= 50 && masMegaPocion < 70 )
                {
                    System.out.println("Desarrolador: WOOOOOW, has recibido 2 pociones");
                    System.out.println("|2 MEGA POCIONES|");
                    megaPocion.setCantidad(2);
                    
                }
                else
                {
                    System.out.println("Desarrollador: MADRE MIAAA 3 POCIONES RECIBIDAS");
                    System.out.println("|3 MEGA POCIONES|");
                    megaPocion.setCantidad(3);
                }
                System.out.println("====================================================================");
                heroe.añadirPocion(megaPocion);
                Thread.sleep(1200);
                System.out.println("Aleister: AAAAHHHHHHHHHHHHHHHHAAAA...");

                //TERCERA BATALLA
                System.out.println("====================================================================");
                System.out.println("BATALLA FINAL (el enemigo puede hacer un ataque especial)");
                System.out.println("====================================================================");
                Gamranma gamranma = new Gamranma("Gamranma", 80, 20, 1);
                if(simularCombate(sc, heroe, gamranma) == false)
                {
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("| Volviendo al menu principal |");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    total = registrarRanking(nombres, puntos, total, heroe.getNombre(), heroe.getPuntuacion());
                    if (rankingValido == true)
                    {
                        guardarRanking(nombres, puntos, total);
                    }
                    aventura = false;
                    mainMenu = true;
                    continue;
                }
                heroe.setPuntuacion(heroe.getPuntuacion() + 100);

                System.out.println("¡¡¡¡¡¡¡FELICIDADES POR TU VICTORIA!!!!!!!");
                System.out.println("Ahora haremos un recuento de tus puntos finales");

                Thread.sleep(500);
                System.out.println("...");
                Thread.sleep(500);
                System.out.println("...");
                Thread.sleep(500);
                System.out.println("...");
                Thread.sleep(500);
                System.out.println("...");
                System.out.println("Se te ha hecho un recuento de puntos. Tus puntos totales llegan a una puntuación de: " + heroe.getPuntuacion());
                int bonusVida = heroe.getVida();
                heroe.setPuntuacion(heroe.getPuntuacion() + bonusVida);
                System.out.println("Ahora como bonus le sumaremos la vida con la que hayas terminado: " + bonusVida + ". Tu nueva puntuación total es: " + heroe.getPuntuacion());
                
                System.out.println("Si quieres consultar tu posicón visita el ranking");
                total = registrarRanking (nombres, puntos, total, heroe.getNombre(), heroe.getPuntuacion());
                if(rankingValido == true)
                {
                    guardarRanking(nombres, puntos, total);
                }
                
                aventura = false;
                mainMenu = true;
            }
            if(ranking == true)
            {
                ayuda = false;
                mainMenu = false;
                aventura = false;
                //pondremos lo del ranking cuando lo tengamos aqui;
                mostrarRanking(nombres, puntos, total);
                //aqui termina el ranking
                System.out.println("");
                System.out.println("Si quieres volver al menu principal pon SALIR. Si no, no hagas nada");
                String volver = sc.next();
                if (volver.equalsIgnoreCase("SALIR"))
                {
                    ayuda = false;
                    mainMenu = true;
                }
                else{mainMenu = false;}
            }
            if(ayuda == true)
            {
                aventura = false;
                ranking = false;

                System.out.println("== En este apartado te diremos las reglas del juego ==");
                System.out.println("");

                System.out.println("===========================================");
                System.out.println("EL JUEGO Y SU DINAMICA");
                System.out.println("===========================================");

                Thread.sleep(500);
                System.out.println("El juego esta basado en una aventura basica que tendras que recorrer y enfrentar a varios enemigos");
                System.out.println("Uno sera mas fuerte que el otro, y la dinamica esta basada en turnos (atacas tu y luego ataca el enemigo)");
                System.out.println("Algun enemigo que otro atacara de manera diferente");
                System.out.println("");
                System.out.println("Para enfrentar estas adversidades alguien te dara armas, y te podras encontrar algunas en el camino");
                System.out.println("--solo si tienes suerte--");
                System.out.println("");
                Thread.sleep(1000);
                System.out.println("===========================================");
                System.out.println("APARTADO DE RANKING");
                System.out.println("===========================================");
                System.out.println("");
                System.out.println("En el apartado de ranking tendrás tus 5 mejores partidas.");
                System.out.println("La puntuacion de las partidas se basara en los enemigos derrotados y la vida restante de tu personaje.");
                System.out.println("===========================================");
                
                System.out.println("");
                System.out.println("Si quieres volver al menu principal pon SALIR. Si no, no hagas nada");
                String volver = sc.next();
                if (volver.equalsIgnoreCase("SALIR"))
                {
                    ayuda = false;
                    mainMenu = true;
                }
                else{mainMenu = false;}
            }

        }
    }


    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||1    
    
    public static boolean simularCombate(Scanner sc, TripleT heroe, Personajes enemigo) throws InterruptedException
    {
        System.out.println("Te acabas de encontrar con un enemigo: " + enemigo.getNombre());
        if (enemigo instanceof BallerinaC)
        {
            ((BallerinaC)enemigo).Presentacion();
        }
        else if(enemigo instanceof Tralalero)
        {
            ((Tralalero)enemigo).Presentacion();
        }
        else {((Gamranma)enemigo).Presentacion();}

        System.out.println("-------Entrando en batalla-------");
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("-------------STATS ENEMIGO------------");
        System.out.println("===========================================");
        System.out.println(enemigo.getNombre() + " | " + enemigo.getVida() + "HP | " + enemigo.getDanyo() +  "damage | "  );
        System.out.println("===========================================");
        System.out.println("-------------STATS HEROE------------");
        System.out.println("===========================================");
        System.out.println(heroe.getNombre() + " | " + heroe.getVida() + " HP | " +  "(TEN EN CUENTA QUE TU DAÑO ES 10(PUÑOS) + EL ARMA.)");
        System.out.println("===========================================");
        Thread.sleep(1000);

        while (true)
        {
            boolean turnoGastado = false;
            
            while(turnoGastado == false)
            {    
                System.out.println("");
                System.out.println("Que quieres hacer?");
                System.out.println("");
                System.out.println("===========================================");
                System.out.println(" 1. Revisar Inventario (no te gastará turno)");
                System.out.println(" 2. Atacar");
                System.out.println(" 3. Curarse");
                System.out.println(" 4. Abandonar partida");
                System.out.println("===========================================");
    
                int decision = sc.nextInt();
                
                switch (decision)
                {
                    case 1:
                        System.out.println("===========================================");
                        heroe.mostrarInventario();
                        System.out.println("===========================================");
                        System.out.println("");
                    break;
                    case 2:
                        System.out.println("Con que arma (posicion de tu arma)");
                        System.out.println("===========================================");
                        heroe.mostrarArmas();
                        System.out.println("===========================================");
                        Thread.sleep(1000);
                        int posicionArma = sc.nextInt();
                        if (posicionArma >= 1 && posicionArma <= heroe.getNumArmas())
                        {
                            heroe.atacar();
                            Armas armaElegida = heroe.getArma(posicionArma - 1);
                            heroe.Atacar(enemigo, armaElegida);
                            armaElegida.usarArma();
                            turnoGastado = true;
                            break;
                        }
                        else
                        {
                            System.out.println("Ese arma no existe, atacarás con los puños");
                            heroe.Atacar(enemigo);
                            turnoGastado = true;
                        }
                    break;
                    case 3:
                        System.out.println("Que pocion quieres usar");
                        heroe.mostrarPociones();
                        int posicionPocion = sc.nextInt();

                        if(posicionPocion >= 1 && posicionPocion <= heroe.getNumPociones())
                        {
                            Pocion pocionElegida = heroe.getPocion(posicionPocion - 1);
                            if (pocionElegida.getCantidad() > 0)
                            {
                                pocionElegida.UsarPocion(heroe);
                                turnoGastado = true;
                            }
                            else
                            {
                                pocionElegida.UsarPocion(heroe);
                                turnoGastado = false;
                            }
                        }
                        else
                        {
                            System.out.println("Esa poción no existe");
                            turnoGastado = false;
                        }
                    break;
                    case 4:
                        System.out.println("No me esperaba esto de ti. Pensaba que tu, " + heroe.getNombre() + " podrias salvar a mi hija...");
                        Thread.sleep(1500);
                        System.out.println("Abandonando juego...");
                        Thread.sleep(1000);
                        return false;
                    default:
                            System.out.println("Opcion no valida");
                    break;
                }
            }
            if (!turnoGastado)
            {
                continue;
            }

            Thread.sleep(1000);

            if (!enemigo.estaVivo())
            {
                System.out.println("===========================================");
                System.out.println("Has derrotado a " + enemigo.getNombre() + "!");
                System.out.println("===========================================");
                return true;
            }

            if (enemigo.getVida() < 30)
            {
                if(enemigo instanceof BallerinaC)
                {
                    ((BallerinaC)enemigo).enfurecerse();
                }
                else if (enemigo instanceof Tralalero)
                {
                    ((Tralalero)enemigo).enfurecerse();
                }
                else {((Gamranma)enemigo).enfurecerse();}
            }

            System.out.println("===========================================");
            System.out.println("TURNO DE " + enemigo.getNombre());
            System.out.println("===========================================");
            Thread.sleep(1000);
                
            heroe.serAtacado();
            enemigo.Atacar(heroe);
            Thread.sleep(1000);

            if (!heroe.estaVivo())
            {
                
                if (enemigo instanceof BallerinaC )
                {
                    ((BallerinaC)enemigo).Victoria();
                }
                else if(enemigo instanceof Tralalero)
                {
                    ((Tralalero)enemigo).Victoria();
                }
                else{((Gamranma)enemigo).Victoria();}
                System.out.println("===========================================");
                System.out.println("Has caido en combate... GAME OVER");
                System.out.println("===========================================");
                return false;
            }
        }
    }
    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static int cargarRanking(String[] nombres, int[] puntos)
    {
        try
        {
            File archivo = new File("XML/ranking.xml");
            if (!archivo.exists())
            {
                return 0;
            }

            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            // permite el DOCTYPE pero no abre la DTD externa
            fabrica.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", true);

            DocumentBuilder constructor = fabrica.newDocumentBuilder();
            Document documento = constructor.parse(archivo);
            documento.getDocumentElement().normalize();

            NodeList lista = documento.getElementsByTagName("partida");

            if (lista.getLength() > nombres.length)
            {
                System.out.println("ranking.xml tiene más registros de los permitidos.");
                return -1;
            }

            for (int i = 0; i < lista.getLength(); i++)
            {
                Element partida = (Element) lista.item(i);

                String nombre = partida.getElementsByTagName("nombre").item(0).getTextContent();
                int puntuacion = Integer.parseInt(partida.getElementsByTagName("puntuacion").item(0).getTextContent().trim());

                if (nombre.trim().isEmpty() || puntuacion < 0)
                {
                    System.out.println("ranking.xml contiene datos incorrectos.");
                    return -1;
                }
                nombres[i] = nombre;
                puntos[i] = puntuacion;
            }
            return lista.getLength();
        }
        catch (Exception e)
        {
            System.out.println("No se pudo leer ranking.xml: " + e.getMessage());
            return -1;
        }
    }
    public static int registrarRanking(String[] nombres, int[] puntos, int total, String nombre, int puntuacion)
    {
        int pos = total;                            // por defecto, al final
        for (int i = 0; i < total; i++)
        {
            if (puntuacion > puntos[i])             // estrictamente mayor
            {
                pos = i;
                break;
            }
        }
        if (pos >= nombres.length)                  // lleno y no supera la ultima: se descarta
        {
            return total;
        }
        int nuevoTotal = total + 1;
        if (nuevoTotal > nombres.length)
        {
            nuevoTotal = nombres.length;
        }
        for (int i = nuevoTotal - 1; i > pos; i--)  // desplaza a la derecha, los dos arrays a la vez
        {
            nombres[i] = nombres[i - 1];
            puntos[i] = puntos[i - 1];
        }
        nombres[pos] = nombre;
        puntos[pos] = puntuacion;
        return nuevoTotal;
    }
    public static void mostrarRanking(String[] nombres, int[] puntos, int total)
    {
        if(total == 0)
            {
                System.out.println("Todavia no hay partidas en el ranking.");
                return;
            }
            for(int i = 0; i < total; i++)
            {
                System.out.println((i + 1) + ". " + nombres[i] + " | " + puntos[i]);
            }
    }

    public static boolean guardarRanking(String[] nombres, int[] puntos, int total)
    {
        try
        {
            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructor = fabrica.newDocumentBuilder();
            Document documento = constructor.newDocument();

            Element raiz = documento.createElement("ranking");
            documento.appendChild(raiz);

            for (int i = 0; i < total; i++)
            {
                Element partida = documento.createElement("partida");
                partida.setAttribute("id", String.valueOf(i + 1));
                raiz.appendChild(partida);

                Element nombre = documento.createElement("nombre");
                nombre.setTextContent(nombres[i]);
                partida.appendChild(nombre);

                Element puntuacion = documento.createElement("puntuacion");
                puntuacion.setTextContent(String.valueOf(puntos[i]));
                partida.appendChild(puntuacion);
            }
            File archivoDestino = new File("XML/ranking.xml");

            TransformerFactory transformerFabrica = TransformerFactory.newInstance();
            Transformer transformer = transformerFabrica.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "ranking.dtd");  // asocia la DTD

            transformer.transform(new DOMSource(documento), new StreamResult(archivoDestino));
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Error guardando el ranking: " + e.getMessage());
            return false;
        }
    }
}