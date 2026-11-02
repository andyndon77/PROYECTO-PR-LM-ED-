package JAVA;

class TripleT extends Personajes
{
    public TripleT(String nombre, int vida, int danyo, int numAtaque, int numArmas)
    {
        super(nombre, vida, danyo, numAtaque, numArmas);
        setDanyo(10);
    }
}