
import java.util.Scanner;
import java.util.Random;

public class Historia 
{
    public static void main(String[] args) throws InterruptedException  //agregamos esta cosa final para que los mensajes no aparezcan todos de golpe
    {

        int max = 100;
        boolean mainMenu = true;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
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
                System.out.println("Bienvenido " + nombre + " . Puedes llamarme Aleister y te voy a acompañar en tu nueva aventura");
                TripleT heroe = new TripleT(nombre, 100, 10, 1, 0,true );
                heroe.setNombre(nombre);

                System.out.println("Vamos a mi casa " + nombre + ". Alli te explicaré la situación.");
                Thread.sleep(2000);
                System.out.println("De camino...");
                Thread.sleep(2000);
                int posible_Arma1 = random.nextInt(max);
                    if (posible_Arma1 > 60)
                    {
                        System.out.println("*Te tropiezas");
                        Bate bate = new Bate("Bate de Madera", 10, 7, 3);
                        System.out.println("!!Te has encontrado un bate!!");

                        System.out.println("-----------------------------------------");
                        bate.mostrarStats();
                        System.out.println("-----------------------------------------");

                        Thread.sleep(2000);
                            
                        System.out.println("-----------------------------------------");
                        bate.Descripcion();
                        System.out.println("-----------------------------------------");

                        Thread.sleep(2500);
                            
                        System.out.println("Hey chico, este bate no es nada malo." + " Aunque parece q no te durara mucho, en caso de que se te rompa siempre puedes usar los puños.");
                        System.out.println("JA JA JA JA JA JA");
                        heroe.añadirArma(bate);
                        Thread.sleep(2000);
                    }
                System.out.println("");
                Thread.sleep(2000);
                heroe.caminar();
                
                Thread.sleep(2000);

                System.out.println("Esta es mi casa, entra sin miedo");
                
                Thread.sleep(1500);
                
                System.out.println("Unos seres malvados y fuertes me robaron a mi hija. Por favor, rescátala, yo no tengo la fuerza para hacerlo...");
                Thread.sleep(2000);
                System.out.println("===========================================");
                System.out.println("TU: Pero no tengo equipo ni nada. ¿Que se supone que haga?");
                System.out.println("===========================================");
                Thread.sleep(2000);

                System.out.println("No te preocupes por eso. Tengo cosas que te servirán en tu camino.");
                
                Thread.sleep(1500);
                System.out.println("En caso de q no tengas nada con lo que atacar te puedo dejar un cuchillo");
                Armas cuchillo = new Armas("Cuchillo de cocina", 5, 8);
                heroe.añadirArma(cuchillo);
                Thread.sleep(1000);

                System.out.println("Toma 3 pociones de curacion. Y una superpocion.");
                Pocion pocionNormal = new Pocion(25, 3);
                heroe.añadirPocion(pocionNormal);
                System.out.println("===========================================");
                pocionNormal.MostrarPocion();
                System.out.println("===========================================");
                Thread.sleep(3000);

                System.out.println("");
                Pocion pocionSuper = new Pocion(40, 1);
                heroe.añadirPocion(pocionSuper);
                System.out.println("===========================================");
                pocionSuper.MostrarPocion();
                System.out.println("===========================================");
                Thread.sleep(3000);

                System.out.println("");
                System.out.println("Con esto ya estas listo");
                Thread.sleep(500);
                System.out.println("Casi se me olvida, toma una mochila para que guardes tus cosas.");
                Thread.sleep(1500);
                System.out.println("");

                System.out.println("Venga guardatelo todo y ponte en marcha");

                Thread.sleep(2000);

                System.out.println("===========================================");
                System.out.println("Tu: Juro que traere de vuelta a tu hija Aleister.");
                System.out.println("===========================================");

                System.out.println("No me jures nada, yo voy a acompañarte en tu viaje. Mejor muestramelo.");
                
                heroe.caminar();
                Thread.sleep(2000);
                heroe.caminar();

                Thread.sleep(2000);
                System.out.println("¡¡¡¡¡¡¡¡¡CUIDADO!!!!!!!!");
                System.out.println("===================================================================");
                //PRIMERA BATALLA
                Tralalero tralarero = new Tralalero("Tralalero",40, 15, 1);
                simularCombate(sc, heroe, tralarero);

                

                //SEGUNDA BATALLA
                System.out.println("¡¡¡¡¡¡¡¡¡CUIDADO!!!!!!!!");
                System.out.println("===================================================================");
                BallerinaC ballerina = new BallerinaC("Ballerina", 60, 10, 1);
                simularCombate(sc, heroe, ballerina);
                
                //TERCERA BATALLA
                System.out.println("¡¡¡¡¡¡¡¡¡CUIDADO!!!!!!!!");
            }
            if(ranking == true)
            {
                ayuda = false;
                mainMenu = false;
                aventura = false;
                //pondremos lo del ranking cuando lo tengamos aqui;

                //aqui termina el ranking
                System.out.println("");
                System.out.println("Si quieres volver al menu principal pon SALIR. Si no, no hagas nada");
                String volver = sc.next();
                if (volver.equals("SALIR"))
                if (volver.equals("SALIR"))
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
        //--------------------------------------------------------------------------------------    
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
        //else {((Garama)enemigo).Presentacion;}
        System.out.println("-------Entrando en batalla-------");
        Thread.sleep(1000);

        while (true)
        {
            System.out.println("-------------STATS ENEMIGO------------");
            System.out.println(enemigo.getNombre() + " | " + enemigo.getVida() + "HP | " + enemigo.getDanyo() +  "damage | "  );
            System.out.println("Que quieres hacer?");
            System.out.println(" 1. Revisar Inventario (no te gastará turno)");
            System.out.println(" 2. Atacar");
            System.out.println(" 3. Curarse");
            System.out.println(" 4. Abandonar partida");

            int decision = sc.nextInt();
            boolean turnoGastado = false;
            while(turnoGastado == false)
            {
                switch (decision)
                {
                    case 1:
                        heroe.mostrarInventario();
                    case 2:
                        System.out.println("Con que arma (posicion de tu arma)");
                        heroe.mostrarArmas();
                        int posicionArma = sc.nextInt();
                        if (posicionArma >= 1 && posicionArma <= heroe.getNumArmas())
                            {
                                Armas armaElegida = heroe.getArma(posicionArma - 1);
                                heroe.Atacar(enemigo, armaElegida);
                                armaElegida.usarArma();
                                heroe.atacar();
                                turnoGastado = true;
                            }
                            else
                            {
                                System.out.println("Ese arma no existe, atacarás con los puños");
                                heroe.Atacar(enemigo);
                                turnoGastado = true;
                            }
                    case 3:
                        System.out.println("Que pocion quieres usar");
                        heroe.mostrarPociones();
                        int posicionPocion = sc.nextInt();
                        
                        if(posicionPocion >= 1 && posicionPocion <= heroe.getNumPociones())
                        {
                            Pocion pocionElegida = heroe.getPocion(posicionPocion - 1);
                            pocionElegida.MostrarPocion();

                            pocionElegida.UsarPocion(heroe);
                            turnoGastado = true;
                        }
                    break;
                    case 4:
                        System.out.println("No me esperaba esto de ti. Pensaba que tu, " + heroe.getNombre() + " podrias salvar a mi hija...");
                        Thread.sleep(1500);
                        System.out.println("Abandonando juego...");
                        Thread.sleep(1000);
                        return false;
                }        
            }

            Thread.sleep(1000);
            while(turnoGastado == true)
            {
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
                    //else {((Gamranma)enemigo).enfurecerse();}
                }

                System.out.println("===========================================");
                System.out.println("TURNO DE " + enemigo.getNombre());
                System.out.println("===========================================");
                Thread.sleep(1000);
                
                enemigo.Atacar(heroe);
                heroe.serAtacado();
                turnoGastado = false;
            }
            
            System.out.println(enemigo.getNombre() + " te hace " + enemigo.getDanyo() + " de daño.");

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
                //else{(Gamranma)enemigo).Victoria();}
                System.out.println("===========================================");
                System.out.println("Has caido en combate... GAME OVER");
                System.out.println("===========================================");
                return false;
            }
        }
    }
}
