class Tralalero extends Personajes implements IEnemigos
{
    public Tralalero(String nombre, int vida, int danyo, int numAtaque)
    {
        super(nombre, vida, danyo, numAtaque);
    }

    public void Presentacion()
    {
        System.out.println(getNombre() + ": Quien eres tu. Me da rabia el tan solo verte.");
        System.out.println(getNombre() + ": Te tendre que dar una paliza para quedarme tranquilo.");
    }

    public void Derrotado(Personajes TripleT)
    {
        System.out.println(getNombre() + "AAaAhhhhh, me las pagaras" + TripleT.getNombre() + ". No vas a poder vencer a Ballerina, ella es mas fuerte q yo.");
    }

    public void enfurecerse()
    {
        System.out.println(getNombre() + ": AAAAAAAHHHHHHHHHH");
        System.out.println(getNombre() + ": Te vas a enterar bastardo.");
    }

    public void Victoria()
    {
        System.out.println(getNombre() + ": JA JA JA JA JA JA. Vuelvelo a intentar en otra vida.");
    }
}
    

