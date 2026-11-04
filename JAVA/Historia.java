package JAVA;
import java.util.Scanner;
import java.util.Random;

public class Historia {
    public static void main(String[] args) throws InterruptedException  //agregamos esta cosa final para que los mensajes no aparezcan todos de golpe
    {
        int max = 100;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hola buenos días nuevo aventurero. ¿A donde quieres ir ahora?:" + " 1.Nueva partida " + " 2.Ranking " + " 3.Ayuda" + " 4.Salir del juego ");
        int respuesta = sc.nextInt();

        boolean aventura = false;
        
        switch(respuesta)
        {
            case 1: System.out.println("Comenzando historia...");
                Thread.sleep(1000); 
                System.out.println("Vamos a comenzar la historia. ");
                aventura = true;
                break;
            case 2: System.out.println("Bienvenido al apartado de Ranking. Aqui veras las 5 mejores puntuaciones de tus partidas anteriores.");
                break;
            case 3: System.out.println("Si estas aqui es porque necesitas ayuda. Aqui se te mostraran las reglas del juego junto con las acciones posibles durante la partida. ");
                break;
            case 4: System.out.println("Gracias por haber visitado el juego. Nos veremos en otro momento aventurero");
                break;
        }   
        while(aventura == true)
        {
            System.out.println("Veo que has decidio comenzar una historia nueva");
            System.out.println("Una no muy sabia elección aventurero, esto puede ser algo complicado dependiendo de la suerte que tengas.");
            System.out.println("");
            Thread.sleep(2000); 

            System.out.print("Dime con que nombre te quieres registrar: ");
            Thread.sleep(1000); 
            String nombre = sc.next();

            System.out.println(" ");
            System.out.println("Bienvenido " + nombre + " . Puedes llamarme Aleister y te voy a acompañar en tu nueva aventura");
            TripleT heroe = new TripleT(nombre, 100, 10, 1, 0);
            heroe.setNombre(nombre);

            System.out.println("Vamos a mi casa " + nombre + ". Alli te explicaré la situación.");
            System.out.println("De camino...");
            Thread.sleep(2000);
            int posible_Arma1 = random.nextInt(max);
                if (posible_Arma1 > 80)
                    {
                        System.out.println("*Te tropiezas");
                        Bate bate = new Bate(1, "Bate de Madera", 15, 7);
                        System.out.println("!!Te has encontrado un bate!!");
                        bate.mostrarStats();
                    }
            System.out.println("");

            heroe.caminar();
            
            System.out.println("Esta es mi casa, entra sin miedo");

            

        }

       sc.close();
    }
    public void Combate(String nombre, String enemigo)
    {
        
    }
}
