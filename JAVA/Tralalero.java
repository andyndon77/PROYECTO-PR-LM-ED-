package JAVA;

class Tralalero extends Personajes implements IEnemigos
{
    public Tralalero(String nombre, int vida, int danyo, int numAtaque)
    {
        super(nombre, vida, danyo, numAtaque);
        setVida(40);
        setNumAtaque(1);
        setDanyo(20);
    }

    public void Presentacion()
    {
        System.out.println("Quien eres tu. Me da rabia el tan solo verte.");
        System.out.println("Te tendre que dar una paliza para quedarme tranquilo.");
    }

    public void Derrotado(Personajes TripleT)
    {
        System.out.println("AAaAhhhhh, me las pagaras" + TripleT.getNombre() + ". No vas a poder vencer a Ballerina, ella es mas fuerte q yo.");
    }

    public void enfurecerse()
    {
        System.out.println("AAAAAAAHHHHHHHHHH");
        System.out.println("Te vas a enterar bastardo.");
    }

    public void Victoria()
    {
        System.out.println("JA JA JA JA JA JA. Vuelvelo a intentar en otra vida.");
    }
}
    

