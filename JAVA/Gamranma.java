public class Gamranma extends Personajes implements IEnemigos
{

    public Gamranma(String nombre, int vida, int danyo, int numAtaque, boolean estaVivo)
    {
        super(nombre, vida, danyo, numAtaque);
    }

    public void Presentacion()
    {
        System.out.println("Muchacho veo que has llegado lejos");
        System.out.println("Estaba en busca de un verdadero rival");
        System.out.println("Y parece que acabo de encontrar a la persona que buscaba");

    }
    public void Derrotado(Personajes TripleT)
    {
        System.out.println("Sabian yo que tu eras el indicado, " +TripleT.getNombre() + ", siempre lo supe");
    }
    public void enfurecerse()
    {
        System.out.println("Yo sabía que tu no eras como los demás");
        System.out.println("Sigamos con la batalla");
    }
    
    public void Victoria()
    {
        System.out.println("Al fin y al cabo, parece que no eras digno de enfrentarte a mi.");
        System.out.println("");
        System.out.println("Espero que el proximo a---ntu-r--o sea mucho más.... ");
        
    }
    
}
