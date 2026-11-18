import java.util.Random;
public class Gamranma extends Personajes implements IEnemigos
{
    Random rd = new Random(100);

    public Gamranma(String nombre, int vida, int danyo, int numAtaque)
    {
        super(nombre, vida, danyo, numAtaque);
    }

    public void Presentacion()
    {
        System.out.println(getNombre() + ": Muchacho veo que has llegado lejos");
        System.out.println(getNombre() + ": Estaba en busca de un verdadero rival");
        System.out.println(getNombre() + ": Y parece que acabo de encontrar a la persona que buscaba");

    }
    public void Derrotado(Personajes TripleT)
    {
        System.out.println(getNombre() + ": Sabia yo que tu eras el indicado, " + TripleT.getNombre() + ", siempre lo supe");
    }
    public void enfurecerse()
    {
        System.out.println(getNombre() + ": Yo sabía que tu no eras como los demás");
        System.out.println(getNombre() + ": Sigamos con la batalla");
    }
    
    public void Victoria()
    {
        System.out.println(getNombre() + ": Al fin y al cabo, parece que no eras digno de enfrentarte a mi.");
        System.out.println("");
        System.out.println(getNombre() + ": Espero que el proximo a---ntu-r--o sea mucho más.... ");
        
    }
    public int specialAttack()
    {
        int specialAttack = rd.nextInt(100) + 1;
        if(specialAttack > 80)
            {
                System.out.println("Gamranma salta 100 metros y te cae encima");
                setDanyo(40);
                return getDanyo();
            }
            return getDanyo();
    }
    @Override 
    public int Atacar(Personajes objetivo)
    {
        specialAttack();
        return super.Atacar(objetivo);
    }
    
}
